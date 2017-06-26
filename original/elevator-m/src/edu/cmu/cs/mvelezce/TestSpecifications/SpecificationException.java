package edu.cmu.cs.mvelezce.TestSpecifications;

public class SpecificationException extends RuntimeException {

    private static final long serialVersionUID = -6600356723299466152L;


    private String specificationName;


    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public SpecificationException(String testCaseName, String message) {
        super(message);
        this.specificationName = testCaseName;
    }


    //    @edu.cmu.cs.mvelezce.featureHouse.FeatureAnnotation(name = "base")
    public String getSpecificationName() {
        return specificationName;
    }


}
