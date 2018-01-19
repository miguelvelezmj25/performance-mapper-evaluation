package PathVisitor;
import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import verificationClasses.*;

import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.solver.Solver;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import configurationGeneration.*;

public class MainVisitor {
	public static PathTree visitingTree = null; 
	public static HashMap<String, Double> feature_values = new HashMap<String, Double>(); //current run
	public static HashMap<String, Double> feature_values_all_runs = new HashMap<String, Double>(); // all runs
	public static int currentProject = 0;
	public static HashMap<Integer, String> pathToProject = new HashMap<Integer, String>();
	public static String executionPath = "";
	public static ArrayList<HashMap<String, Double>> measurement_runs = new ArrayList<HashMap<String,Double>>(); 
	public static String featureNotMeasured = "";
	public static String featureToTurnOff = "";
	/**
	 * @param args 0 = class file to start the other app
	 * 1 = allFeatures.exp
	 */
	public static void main(String[] args) throws IOException, InterruptedException{
		pathToProject.put(1, "/../MicroBenchSimulator/");
		pathToProject.put(2, "/../AJstatsSimulator/");
		pathToProject.put(3, "/../ElevatorSimulator/");
		pathToProject.put(4, "/../ZipMeSimulator/");
		
		if(args.length == 0)
			return;
		currentProject = Integer.parseInt(args[0]);
		File currentDirectory = new File(new File(".").getAbsolutePath());
		executionPath = currentDirectory.getCanonicalPath() + pathToProject.get(currentProject);
		
		//FeatureModelParser fmp = new FeatureModelParser(new FeatureModelScanner(new StringReader(readFM())));
		//String app = "";
		//String cp = "./;C:/Workspace/FamilyBaseMeasurement/Repository/MeasurementAspect/lib/aspectjrt.jar;./../../lib/xstream-1.4.4.jar;./../../lib/junit-4.11.jar;./../../lib/jpf-classes.jar;./../../lib/jpf-bdd-annotations.jar;./../../lib/java-cup-11a.jar;./../../lib/choco-solver-2.1.4.jar;";
		//String cp2 = "./;C:/Workspace/FamilyBaseMeasurement/Repository/MeasurementAspect/bin/;C:/Workspace/FamilyBaseMeasurement/Repository/MeasurementAspect/lib/aspectjrt.jar;C:/Workspace/FamilyBaseMeasurement/Repository/MeasurementAspect/lib/xstream-1.4.4.jar;C:/Workspace/FamilyBaseMeasurement/Repository/MeasurementAspect/lib/junit-4.11.jar;C:/Workspace/FamilyBaseMeasurement/Repository/MeasurementAspect/lib/jpf-classes.jar;C:/Workspace/FamilyBaseMeasurement/Repository/MeasurementAspect/lib/jpf-bdd-annotations.jar;C:/Workspace/FamilyBaseMeasurement/Repository/MeasurementAspect/lib/java-cup-11a.jar;C:/Workspace/FamilyBaseMeasurement/Repository/MeasurementAspect/lib/choco-solver-2.1.4.jar;";
		
		
		boolean allPathsVisited = false;
		boolean firstrun = true;
		while(true)
		{
			String featureToSwitch ="";
			if(!firstrun){
				readPath();
				//allPathsVisited = checkForAllVisits();
				featureToSwitch = determineFeatureToSwitch();
				
				if(featureToSwitch == null)
				{
					printFinalresults();
					return;
				}
				System.out.println("======================================");
				System.out.println("Feature not measured: " + featureToSwitch + " . Checking consistency: " + featureNotMeasured);
				System.out.println("Feature to be turned off: " + featureToTurnOff);
				System.out.println("======================================");
				writeFeatureSwitchFile(featureToTurnOff);
			}
			else
				firstrun = false;
			
			int counter = 2;
			for(int i = counter; i > 0; i--){
				ProcessBuilder pb = new ProcessBuilder(executionPath + "start.bat");
				//System.out.println(executionPath  + "start.bat");
				pb.redirectErrorStream(true);
				Process p = pb.start();
				//Process p = Runtime.getRuntime().exec(executionPath + "start.bat");
								
				InputStream stderr = p.getErrorStream();
				InputStream stdin = p.getInputStream();
		        InputStreamReader isr = new InputStreamReader(stderr);
		        InputStreamReader in = new InputStreamReader(stdin);
		        BufferedReader br = new BufferedReader(isr);
		        BufferedReader br2 = new BufferedReader(in);
		        String line = null;
		        String line2 = null;
		        byte[] buffer = new byte[1024];
		        InputStream in2 = p.getInputStream();
		    	while (true) {
		    		
		    		int r = in2.read(buffer);
		    		if (r <= 0) {
		    			break;
		    		}
		    		System.out.write(buffer, 0, r);
		    		//if((line = br.readLine()) != null)
		    	//		System.out.println("Error: " + line);
		    	}
		       /* while ( (line = br.readLine()) != null)// ||  (line2 = br2.readLine()) != null)
		             {
		        	if(line != null)
		        		System.out.println("Error: " + line);
		             }
		        	//if(line2 != null)
		        		//System.out.println(line2);
*/
				if(p.waitFor() != 0)
					return;
				readMeasurements();
			}
		    computeAverage(counter);
		    mergeMeasurementsOfAllRuns(featureToSwitch);
		}

	}
	
