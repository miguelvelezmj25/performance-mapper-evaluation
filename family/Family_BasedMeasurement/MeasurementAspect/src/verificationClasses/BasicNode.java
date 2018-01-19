package verificationClasses;

import java.util.ArrayList;
import java.util.List;

public class BasicNode {
	public double value = 0;
	public String feature = "Base";
	public List<BasicNode> children = new ArrayList<BasicNode>(); 
	public double clearedValue = 0;
	public String type = "";
	public String prefix = "";
}
