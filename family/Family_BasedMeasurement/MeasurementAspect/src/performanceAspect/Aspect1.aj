package performanceAspect;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import org.aspectj.lang.reflect.*;
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import verificationClasses.*;

@Aspect
public class Aspect1 {
	Stack<String> features = new Stack<String>();
	HashMap<String,Long> times = new HashMap<String,Long>();
	StringBuilder sb = new StringBuilder("0");
	StringBuilder sb2 = new StringBuilder("");
	long overhead = 0;
	String method = "";
	String method2 = "";
	String previousFeature = "";
	String lastAction = "";
	int i = 0;
	Stack<String> abbauStack = new Stack<String>();
	Stack<Long> abbaubstackTimes = new Stack<Long>();
	BasicTree callTree = null;
	//Tree<Measurement> callTree = null; 
	int nbOfMainMethods = 0;
	BasicNode lastNode = new BasicNode();
	String n_currentA = "";
	//Node<Measurement> lastNode = null;
	public HashMap<String,Double> feature_Values = new HashMap<String,Double>();
	//Alternative Visiting		
	PathTree visitingTree = null;
	Path lastVisit = null;
	static long nodes = 0;
	static long timeInProgram = 0;
	HashMap<String,MutableInt> methodExecPerFeature = new HashMap<String,MutableInt>();
	
	/*@Around("@annotation(switchID)")
	public Object logFeatureSwitches(ProceedingJoinPoint pjp,featureHouse.FeatureSwitchID switchID) throws Throwable {
		long startAspect = System.currentTimeMillis();//System.nanoTime() / 1000000;
		nodes++;
		if(method2.equals(pjp.getSignature().getName()))
		{
			return pjp.proceed(); 
		}
		method2 = pjp.getSignature().getName();
		Object returnObject = null;
		int id  = switchID.id(); 
		Path currentPath = new Path();
		currentPath.splitID = id;
		currentPath.thenFeature = switchID.thenFeature();
		currentPath.elseFeature = switchID.elseFeature();
		if(visitingTree == null)
		{
			visitingTree = new PathTree();
			visitingTree.root = currentPath;
		}
		
		Path temp = lastVisit;
		if(lastVisit!=null)
			lastVisit.children.add(currentPath);
		lastVisit = currentPath;
		long endAspect = System.currentTimeMillis() -startAspect;//(System.nanoTime()/1000000) - startAspect;
		returnObject = pjp.proceed();
		lastVisit = temp;
		overhead += endAspect;
		if(lastNode != null)
			lastNode.value -= endAspect; //-10 Account for AspectJ overhead
		
		return returnObject;
	}*/
	
	//Code Analysis
	String callingFeature = "base";
	public ArrayList<String> all_methods = new ArrayList<String>();
	public ArrayList<String> doNotDeleteAnnotation = new ArrayList<String>();
	
	/*@Around("execution(* *(..)) && @annotation(featureAnnotation)")
	public Object analyzeCode(ProceedingJoinPoint pjp, featureHouse.FeatureAnnotation featureAnnotation) throws Throwable {
		String currentFeature = featureAnnotation.name();
		String method = pjp.getSignature().getName() +":"+pjp.getSignature().getDeclaringTypeName();
		if(doNotDeleteAnnotation.contains(method))
		{
			callingFeature = currentFeature;
			return pjp.proceed();
		}
		if(!all_methods.contains(method))
			all_methods.add(method);
		if(!callingFeature.equals(currentFeature))
		{
			doNotDeleteAnnotation.add(method);
		}
		callingFeature = currentFeature;
		return pjp.proceed();
	}*/
	
	//For alternative method
	String runningFeature = "base";
	long startingTime = 0;
	String currentPrefix = "";
	public HashMap<String,Long> feature_Values2 = new HashMap<String,Long>();
	Stack<ArrayList<String>> refinements = new Stack<ArrayList<String>>();
	ArrayList<String> currentRefinementFeatures = new ArrayList<String>();
	String interactionFeatureInRefinement = ""; //The feature that calls original multiple times
	
