package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation;

import java.util.List;

public interface PL_Interface {

    @FeatureAnnotation(name = "base")
    public List<String> getExecutedActions();


    @FeatureAnnotation(name = "base")
    public void start(int specification, int variation) throws Throwable;


    @FeatureAnnotation(name = "base")
    public void checkOnlySpecification(int specID);


    @FeatureAnnotation(name = "base")
    public boolean isAbortedRun();


}
