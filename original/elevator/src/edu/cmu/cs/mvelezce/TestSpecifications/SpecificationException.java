package edu.cmu.cs.mvelezce.TestSpecifications;

import edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation;

public class SpecificationException extends RuntimeException {

    private static final long serialVersionUID = -6600356723299466152L;


    private String specificationName;


    @FeatureAnnotation(name = "base")
    public SpecificationException(String testCaseName, String message) {
        super(message);
        this.specificationName = testCaseName;
    }


    @FeatureAnnotation(name = "base")
    public String getSpecificationName() {
        return specificationName;
    }


}