	@Around("execution(* *(..)) && @annotation(featureAnnotation)")
	public Object logAnnotatedMethodsAlternative(ProceedingJoinPoint pjp, featureHouse.FeatureAnnotation featureAnnotation) throws Throwable {
		nodes++;
		String currentFeature = featureAnnotation.name();
	//	if(currentFeature.equals("featureSwitch"))
		//	return pjp.proceed();
		//Counting method excutions per feature
		
		if(runningFeature.equals(currentFeature))
			return pjp.proceed();
		
		long stop = System.currentTimeMillis() - startingTime;
		Object returnObject = null;
		boolean flag = false;
		if(currentFeature.equals("featureSwitch") && pjp.getSignature().getName().contains("__role__") == false && pjp.getSignature().getName().contains("__before__") == false){
			currentRefinementFeatures = new ArrayList<String>();
			refinements.push(currentRefinementFeatures);
			flag = true;
			//currentFeature = runningFeature;
			//System.out.println("entering refinement");
		}
		
		if(pjp.getSignature().getName().contains("__role__") || pjp.getSignature().getName().contains("__before__")) // && currentFeature != featureSwitches
			{
			n_currentA = "refines";
			if(!currentFeature.equals("featureSwitch")){
				if(currentRefinementFeatures.contains(currentFeature)) {
					if(interactionFeatureInRefinement.length()==0)
						interactionFeatureInRefinement = findInteractionFeature(currentFeature);
					currentPrefix = setCurrentPrefix(interactionFeatureInRefinement);
				}
				currentRefinementFeatures.add(currentFeature);
			//	System.out.println("Features in refinement: " +currentRefinementFeatures.size());
			//System.out.println("Refined method from feature: " + currentFeature);
			}
			}
		else
			n_currentA = "call";
		
		String term = currentPrefix + runningFeature;//running feature is correct, because the measurement time was taken by the running feature and not by the current feature; for the current feature, the measurement just starts now
		String previousPrefix = currentPrefix;
		if(n_currentA.equals("call") && runningFeature.length() > 0) {
			currentPrefix = setCurrentPrefix(runningFeature);
		}
			/*if(currentPrefix.length() > 0){
			String lastPartOfIndex = currentPrefix.substring(0,currentPrefix.length()-1);
			int pos = lastPartOfIndex.lastIndexOf('#');
			if(pos > 0){
				lastPartOfIndex = lastPartOfIndex.substring(pos+1);
				if(!lastPartOfIndex.equals(runningFeature)){
					currentPrefix = setCurrentPrefix(runningFeature);// + "#";	
					}
				}
				else
					currentPrefix = setCurrentPrefix(runningFeature);//+=  runningFeature + "#";
			}
			else
				currentPrefix =setCurrentPrefix(runningFeature);//+=  runningFeature + "#";
		}
		/*if(term.contains("f2Alternative#f2Alternative")){
			System.out.println("runningFeature: "+runningFeature);
			System.out.println("Previous prefix:" + previousPrefix);
			System.out.println("Current feature: " + currentFeature);
		}*/
		MutableInt count = methodExecPerFeature.get(term);
		if (count == null) {
			methodExecPerFeature.put(term, new MutableInt());
		}
		else {
		    count.increment();
		}
		if(feature_Values2.containsKey(term))
			feature_Values2.put(term, feature_Values2.get(term)+ (stop));
		else
			feature_Values2.put(term, stop);
		String previousFeature = runningFeature;
		runningFeature = currentFeature;
		startingTime = System.currentTimeMillis();
		returnObject = pjp.proceed();
		stop = System.currentTimeMillis() - startingTime;
		String tempPrefix = currentPrefix;
		currentPrefix = previousPrefix;
		 term = currentPrefix + runningFeature;
		if(feature_Values2.containsKey(term))
			feature_Values2.put(term, feature_Values2.get(term)+ (stop));
		else
			feature_Values2.put(term, stop);
		runningFeature = previousFeature;
		
		if(flag){
			refinements.pop();
			interactionFeatureInRefinement = "";
			//System.out.println("stack size: " + refinements.size());
			if(refinements.size()>0)
				currentRefinementFeatures = refinements.peek();
			else
				currentRefinementFeatures.clear();
		}
		startingTime = System.currentTimeMillis();
		return returnObject;
	}//new aspect
	
