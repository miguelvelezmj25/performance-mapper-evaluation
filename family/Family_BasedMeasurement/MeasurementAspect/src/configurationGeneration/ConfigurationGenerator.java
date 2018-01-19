package configurationGeneration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import other.VerificationFrameworkException;


import choco.Choco;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;


public class ConfigurationGenerator {

	private File targetFeatureFile;
	List<String> allFeatures;
	
	private int numberOfProducts;
	private int current = 0;
	
	Solver solver;
	HashMap<String, IntegerVariable> modeledFeatures;
	
	public ConfigurationGenerator(File allFeaturesFile, File featureModelFile, File targetFeatureFile) throws FileNotFoundException, VerificationFrameworkException {
		super();
		this.targetFeatureFile = targetFeatureFile;
		
		FeatureModelParser p = new FeatureModelParser(new FeatureModelScanner(new FileReader(featureModelFile)));
		
		Constraint modelConstraints;
		try {
			modelConstraints = (Constraint) p.parse().value;
		} catch (Exception e) {
			throw new VerificationFrameworkException("Error during parse process of FeatureModel", e);
		}
		Model m = new CPModel();
		m.addConstraint(modelConstraints);
		
		modeledFeatures = p.vars;
		
		allFeatures = getFeatureList(allFeaturesFile);
		for (String feature : allFeatures) {
			if (! modeledFeatures.containsKey(feature)) {
				IntegerVariable var = Choco.makeBooleanVar(feature);
				Constraint c = Choco.or(Choco.eq(0, var), Choco.eq(1, var));
				m.addConstraint(c);
				modeledFeatures.put(feature, var);
			}
		}
		solver = new CPSolver();
		solver.read(m);
		// get number of solutions
		solver.solveAll();
		if (! solver.isFeasible()) {
			throw new VerificationFrameworkException("This Productline has no valid Products");
		}
		numberOfProducts = solver.getSolutionCount();
		System.out.println("This Productline has " + numberOfProducts + " feasible products.");
		// do the work again and stop after first step
		solver = new CPSolver();
		solver.read(m);
		solver.solve();
	}
		
	public boolean hasNext() {
		return current < numberOfProducts;
	}
	
	public String getCurrent() {
		return String.valueOf(current);
	}
	
	public int getCurrentAsInt() {
		return current;
	}

	public String getCurrentProgress() {
		return (current) + "/" + numberOfProducts;
	}

	public void writeNext() throws IOException, VerificationFrameworkException {
		// if current == 0 this is the first solution. -> no advance
		if (current > 0) 
			solver.nextSolution();
		other.Util.writeFile(targetFeatureFile, getCurrentFeatureInfo().replaceAll(":", "\n"));
		current++;
	}
	
	public String getCurrentFeatureInfo() throws VerificationFrameworkException {
		StringBuilder sb = new StringBuilder();
		for (String feature : allFeatures) {
			IntegerVariable fv = modeledFeatures.get(feature);
			if (fv == null) throw new VerificationFrameworkException("feature " +  feature + " not modeled!");
			if (solver.getVar(fv).getVal() == 1) {
				sb.append(":"+feature);
			}
		}
		if (sb.length() > 1) {
			return sb.substring(1);
		} else {
			return "";
		}
	}
	public List<String> getCurrentFeatureInfoAsList() throws VerificationFrameworkException {
		List<String> features = new ArrayList<String>();
		for (String feature : allFeatures) {
			IntegerVariable fv = modeledFeatures.get(feature);
			if (fv == null) throw new VerificationFrameworkException("feature " +  feature + " not modeled!");
			if (solver.getVar(fv).getVal() == 1) {
				features.add(feature);
			}
		}
		return features;
	}
	
	private static List<String> getFeatureList(File featureDefinition) throws VerificationFrameworkException {
		BufferedReader r = null;
		try {
			List<String> features = new ArrayList<String>();
			r = new BufferedReader(new FileReader(featureDefinition));
			while (r.ready()) {
				String line = r.readLine();
				if (line != null)
					features.add(line.trim());
			}
			return features;
		} catch (IOException e) {
			throw new VerificationFrameworkException("IOException during parse of " + featureDefinition , e);
		} finally {
			try {
				if (r != null) r.close();
			} catch (IOException e) {}
		}
	}
}
