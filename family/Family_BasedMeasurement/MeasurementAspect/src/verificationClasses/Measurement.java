package verificationClasses;
import java.util.*;

public class Measurement {
	public String feature;
	public double value;
	public double clearedValue;
	public String type;
	public String prefix = "";
	public String formula;
	
	public Measurement(String feature, double value)
	{
		this.feature = feature;
		this.value = value;
	}
	
	public Measurement(String feature, String type)
	{
		this.feature = feature;
		this.type = type;
	}
	
	
}