	private String setCurrentPrefix(String addPrefix) {
		String returnString = currentPrefix;
		if(currentPrefix.length() > 0){
			String lastPartOfIndex = currentPrefix.substring(0,currentPrefix.length()-1);
			int pos = lastPartOfIndex.lastIndexOf('#');
			if(pos > 0){
				lastPartOfIndex = lastPartOfIndex.substring(pos+1);
				if(!lastPartOfIndex.equals(addPrefix)){
					returnString = currentPrefix + addPrefix + "#";	
					}
				}
			else
				returnString = currentPrefix + addPrefix + "#";
		}
		else
			returnString = currentPrefix + addPrefix + "#";
		return returnString;
	}

	private String findInteractionFeature(String feature) {
		String interactingFeature = "";
		ArrayList<String> tempList = new ArrayList<String>();
		for(int i = 0; i < currentRefinementFeatures.size();i++) {
			if(tempList.contains(currentRefinementFeatures.get(i)))
			{
				return currentRefinementFeatures.get(i-1);
			}
			tempList.add(currentRefinementFeatures.get(i));
		}
		for (int i = 0; i < currentRefinementFeatures.size(); i++) {
			if(currentRefinementFeatures.get(i).equals(feature))
				return currentRefinementFeatures.get(i-1);
		}
		return currentRefinementFeatures.get(currentRefinementFeatures.size()-2);
	}

	/*
	@Around("execution(* *(..)) && @annotation(featureAnnotation)")
	public Object logAnnotatedMethods(ProceedingJoinPoint pjp, featureHouse.FeatureAnnotation featureAnnotation) throws Throwable {
		nodes++;
		//if(1==1)
			//return pjp.proceed();
		//System.out.println("Executing: " + pjp.getSignature().toString());
		long startAspect = System.currentTimeMillis();//System.nanoTime() / 1000000;
		Object returnObject = null;

		if(method.equals(pjp.getSignature().getName()))
		{
			return pjp.proceed();
		}
		else
			method = pjp.getSignature().getName();
		if(lastVisit != null)
			lastVisit.methodsOnPath.add(method);
		String currentFeature = featureAnnotation.name();
		if(featureAnnotation.name().equals("featureSwitch") && previousFeature.length() > 0)
		{
			currentFeature = previousFeature;
		}
		else
		{
			if(lastVisit != null && lastVisit.visitedFeature == null){//there was a featureSwitch before, so we have to set the current feature name to indicate, which path we have taken
				lastVisit.visitedFeature = currentFeature;
			}
		}
		//Counting method excutions per feature
		MutableInt count = methodExecPerFeature.get(currentFeature);
		if (count == null) {
			methodExecPerFeature.put(currentFeature, new MutableInt());
		}
		else {
		    count.increment();
		}
		
		BasicNode currentNode;
		boolean IslastNode = true;
		if(currentFeature.equals(previousFeature))
		{
			if(lastNode!=null)
				currentNode = lastNode;
			else
			{
				IslastNode = false;
				currentNode = new BasicNode();
			}
		}
		else
			{
			IslastNode = false;
			currentNode = new BasicNode();//Node<Measurement>();
			}
		n_currentA = "call";
		if(pjp.getSignature().getName().contains("__role__") || pjp.getSignature().getName().contains("__before__")) // && currentFeature != featureSwitches
		{
			n_currentA = "refines";
		}
		if(callTree == null)
		{
			//Measurement m = new Measurement(currentFeature, "call");
			//currentNode.data = m;
			currentNode.feature = currentFeature;
			currentNode.type = "call";
			callTree = new BasicTree();//new Tree<Measurement>(m);
			callTree.root = currentNode;
		}
		else if(!IslastNode)
		{	
			//Measurement m = new Measurement(currentFeature,  n_currentA);
			currentNode.feature = currentFeature;
			currentNode.type = n_currentA;
			if(lastNode!= null && lastNode.prefix.length() > 0)
			{
				if(n_currentA.equals("call"))
					{
					currentNode.prefix = lastNode.prefix + currentFeature + "#";
					}
						
				else
					currentNode.prefix = lastNode.prefix;
			}
			else
			{
				if(n_currentA.equals("call"))
					currentNode.prefix = currentFeature + "#";
			}
			//currentNode.data = m;
		}
		String tempFeature = null;
		BasicNode temp = null;
		if(!IslastNode)
		{
			temp = lastNode;
			tempFeature = previousFeature;
			if(lastNode!=null)
				lastNode.children.add(currentNode);
			lastNode = currentNode;
			previousFeature = currentFeature;
		}
			long endAspect = System.currentTimeMillis() - startAspect;
			long start = System.currentTimeMillis();
			returnObject = pjp.proceed();
			long featureTime = System.currentTimeMillis()-start;
			n_currentA = "leaving";
			//previousFeature = currentFeature;
			if(!IslastNode)
			{
				currentNode.value += featureTime;
				lastNode = temp;
				previousFeature = tempFeature;
			}
			else
				currentNode.value += featureTime;
			
			overhead += endAspect;
			if(lastNode != null)
			{
				lastNode.value -= endAspect;
			}
			else
				System.out.println(overhead);
			
			return returnObject;
	}*/
	
