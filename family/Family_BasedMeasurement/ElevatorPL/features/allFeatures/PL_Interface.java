import java.util.List;  

public  interface  PL_Interface {
	
	@featureHouse.FeatureAnnotation(name="base")
public List<String> getExecutedActions();

	
	@featureHouse.FeatureAnnotation(name="base")
public void start(int specification, int variation) throws Throwable;

	
	@featureHouse.FeatureAnnotation(name="base")
public void checkOnlySpecification(int specID);

	
	@featureHouse.FeatureAnnotation(name="base")
public boolean isAbortedRun();


}
