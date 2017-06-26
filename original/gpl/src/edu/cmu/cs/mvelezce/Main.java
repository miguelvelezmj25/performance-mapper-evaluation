package edu.cmu.cs.mvelezce;

//import gov.nasa.jpf.annotation.Conditional;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    //	@Conditional
    public static boolean BASE = true;
    //	@Conditional
    public static boolean DIRECTED = true;
    //	@Conditional
    public static boolean UNDIRECTED = false;
    //	@Conditional
    public static boolean WEIGHTED = true;
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

//        WEIGHTED = Boolean.valueOf(args[0]);
//        SHORTEST = Boolean.valueOf(args[1]);

//        WEIGHTED = false;
//        SHORTEST = false;

        long start = System.nanoTime();
        new Main(args);
        long end = System.nanoTime();
        System.out.println("TIME: " + (end - start));
//        generateGraph();

    }

    public Main(String[] args) {
//		GPL.edu.cmu.cs.mvelezce.Main.main(args);
        edu.cmu.cs.mvelezce.gpl.Main.main(new String[]{"/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/gpl/random.txt", "v0"});
    }

    public static void generateGraph() {
        int edgeNumber = 20000;
        int vertexNumber = 1000;

        if(edgeNumber < vertexNumber) {
            throw new RuntimeException("We do not support vertices without edges");
        }

        StringBuilder graph = new StringBuilder();
        graph.append(edgeNumber);
        graph.append("\n");
        graph.append(vertexNumber);
        graph.append("\n");
        graph.append("99 99 99");
        graph.append("\n");

        Set<Map.Entry<Integer, Integer>> edges = new HashSet<>();

        for(int i = 0; i < vertexNumber; i++) {
            int start = i % vertexNumber;
            int end = (i + 1) % vertexNumber;
            graph.append(start);
            graph.append(" ");
            graph.append(end);
            graph.append("\n");

            Map.Entry<Integer, Integer> edge = new AbstractMap.SimpleEntry<>(start, end);
            edges.add(edge);
        }

        Random random = new Random(10000);

        while(edges.size() < edgeNumber) {
            int start = random.nextInt(vertexNumber + 1);
            int end = random.nextInt(vertexNumber + 1);

            if(start ==  end) {
                continue;
            }

            Map.Entry<Integer, Integer> edge = new AbstractMap.SimpleEntry<>(start, end);

            if(edges.contains(edge)) {
                continue;
            }

            graph.append(start);
            graph.append(" ");
            graph.append(end);
            graph.append("\n");

            edges.add(edge);
        }

        for(int i = 0; i < edgeNumber; i++) {
            graph.append(random.nextInt(10) + 1);
            graph.append(" ");
        }

        try {
            String outputFile = "/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/gpl/random.txt";
            File file = new File(outputFile);
            FileWriter writer = new FileWriter(file);
            writer.write(graph.toString());
            writer.flush();
            writer.close();

            System.out.print("File: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