	//public int printTreeSize(Node<Measurement> n, int depth)
	public int printTreeSize(BasicNode n, int depth)
	{
		int max = 0;
		for(int i = 0; i < n.children.size();i++)
		{
			int dep = printTreeSize(n.children.get(i), depth);
			if(dep > max)
				max = dep;
		}
		return max+1;
	}
	public void printTreeSize()
	{
		int size =  printTreeSize(callTree.root, 0);
		System.out.println(size);
	}
	/*@Around("@annotation(featureAnnotation)")
	public void logAnnotatedMethods(ProceedingJoinPoint pjp, featureHouse.FeatureAnnotation featureAnnotation) throws Throwable {
		if(method.equals(pjp.getSignature().getName()))
		{
			pjp.proceed();
			return;
		}
		else
			method = pjp.getSignature().getName();
		i++;
		String currentFeature = featureAnnotation.name()+"_"+i;
		String action = "";
		if(featureAnnotation.name().equals("featureSwitch"))
		{
			currentFeature = previousFeature.substring(0,previousFeature.indexOf('_'))+"_"+i;
			action = "call";
			if(lastAction.equals("refines"))
				sb.append( " + " + currentFeature);
			else
				sb.append( " - " + currentFeature);
			pjp.proceed();
			sb.append( "<"+ currentFeature + ":0>");
			lastAction = "leaving";
			previousFeature = currentFeature;
			return;
		}
		previousFeature = currentFeature;
		
		if(pjp.getSignature().getName().contains("__role__") || pjp.getSignature().getName().contains("__before__"))
			{
			action = "refines";
			if(lastAction.equals("refines"))
				sb.append(" - (" + currentFeature);
			else
				sb.append(" (" + currentFeature);
			}
		else
		{
			action = "call";
			if(lastAction.equals("leaving"))
				sb.append( " + " + currentFeature);
			else
				sb.append( " - " + currentFeature);
		}
		lastAction = action;
		features.push(featureAnnotation.name());
		long start = System.nanoTime() / 1000000;
		pjp.proceed();
		long featureTime = (System.nanoTime()/1000000) - start;
		if(action.equals("refines"))
		{
			//sb.insert(0,"<"+featureTime+">");
			//sb.append(")");
			if(lastAction.equals("refines"))
				sb.append("<"+ currentFeature + ":" +featureTime+">) ");
			else
				sb.append("<"+  currentFeature + ":" + featureTime+">)");
			
			////////abbau
			if(abbauStack.size() == 0)
			{
				abbauStack.push("#"+currentFeature.substring(0,previousFeature.indexOf('_'))); 
				abbaubstackTimes.push(featureTime);
			}
			if(lastAction.equals("call"))
			{
				sb2.append(currentFeature.substring(0,previousFeature.indexOf('_')));
				while(abbauStack.size() > 0)
					sb2.append(abbauStack.pop());
			}
			/////////
		}
		else
		{
			sb.append("<"+  currentFeature + ":" +featureTime+">");
			//sb.insert(0,currentFeature+"<"+featureTime+"> + ");
			/////////abbau
			
			////////
		}
		lastAction = "leaving";
		//System.out.println("ns passed: "+featureTime);
		Long timeBefore = times.get(currentFeature);
		if (timeBefore == null) timeBefore = Long.valueOf(0);
		times.put(currentFeature, timeBefore + featureTime);
		System.out.println("On stack: " + getStack() + " measured time: " + (timeBefore + featureTime));
		//System.out.println("adding time to: "+featureAnnotation.name());
		System.out.println("Feature: " + currentFeature + " +=" +  (timeBefore + featureTime));
		features.pop();
		if (! features.isEmpty()) {
			//substract time from calling feature
			timeBefore = times.get(features.peek());
			System.out.println("Subtract: " + timeBefore);
			if (timeBefore == null) timeBefore = Long.valueOf(0);
			times.put(features.peek(), timeBefore - featureTime);
		}
		
	}*/
/*	@Around("@annotation(featureAnnotation)")
	//public void logAnnotatedMethods(ProceedingJoinPoint pjp, featureHouse.FeatureAnnotation featureAnnotation) throws Throwable {
		/*String currentFeature = featureAnnotation.name();
		if(method.equals(pjp.getSignature().getName()))
		{
			pjp.proceed();
			return;
		}
		else
			method = pjp.getSignature().getName();
		if(currentFeature.equals("featureSwitch"))
			currentFeature = previousFeature;
		previousFeature = currentFeature;
		verificationClasses.PerformanceProfiler.enteringFeature(currentFeature);
		long start = System.nanoTime() / 1000000;
		pjp.proceed();
		long featureTime = (System.nanoTime()/1000000) - start;
		verificationClasses.PerformanceProfiler.add(currentFeature, featureTime);*/
		
		
		//System.out.println("started in "+featureAnnotation.name());
	/*	String currentFeature = featureAnnotation.name();
		if(method.equals(pjp.getSignature().getName()))
		{
			pjp.proceed();
			return;
		}
		else
			method = pjp.getSignature().getName();
		if(currentFeature.equals("featureSwitch"))
		{
			currentFeature = previousFeature;
			//sb.append(pjp.getSignature().getName() + "-o->;");
			//pjp.proceed();
			//sb.append("<-o-" + pjp.getSignature().getName() +";");
			//sb.append(")");
			//return;
		}
		previousFeature = currentFeature;
		if(pjp.getSignature().getName().contains("__role__") || pjp.getSignature().getName().contains("__before__"))
			sb.append("-o->;" + currentFeature + "[" + pjp.getSignature().getName() +"]");
		else
			sb.append( "-c->;" + currentFeature + "[" + pjp.getSignature().getName() +"]");
		features.push(featureAnnotation.name());
		long start = System.nanoTime() / 1000000;
		pjp.proceed();
		long featureTime = (System.nanoTime()/1000000) - start;
		sb.append("<-("+featureTime+")" + pjp.getSignature().getName() +";");
		//System.out.println("ns passed: "+featureTime);
		Long timeBefore = times.get(currentFeature);
		if (timeBefore == null) timeBefore = Long.valueOf(0);
		times.put(currentFeature, timeBefore + featureTime);
		System.out.println("On stack: " + getStack() + " measured time: " + (timeBefore + featureTime));
		//System.out.println("adding time to: "+featureAnnotation.name());
		System.out.println("Feature: " + currentFeature + " +=" +  (timeBefore + featureTime));
		features.pop();
		if (! features.isEmpty()) {
			//substract time from calling feature
			timeBefore = times.get(features.peek());
			System.out.println("Subtract: " + timeBefore);
			if (timeBefore == null) timeBefore = Long.valueOf(0);
			times.put(features.peek(), timeBefore - featureTime);
		}
	}*/
	
