package edu.cmu.cs.mvelezce;

//import gov.nasa.jpf.annotation.Conditional;

public class Main {

    //	@Conditional
    public static boolean BASE = true;
    //	@Conditional
    public static boolean DIRECTED = true;
    //	@Conditional
    public static boolean UNDIRECTED = false;
    //	@Conditional
    public static boolean WEIGHTED = false;
    //	@Conditional
    public static boolean SEARCH = true;
    //	@Conditional
    public static boolean BFS = true;
    //	@Conditional
    public static boolean DFS = false;
    //	@Conditional
    public static boolean NUMBER = true;
    //	@Conditional
    public static boolean CONNECTED = false;
    //	@Conditional
    public static boolean STRONGLYCONNECTED = false;
    //	@Conditional
    public static boolean TRANSPOSE = true;
    //	@Conditional
    public static boolean CYCLE = false;
    //	@Conditional
    public static boolean MSTPRIM = false;
    //	@Conditional
    public static boolean MSTKRUSKAL = false;
    //	@Conditional
    public static boolean SHORTEST = true;

    public static void main(String[] args) {
//		if (args != null && args.length != 0 ) {
//			int index = 0;
//			GPL.edu.cmu.cs.mvelezce.Main.BASE = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.BFS = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.CONNECTED = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.CYCLE = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.DFS = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.DIRECTED = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.MSTKRUSKAL = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.MSTPRIM = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.NUMBER = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.SEARCH = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.SHORTEST= Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.Src = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.Src2 = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.SrcProg = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.STRONGLYCONNECTED = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.TRANSPOSE = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.UNDIRECTED = Boolean.valueOf(args[index++]);
//			GPL.edu.cmu.cs.mvelezce.Main.WEIGHTED = Boolean.valueOf(args[index++]);
//		} else {
//			GPL.edu.cmu.cs.mvelezce.Main.GPL = true;
//		}

        // initialization of static fields
//		LinkedList q = GlobalVarsWrapper.Queue;
//		Set set = java.util.Collections.EMPTY_SET;
//		
//		List<Integer> list = new LinkedList<>();
//		list.add(1);
//		list.add(0);
//		Collections.sort( list, 
//				new Comparator<Object>() {
//			/*@(StronglyConnected)*/
//
//			public int compare( Object o1, Object o2 )
//			{
//				Integer v1 = ( Integer )o1;
//				Integer v2 = ( Integer )o2;
//
//				if ( v1 > v2)
//					return -1;
//
//				if ( v1 == v2)
//					return 0;
//				return 1;
//			}
//		} );
        WEIGHTED = Boolean.valueOf(args[0]);
        SHORTEST = Boolean.valueOf(args[1]);

        long start = System.nanoTime();
        new Main(args);
        long end = System.nanoTime();
        System.out.println("TIME: " + (end - start));

    }

    public Main(String[] args) {
//		GPL.edu.cmu.cs.mvelezce.Main.main(args);
        edu.cmu.cs.mvelezce.gpl.Main.main(new String[]{"/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/gpl/random.txt", "v0"});
    }
}
