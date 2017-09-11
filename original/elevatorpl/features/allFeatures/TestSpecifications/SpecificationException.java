package TestSpecifications;

public class SpecificationException extends RuntimeException {

    private static final long serialVersionUID = -6600356723299466152L;


    private String specificationName;


    @featureHouse.FeatureAnnotation(name = "base")
    public SpecificationException(String testCaseName, String message) {
        super(message);
        this.specificationName = testCaseName;
    }


    @featureHouse.FeatureAnnotation(name = "base")
    public String getSpecificationName() {
        return specificationName;
    }


}