	public String getStack()
	{
		String result = "";
		for(int i = 0; i < features.size(); i++){
			result += features.get(i) + ", ";
		}
		return result;
	}
	
	@Before("execution(public static void main(String[]))")
	public void logNumberofMainMethods(){//featureHouse.FeatureAnnotation featureAnnotation) {
		System.out.println("Entering");
		if(nbOfMainMethods == 0)
		{
			timeInProgram = System.currentTimeMillis();
			startingTime = System.currentTimeMillis();
		}
		this.nbOfMainMethods++;
	}
	// hook to print the gathered times
	//@After("execution(public void end())")
	@After("execution(public static void main(String[]))")
	public void printResults(){//(featureHouse.FeatureAnnotation featureAnnotation) {
		//verificationClasses.PerformanceProfiler.printChoiceCalculus("C:\\Workspace\\newTest.txt");
		this.nbOfMainMethods--;
		if(nbOfMainMethods > 0)
			return;
		System.out.println("time in program: " + (System.currentTimeMillis()-timeInProgram));
		System.out.println("Aspects: " + nodes);
		if(1==2)
		{
			StringBuilder sb = new StringBuilder();
			for (String method : all_methods) {
				boolean delete = true;
				for (String doNotDelete : doNotDeleteAnnotation) {
					if(method.equals(doNotDelete))
						{
							delete = false;
							break;
						}
				}
				if(delete)
					sb.append(method+"\r\n");
			}
			writeToFile(sb.toString(), "toDelete.txt");
			
			//System.out.println("Methods: " + nodes);
			return;
		}
		long stop = System.currentTimeMillis() - startingTime;
		if(feature_Values2.containsKey(runningFeature))
			feature_Values2.put(runningFeature, feature_Values2.get(runningFeature)+ (stop));
		else
			feature_Values2.put(runningFeature, stop);

		timeInProgram = System.currentTimeMillis() - timeInProgram;
		double time = (double)timeInProgram;
		for (Entry<String, Long> e : feature_Values2.entrySet()) {
			double value = (double)e.getValue();
			if(methodExecPerFeature.containsKey(e.getKey()))
			{
				System.out.println("============");
				System.out.println(value);
				double val = (double)methodExecPerFeature.get(e.getKey()).get();
				value-= val * 50 / 100000;
				System.out.println(value);
				feature_Values2.put(e.getKey(), (long)value);
				if(value < 0)
					value = 0;
			}
			System.out.println(e.getKey() + ": " + (int)value);
		}
		
		printOutput();
		
		if(1==1)
			return;
		//Subtract all feature times
		for (Entry<String, Double> e : feature_Values.entrySet()) {
			time  -= e.getValue();
		}
		//Subtract overhead of AOP
		double overhead = (double)nodes * 80 / 100000;//# of executed aspects * 5 ns / 100000 in ms
		System.out.println("overhead: " + overhead);
		time -=overhead;
		if(feature_Values.containsKey("Base"))
			feature_Values.put("Base", feature_Values.get("Base")+ (time));
		else
			feature_Values.put("Base", time);
		for (Entry<String, Long> e : times.entrySet()) {
			System.out.println(e.getKey() + "  " + e.getValue());
		}
		//System.out.println(sb);		
		traverseTree();
		//traverseTree2();
		
		writePath();
	}
	

	
	private void printOutput() {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		Iterator<String> iter = feature_Values2.keySet().iterator();
		HashMap<String, Long> simplifiedValues = new HashMap<String, Long>();
		while(iter.hasNext())
		{
			String feature2 = iter.next();
			Long time2 = feature_Values2.get(feature2); // in ms
			sb.append(feature2 + "<" + time2.intValue() + ">; ");
			
			String simpleName = simplifyOutput(feature2);
			if(simplifiedValues.containsKey(simpleName))
				simplifiedValues.put(simpleName, simplifiedValues.get(simpleName)+ (time2));
			else
				simplifiedValues.put(simpleName,time2);
		}
		
		Iterator<String> iter2 = simplifiedValues.keySet().iterator();
		while(iter2.hasNext())
		{
			String feature2 = iter2.next();
			Long time2 = simplifiedValues.get(feature2);
			sb2.append(feature2 + "<" + time2.intValue() + ">; ");
		}
		System.out.println(sb);
		System.out.println("Simplified output:");
		System.out.println(sb2);
		writeToFile(sb2.toString(),"measurement.txt");
		
	}

