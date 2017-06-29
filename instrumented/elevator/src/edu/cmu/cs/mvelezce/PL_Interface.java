package edu.cmu.cs.mvelezce;

import java.util.List;

public interface PL_Interface {

    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public List<String> getExecutedActions();


    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public void start(int specification, int variation) throws Throwable;


    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public void checkOnlySpecification(int specID);


    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public boolean isAbortedRun();


}