	private static void writeFeatureSwitchFile(String featureToTurnOff2) {
		
		FileWriter sw = null;
		try {
			sw = new FileWriter(executionPath + "featureSwitch.txt");
			sw.write(featureToTurnOff2);
		} catch (IOException e) {

		} finally {
			try {
				sw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	private static String determineFeatureToSwitch() {
		Path n = visitingTree.root;
		for(int i = 0; i < visitingTree.root.children.size(); i++)
		{
			String feature = findFeature(visitingTree.root.children.get(i));
			if(feature != null)
				return feature;
		}
		return null;
	}

	private static String findFeature(Path node) {
		if(node.elseFeature.equals("featureSwitch") == false && feature_values_all_runs.containsKey(node.elseFeature) == false)
			{
				featureNotMeasured = node.elseFeature;
				featureToTurnOff = node.thenFeature;
				return node.elseFeature;
			}
		for (int i = 0; i < node.children.size(); i++) {
			String f = findFeature(node.children.get(i));
			if(f != null) {
				return f;
			}
		}
		return null;
	}



	private static String readFM() {
		StringBuilder sb = new StringBuilder();
		FileInputStream fis = null;
		InputStreamReader in = null;
		BufferedReader br = null;
		int counter = 0;
		try {
			fis = new FileInputStream("model.cnf"); 
			in = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(in);
			String line;
			
			while((line = br.readLine()) != null){
				sb.append(line);
			}
		} catch (IOException e) {
			System.out.println("no feature model found!");
		} finally {
			try {
				br.close();
				in.close();
				fis.close();
			} catch (IOException e2) {
				
			}
		}
		return sb.toString();
	}

	private static String determineFeatureToSwitch(FeatureModelParser fmp) {
		Constraint modelConstraints = null;
		// parsing happens here
		try {
			modelConstraints = (Constraint) fmp.parse().value;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Could not parse feature model.");
		}

		// evaluation
		Model m = new CPModel();
		m.addConstraint(modelConstraints);
		Solver solver;
		solver = new CPSolver();
		solver.read(m);
		solver.generateSearchStrategy();

		int solutions = 0;
		solver.solve();
		if (solver.isFeasible()) {
			do {
				solutions++;
				System.out.println(solver.solutionToString());
			} while (solver.nextSolution());
		}
		return null;
	}

	private static void mergeMeasurementsOfAllRuns(String featureToSwitch) {
		Iterator<String> it = feature_values.keySet().iterator();
		while(it.hasNext()){
			String currentFeature = it.next();
			if(feature_values_all_runs.containsKey(currentFeature) == false){
				feature_values_all_runs.put(currentFeature, feature_values.get(currentFeature));
			} else
			{//There is already a measurement... so what to do? taking average? keep existing? consider both somehow?
				//Current solution: if execution time is no more than 10% different, no warning and build average. otherwise, produce warning
				double old =  feature_values_all_runs.get(currentFeature);
				double newValue = feature_values.get(currentFeature);
				double diff = (newValue * 100) / old;
				if( diff > 110 || diff < 90)
				{
					System.out.println("Warning! Detected different execution time for already measured feature term: " + currentFeature + " old value: " + old + " new value: " + newValue + " change may due to feature: " + featureToSwitch);
					System.out.println("Current solution is do nothing. Other solution would be to create new feature interaction.");
				}
				else {
					newValue += old;
					newValue = newValue / 2;
					 feature_values_all_runs.put(currentFeature, newValue);
				}
			}
		}
		
		
	}

	private static void printFinalresults() {
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = feature_values_all_runs.keySet().iterator();
		while(it.hasNext()){
			String feature = it.next();
			double time = feature_values.get(feature);
			sb.append(feature + "<" + time + ">; ");
		}
		System.out.println(sb.toString());
		writeToFile(sb.toString());
	}

	private static void readMeasurements() {
		FileInputStream fis = null;
		InputStreamReader in = null;
		BufferedReader br = null;
		int counter = 0;
		try {
			fis = new FileInputStream(executionPath+"measurement.txt"); 
			in = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(in);
			String line;
			
			while((line = br.readLine()) != null){
				counter++;
				addMeasurements(line);
			}
			
		} catch (IOException e) {
			} finally {
				try {
					if(br!=null)
						br.close();
					if(in!=null)
						in.close();
					if(fis!=null)
						fis.close();
				} catch (IOException e2) {
					
				}
			}
		//computeAverage(counter);
	}

	private static void computeAverage(int counter) {
		feature_values.clear();
		for (int i = 0; i < measurement_runs.size(); i++) {
			Iterator<String> it = measurement_runs.get(i).keySet().iterator();
			while(it.hasNext()){
				String feature = it.next();
				if(feature_values.containsKey(feature))
					feature_values.put(feature,feature_values.get(feature) + measurement_runs.get(i).get(feature));
				else
					feature_values.put(feature,measurement_runs.get(i).get(feature));
			}
		}
		
		Iterator<String> it = feature_values.keySet().iterator();
		while(it.hasNext()){
			String feature = it.next();
			feature_values.put(feature, (feature_values.get(feature) / measurement_runs.size()));
		}
	}

	private static void addMeasurements(String line) {
		String[] feature_terms = line.split(";");
		HashMap<String, Double> tempvalues = new HashMap<String, Double>();
		for (int i = 0; i < feature_terms.length; i++) {
			//position of <
			if( feature_terms[i].trim().length() == 0)
				continue;
			int pos1 = feature_terms[i].indexOf('<');
			String feature = feature_terms[i].substring(0,pos1).trim();
			int pos2 = feature_terms[i].length() - pos1-1;
			Double time =  Double.parseDouble(feature_terms[i].substring(pos1+1, feature_terms[i].length()-1));
			tempvalues.put(feature, time);
		}
		measurement_runs.add(tempvalues);
	}
	private static void writeToFile(String string) {
		FileWriter sw = null;
		try {
			sw = new FileWriter("performance_model.txt");
			sw.write(string);
		} catch (IOException e) {

		} finally {
			try {
				sw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	private static void readPath()
	{
		XStream xstream = new XStream(new DomDriver());
		 BufferedReader reader = null;
		 StringBuilder  stringBuilder = null;
		try {
			//System.out.println(currentDirectory.getCanonicalPath());
			 reader = new BufferedReader( new FileReader (executionPath + "visitedPath.xml"));
			    String         line = null;
			    stringBuilder = new StringBuilder();
			    String         ls = System.getProperty("line.separator");

			    while( ( line = reader.readLine() ) != null ) {
			        stringBuilder.append( line );
			        stringBuilder.append( ls );
			    }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(reader != null)
					reader.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
		visitingTree = (PathTree)xstream.fromXML(stringBuilder.toString());
		
	}
	
	
	private static boolean checkForAllVisits() {
		Path n = visitingTree.root;
		for(int i = 0; i < visitingTree.root.children.size(); i++)
		{
			if(traverse(visitingTree.root.children.get(i)) == false)
				return false;
		}
		return true;
	}

	private static boolean traverse(Path node) {
		if(node.allChildsVisited == true)
			return true;
		boolean childsvisited = true;
		for (int i = 0; i < node.children.size(); i++) {
			if(traverse(node.children.get(i)) == false) {
				childsvisited = false;
				break;
			}
		}
		if(childsvisited)
			node.allChildsVisited = true;
		return childsvisited;

	}

}