	private void writePath() {
		if(visitingTree == null)
		{
			System.out.println("Error: Tree is empty.");
			return;
		}
		XStream xstream = new XStream(new DomDriver());
		String xml = xstream.toXML(visitingTree);
		FileWriter sw = null;
		try {
		sw = new FileWriter("visitedPath.xml");
		sw.write(xml);
		
		} catch(IOException ex) {
			System.out.println("Error while writing file!");
		}
		finally {
			try {sw.close();} catch (Exception ex) {}
		}
	}

	private void traverseTree2() {
		//Node<Measurement> n = callTree.root;
		for(int i = 0; i < callTree.root.children.size(); i++)
		{
			//findInteractions(callTree.root.children.get(i), "");
		}
	}
	
	public String findInteractions(Node<Measurement> n, String s)
	{
		//if(n.data.prefix.length() > 0)
			//n.data.formula = n.data.prefix 
		return "";
	}
	
	private void traverseTree() {
		if(callTree == null)
		{
			System.out.println("Error: Tree is empty.");
			return;
		}
		System.out.println("Visited methods of features: " + nodes);
		//Node<Measurement> n = callTree.root;
		double sub = 0;
		for(int i = 0; i < callTree.root.children.size(); i++)
			sub += traverse(callTree.root.children.get(i), "");
		callTree.root.clearedValue = callTree.root.value - sub;
		String feature = callTree.root.feature;
		if(feature_Values.containsKey(feature))
			feature_Values.put(feature, feature_Values.get(feature)+ (callTree.root.clearedValue));
		else
			feature_Values.put(feature,callTree.root.clearedValue);
		System.out.println(callTree.root.feature + ": " + callTree.root.clearedValue);
		//feature_Values.put(feature, n.data.clearedValue);
		
		//Account for overhead
		/*Iterator<String> iter3 = methodExecPerFeature.keySet().iterator();
		while(iter3.hasNext())
		{
			String feature2 = iter3.next();
			
			if(feature_Values.containsKey(feature2))
			{
				int executions = methodExecPerFeature.get(feature2).get();
				System.out.println(executions+" executions for feature: " +feature2);
				double value = feature_Values.get(feature2);
				value -= executions / 300;
				feature_Values.put(feature2, value);	
			}
			else
				System.out.println("Could not find feature: " + feature2);
		}*/
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		Iterator<String> iter = feature_Values.keySet().iterator();
		HashMap<String, Double> simplifiedValues = new HashMap<String, Double>();
		while(iter.hasNext())
		{
			String feature2 = iter.next();
			Double time2 = feature_Values.get(feature2); // in ms
			sb.append(feature2 + "<" + time2.intValue() + ">; ");
			
			String simpleName = simplifyOutput(feature2);
			if(simplifiedValues.containsKey(simpleName))
				simplifiedValues.put(simpleName, simplifiedValues.get(simpleName)+ (time2));
			else
				simplifiedValues.put(simpleName,time2);
		}
		
		Iterator<String> iter2 = simplifiedValues.keySet().iterator();
		while(iter2.hasNext())
		{
			String feature2 = iter2.next();
			Double time2 = simplifiedValues.get(feature2);
			sb2.append(feature2 + "<" + time2.intValue() + ">; ");
		}
		System.out.println(sb);
		System.out.println("Simplified output:");
		System.out.println(sb2);
		writeToFile(sb2.toString(),"measurement.txt");
	}
	
