package verificationClasses;

import java.util.*;
import java.io.*;

public class PerformanceProfiler {
	public static HashMap<String,Double> feature_Values = new HashMap<String,Double>();
	public static List<String> currentFeatures = new ArrayList<String>();
	public static double timeInFeature = 0;
	public static Tree<Measurement> currentTree= null;
	static Node<Measurement> currentNode = null;
	public static double measurementTime = 0; 
	
	public static void startMeasurement()
	{
		Measurement data = new Measurement("base", 0);
		currentTree = new Tree<Measurement>(data);
		currentNode = currentTree.root;
		measurementTime = (double)System.nanoTime() / 1000;
	}

	public static void enteringFeature(String feature)
	{
		if(currentTree == null)
		{
			Measurement data = new Measurement(feature, 0);
			currentTree = new Tree<Measurement>(data);
			currentNode = currentTree.root;
		}
		else
		{
			Node<Measurement> newNode = new Node<Measurement>();
			Measurement data = new Measurement(feature, 0);
			newNode.data = data;
			currentNode.addChild(newNode);
			currentNode = newNode;
		}
		//currentFeatures.add(feature);
		
	}
	public static void add(String feature, long timeL)
	{
		Double time = (double)timeL;
		time = time / 1000;//da input in ns, aber nur ms gebraucht werden
		add(feature, time);
	}
	public static void add(String feature, double time)
	{
		currentNode.data.value = time;
		if(currentNode.parent == null)
		{//root -> at the end of measurement
			
			traverseTree();
			currentNode = null;
			currentTree = null;
			return;
		}
		currentNode = currentNode.parent;
	}
	public static void add_old(String feature, long timeL)
	{
		Double time = (double)timeL;
		time = time / 1000;//da input in ns, aber nur ms gebraucht werden
		double tempTime = timeInFeature;//Sichern der Zeit, die man im geschachtelten Feature verbracht hat
		timeInFeature = time; //Da Time gleich der Zeit ist, die man selber + in geschachtelten Features verbracht hat, setzen wir dies für übergeordnete Features
		String featureInteraction = "";
		if(currentFeatures.size() > 1)
		{
			time = time - tempTime; //Tatsächlich verbrachte Zeit des Features ist ja Featurezeit minus der Zeit in verschachtelten Features
			for(int i = 0; i < currentFeatures.size(); i ++)
			{
				featureInteraction += currentFeatures.get(i);
				if((i+1) < currentFeatures.size())
					featureInteraction += "#";
			}
			feature = featureInteraction;
		}
		else
		{
			timeInFeature = 0; //Falls nun keine verschachtelten Features mehr vorhanden sind
		}
		if(time < 0)
		{
			System.out.println(feature + " " + time);
		}
		
		if(feature_Values.containsKey(feature))
			feature_Values.put(feature, feature_Values.get(feature)+ (time));
		else
			feature_Values.put(feature, time);
		
		currentFeatures.remove(currentFeatures.size()-1);
	}
	
	public static double traverse(Node<Measurement> node, String featureNamesOnPath)
	{
		double currentValue = 0;
		String feature = "";
		if(featureNamesOnPath.length() == 0)
			feature = node.data.feature;
		else
			feature = featureNamesOnPath+"#"+node.data.feature;
		if(node == currentTree.root)
			feature = "";
		for (int i = 0; i < node.children.size(); i++) {
			currentValue += traverse(node.children.get(i),feature);
		}
		
		currentValue = node.data.value - currentValue;
		
		if(node == currentTree.root)
			feature = node.data.feature;
		//Eintragen des Featurewertes
		if(feature_Values.containsKey(feature))
			feature_Values.put(feature, feature_Values.get(feature)+ (currentValue));
		else
			feature_Values.put(feature, currentValue);
		
		return currentValue;
	}
	
	public static void traverseTree()
	{
		Node<Measurement> root = currentTree.root;
		traverse(root, "");
	}
	
	public static void printChoiceCalculus(String path)
	{
		Double time = (double)System.nanoTime();
		time = time / 1000;
		time = time - measurementTime;
		add("base",time);
		StringBuilder sb = new StringBuilder();
		Iterator<String> iter = feature_Values.keySet().iterator();
		while(iter.hasNext())
		{
			String feature = iter.next();
			Double time2 = feature_Values.get(feature); // in ms
			sb.append(feature + "<" + time2.intValue() + ",0>, ");
		}
		
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			bw.write(sb.toString());
			bw.close();
		}
		catch (Exception e) {
			return;
		}
	}
}
