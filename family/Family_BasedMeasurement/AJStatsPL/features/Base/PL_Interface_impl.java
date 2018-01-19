import gov.nasa.jpf.annotation.FilterField; 
import gov.nasa.jpf.jvm.Verify; 
//import gov.nasa.jpf.symbc.Symbolic;

import java.util.List; 
import java.util.ArrayList; 
import java.lang.Throwable; 

public  class  PL_Interface_impl  implements PL_Interface {
	

	@FilterField
	//@Symbolic("false")
	public static boolean executedUnimplementedAction = false;

	
	@FilterField
	//@Symbolic("false")
	public static List<String> actionHistory = new ArrayList<String>();

	
	public static boolean verbose = false;

	
	@FilterField
	//@Symbolic("false")
	private static boolean isAbortedRun = false;

	

public static void main(String[] args) {
		try {
			PL_Interface_impl impl = new PL_Interface_impl();
			args = new String[1];
			verbose = true;
			impl.start(1,2);
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

	
public void checkOnlySpecification(int specID) {
		PL_Interface_impl.println("Specifications not implemented");
	}

	

public List<String> getExecutedActions() {
		return actionHistory;
	}

	
	
public boolean isAbortedRun() {
		return isAbortedRun;
	}

	

	// this method is used as hook for the liveness properties.
public void test(int specification, int variation) throws Throwable {
		String program = "";
		if (variation == 1) {
			program = "public privileged aspect A {\n"+
					"void foo() {\n"+
					"int i;\n"+
					"/*i = i - i;\n"+
					"* j\n"+
					"// throw\n"+
					"*/\n"+
					"}\n"+
					"/*\n"+
					"* \n"+
					"*/\n"+
					"/*\n"+
					"* \n"+
					"*/\n"+
					"}";
		} else if (variation == 2) {
			program = "// $Header: /home/apel/cvs/fstcomp/examples/Java/AJStats/Test/Foo.java,v 1.1 2010-04-20 08:16:43 apel Exp $\n			/**\n			 * Please complete these missing tags\n			 * @author\n			 * @rref\n			 * @copyright\n			 * @concurrency\n			 * @see\n			 */\n			class Foo\n			{\n			    int a = 0, b = 0, c;\n			    int g;\n			    int e;\n			    /**\n			     * Please complete the missing tags for Foo\n			     * @param\n			     * @return\n			     * @throws\n			     * @pre\n			     * @post\n			     */\n			    \n			    Foo()\n			    {\n			        \n			        \n			    }\n			    /**\n			     * Please complete the missing tags for m\n			     * @param\n			     * @return\n			     * @throws\n			     * @pre\n			     * @post\n			     */\n			    \n			    void m()\n			    {\n			        int i;\n			        i++;\n			    }\n			    /**\n			     * Please complete these missing tags\n			     * @param\n			     * @return\n			     * @throws\n			     * @pre\n			     * @post\n			     */\n			    interface Bar\n			    {\n			        public int c = 0;\n			        public void m();\n			    }\n			    /**\n			     * Please complete these missing tags\n			     * @param\n			     * @return\n			     * @throws\n			     * @pre\n			     * @post\n			     */\n			    \n			    interface Baz\n			    {\n			        public float f;\n			        public void n();\n			    }\n			    class Inner\n			    {\n			        int b;\n			        void m()\n			        {\n			            int j;\n			            j++;\n			        }\n			    }\n			}";
		}else if (variation == 3) {
			program = "class X {\n			    //int j;\n\n				int h;\n\n				int g;\n\n				/* j */\n				/*\n				k\n				*/\n\n			}";
		} else {
			System.out.println("unknown variation : " + variation);
			throw new Exception("unknown variation : " + variation);
		}
		try {
			//AspectJCollector.mainParseString(new StringBuffer(program));
			String[] args = {"./../orbacus"};
			AspectJCollector.main(args);
		} catch (Throwable e) {
			PL_Interface_impl.println("Caught Exception: " + e.getClass() + " "
					+ e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}

	

public static int getIntegerMinMax(int min, int max) {
		return Verify.getInt(min, max);
	}

	
public static boolean getBoolean() {
		return Verify.getBoolean();// verify true first
	}

	
	
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