	private void writeToFile(String string, String filename) {
		FileWriter sw = null;
		try {
			sw = new FileWriter(filename, false);
			//sw.write("methods:"+nodes+"\r\n");
			sw.write(string+"\r\n");
		} catch (IOException e) {

		} finally {
			try {
				sw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

	public String simplifyOutput(String expression) {
		boolean changed = true;
		//if(expression.endsWith("base"))
			//return "base";
		//Rule 1
		while(expression.startsWith("base#"))
			expression = expression.substring(5);
		String [] featuresArray = expression.split("#");
		ArrayList<String> features = new ArrayList<String>();
		for (int i = 0; i < featuresArray.length; i++) {
			features.add(featuresArray[i]);
		}
		while(changed){
			changed = false;
			for (int i = 0; i < features.size(); i++) {
				String currentfeautre = features.get(i);
				for (int j = i+1; j < features.size(); j++) {
					if(currentfeautre.equals(features.get(j)))
					{
						changed = true;
						features.remove(j);
						break;
					}
				}
				if(changed)
					break;
			}
		}
		//if(features.get(0).equals("base") && features.size() > 1)
			//features.remove(0);
		//if(features.size()==1)
			//return features.get(0);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < features.size(); i++) {
			if(i==features.size()-1)
				sb.append(features.get(i));
			else
				sb.append(features.get(i)+"#");
		}
		return sb.toString();
		
	}

	//public double traverse(Node<Measurement> node, String featureNamesOnPath)
	public double traverse(BasicNode node, String featureNamesOnPath)
	{
		double currentValue = 0;
		String feature = "";
		/*if(featureNamesOnPath.length() == 0)
			feature = node.data.feature;
		else
			feature = featureNamesOnPath+"#"+node.data.feature;*/
		feature = node.feature;
		for (int i = 0; i < node.children.size(); i++) {
			currentValue += traverse(node.children.get(i),feature);
		}
		
		System.out.println(node.feature+": " + node.value + " - " + currentValue);
		currentValue = node.value - currentValue;
		
		//if(node == currentTree.root)
			//feature = node.data.feature;
		//Eintragen des Featurewertes
		String eintrag =  "";
		String prefix = node.prefix;
		/*prefix.replace("base#", "");
		String[] interacting_features = new String(prefix + feature).split("#");
		List<String> clearedList = new ArrayList<String>();
		for(int k = 0; k < interacting_features.length; k++){
			if(!clearedList.contains(interacting_features[k]))
			{
				clearedList.add(interacting_features[k]);
			}
		}
		for (int l = 0; l < clearedList.size(); l++) {
			eintrag += clearedList.get(l) + "#";
		}
		if(eintrag.equals("base#"))
			eintrag = "base";*/
		//if(prefix.endsWith(feature + "#"))
			//eintrag = prefix.substring(0,prefix.length()-1);
		//else
			eintrag = prefix+feature;
		if(feature_Values.containsKey(eintrag))
			feature_Values.put(eintrag, feature_Values.get(eintrag)+ (currentValue));
		else
			feature_Values.put(eintrag, currentValue);
		//System.out.println(node.data.prefix +" : " + currentValue);
		return node.value;
	}
}


