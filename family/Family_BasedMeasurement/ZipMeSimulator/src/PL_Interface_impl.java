
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public  class  PL_Interface_impl  implements PL_Interface {
	

	public static boolean executedUnimplementedAction = false;

	
	public static List<String> actionHistory = new ArrayList<String>();

	
	public static boolean verbose = false;

	
	private static boolean isAbortedRun = false;

	


public static void main(String[] args) {
		try {
			verificationClasses.FeatureSwitches.select_features();
			PL_Interface_impl impl = new PL_Interface_impl();
			args = new String[1];
			verbose = true;
			impl.start(1,3);
			PL_Interface_impl.println("no Exception");
		} catch (Throwable e) {
			PL_Interface_impl.println("Caught Exception: " + e.getClass() + " "
					+ e.getMessage());
			e.printStackTrace();
		}
	}

	


public void start(int specification, int variation) throws Throwable {
		try {
			if (verbose) 
				PL_Interface_impl.print("Started with Specification " + specification +  ", Variation: " +variation);
			test(specification, variation);
		} catch (Throwable e) {
			throw e;
		}finally {
		}
	}

	
	@featureHouse.FeatureAnnotation(name="Base")
public void checkOnlySpecification(int specID) {
		PL_Interface_impl.println("Specifications not implemented");
	}

	

	@featureHouse.FeatureAnnotation(name="Base")
public List<String> getExecutedActions() {
		return actionHistory;
	}

	
	
	@featureHouse.FeatureAnnotation(name="Base")
public boolean isAbortedRun() {
		return isAbortedRun;
	}

	

	// this method is used as hook for the liveness properties.

public void test(int specification, int variation) throws Throwable {
		String[] args = new String[1];
		
		
		args[0]="irrelevant";
		ZipTest.fileToZip = new File("uiq2testfile");
		//ZipTest.fileToZip = new File("testfile.c");
		try {
			ZipTest.main(args);
		} catch (Throwable e) {
			PL_Interface_impl.println("Caught Exception: " + e.getClass() + " "
					+ e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}

	

	
	
	@featureHouse.FeatureAnnotation(name="Base")
static String listToString(List<String> list) {
		String ret = "";
		for (String s : list) {
			ret = ret + " " + s;
		}
		return ret;
	}

	

public static void println(String s) {
		if (PL_Interface_impl.verbose) {
			System.out.println(s);
		}
	}

	

public static void println() {
		if (PL_Interface_impl.verbose) {
			System.out.println();
		}
	}

	

public static void print(String s) {
		if (PL_Interface_impl.verbose) {
			System.out.print(s);
		}
	}


}
