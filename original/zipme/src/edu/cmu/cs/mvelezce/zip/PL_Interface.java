package edu.cmu.cs.mvelezce.zip;

import edu.cmu.cs.mvelezce.zip.featureHouse.FeatureAnnotation;

import java.util.List;

public interface PL_Interface {

    @FeatureAnnotation(name = "Base")
    public List<String> getExecutedActions();


    @FeatureAnnotation(name = "Base")
    public void start(int specification, int variation) throws Throwable;


    @FeatureAnnotation(name = "Base")
    public void checkOnlySpecification(int specID);


    @FeatureAnnotation(name = "Base")
    public boolean isAbortedRun();


}
