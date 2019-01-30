package edu.cmu.cs.mvelezce;

import soot.*;
import soot.util.Chain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LineCountAnalysis extends SceneTransformer {
//public class LineCountAnalysis extends BodyTransformer {

    private Map<SootClass, Integer> classesToCounts = new HashMap<>();

    private static final LineCountAnalysis INSTANCE = new LineCountAnalysis();

    static final String LINE_COUNT_ANALYSIS = "linecountanalysis";

    static LineCountAnalysis instance() {
        return INSTANCE;
    }

    @Override
    protected void internalTransform(String phaseName, Map<String, String> options) {
        Chain<SootClass> classes = Scene.v().getApplicationClasses();

        for(SootClass sootClass : classes) {
            classesToCounts.put(sootClass, 0);

            List<SootMethod> methods = sootClass.getMethods();

            for(SootMethod sootMethod : methods) {
                if(!sootMethod.hasActiveBody()) {
                    continue;
                }

                Body body = sootMethod.getActiveBody();
                UnitPatchingChain units = body.getUnits();
                Integer currentCount = classesToCounts.get(sootClass);
                classesToCounts.put(sootClass, currentCount + units.size());
            }
        }

        for(Map.Entry<SootClass, Integer> entry : classesToCounts.entrySet()) {
            SootClass sootClass = entry.getKey();
            System.out.println("Package: " + sootClass.getPackageName() + " Class: " + sootClass.getName() + " Lines: " + entry.getValue());
        }
    }

//    @Override
//    protected void internalTransform(Body b, String phaseName, Map<String, String> options) {
//        UnitPatchingChain units = b.getUnits();
//        int x = units.size();
//    }
}
