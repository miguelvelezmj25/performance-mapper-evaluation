import java.util.List;  

public  interface  PL_Interface {
	
	@featureHouse.FeatureAnnotation(name="Base")
public List<String> getExecutedActions();

	
	@featureHouse.FeatureAnnotation(name="Base")
public void start(int specification, int variation) throws Throwable;

	
	@featureHouse.FeatureAnnotation(name="Base")
public void checkOnlySpecification(int specID);

	
	@featureHouse.FeatureAnnotation(name="Base")
public boolean isAbortedRun();


}
