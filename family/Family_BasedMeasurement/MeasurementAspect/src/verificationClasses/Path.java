package verificationClasses;
import java.lang.*;
import java.util.ArrayList;

public class Path {
	public boolean visited;
	public boolean allChildsVisited;
	public int splitID;
	public String visitedFeature = null;
	public ArrayList<String> methodsOnPath = new ArrayList<String>();
	public String thenFeature;
	public String elseFeature;
	public Path()
	{
		visited = false;
		allChildsVisited = false;
		splitID = -1; 
	}
	public ArrayList<Path> children = new ArrayList<Path>();
}
