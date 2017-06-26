package edu.cmu.cs.mvelezce.gpl;


//import gov.nasa.jpf.annotation.Conditional;

import java.io.IOException;

import static edu.cmu.cs.mvelezce.Main.*;


public class Main {

	/*@(Prog)*/

    public static void splStart___() {

    }
//	
//	private static StringBuilder splBuffer = new StringBuilder();

    public static void splPrint___(String s) {
        System.out.println(s);
//		splBuffer.append(s);
//		splBuffer.append('\n');
    }

    public static void main(String[] args) {
//		if (valid()) {
        splStart___();
        mainBody___(args);
        splEnd___();
//		}

    }

    public static void splEnd___() {
        // Actually print to console
//		System.out.println(splBuffer.toString());
    }

    public static void mainBody___(String[] args) {
        // Step 1: create graph object
        Graph g = new Graph();

        // Step 2: sets up the benchmark file to read
        try {
            splPrint___("[" + args[0] + "]");
            g.runBenchmark(args[0]);

            // Step 3: reads number of vertices, number of edges
            // and weights
            int num_vertices = 0;
            int num_edges = 0;
            int dummy = 0;

            num_vertices = g.readNumber();
            num_edges = g.readNumber();
            dummy = g.readNumber();
            dummy = g.readNumber();
            dummy = g.readNumber();

            // Step 4: reserves space for vertices, edges and weights
            Vertex V[] = new Vertex[num_vertices];
            int weights[] = new int[num_edges];
            int startVertices[] = new int[num_edges];
            int endVertices[] = new int[num_edges];

            // Step 5: creates the vertices objects
            int i = 0;
            for (i = 0; i < num_vertices; i++) {
                V[i] = new Vertex().assignName("v" + i);
                g.addVertex(V[i]);
            }

            // Step 6:        reads the edges
            for (i = 0; i < num_edges; i++) {
                startVertices[i] = g.readNumber();
                endVertices[i] = g.readNumber();
            }

            // Step 7: reads the weights
            for (i = 0; i < num_edges; i++) {
                weights[i] = g.readNumber();
            }

            // Stops the benchmark reading
            g.stopBenchmark();

            // Step 8: Adds the edges
            for (i = 0; i < num_edges; i++) {
                g.addAnEdge(V[startVertices[i]], V[endVertices[i]], weights[i]);
            }

            // Executes the selected features
            Graph.startProfile();
            splPrint___("arg1: {" + args[1] + "}");
            Vertex rootVertex = g.findsVertex(args[1].trim());
            g.run(rootVertex);
            Graph.stopProfile();
            splPrint___("******************************************");
            splPrint___("<BASE graph>");
            g.display();
            Graph.resumeProfile();

            // End profiling
            Graph.endProfile();
        } catch (IOException e) {
        }
    }

    /**
     * This function is supposed to assign each feature
     * a boolean value based on a configuration file
     * But for now, it assigns a random value to each feature variable
     * so that the compiler doesn't do constant propagation
     * (which would not be correct for analyzing a product line)
     * This method must be called at the beginning of the program
     * <p>
     * public static void loadFeatures()
     * {
     * Set<Configuration> configs = FeatureUtility.getFeatureModelConfigurations(null);
     * //	edu.cmu.cs.mvelezce.Main.printToConsole("configurations size: " + configs.size());
     * <p>
     * BASE = true;
     * DIRECTED = Verify.getBoolean();
     * UNDIRECTED = Verify.getBoolean();
     * WEIGHTED = Verify.getBoolean();
     * SEARCH = Verify.getBoolean();
     * BFS = Verify.getBoolean();
     * DFS = Verify.getBoolean();
     * <p>
     * CONNECTED = Verify.getBoolean();
     * CYCLE = Verify.getBoolean();
     * MSTKRUSKAL = Verify.getBoolean();
     * MSTPRIM = Verify.getBoolean();
     * NUMBER = Verify.getBoolean();
     * SHORTEST = Verify.getBoolean();
     * STRONGLYCONNECTED = Verify.getBoolean();
     * TRANSPOSE = Verify.getBoolean();
     * <p>
     * //	Verify.ignoreIf(!FeatureUtility.isValidConfiguration(edu.cmu.cs.mvelezce.Main.class, configs));
     * }
     */

    public static boolean GPL = true;
    public static boolean MainGpl = true;
    public static boolean Alg = true;
    public static boolean Gtp = true;

//    @Conditional
    public static boolean Src = true;
//    @Conditional
    public static boolean SrcProg = true;
//    @Conditional
    public static boolean Src2 = true;
//	@Conditional
//	public static boolean BASE = true;
//	@Conditional
//	public static boolean DIRECTED = true;
//	@Conditional
//	public static boolean UNDIRECTED = false;
//	@Conditional
//	public static boolean WEIGHTED = false;
//	@Conditional
//	public static boolean SEARCH = true;
//	@Conditional
//	public static boolean BFS = true;
//	@Conditional
//	public static boolean DFS = false;
//	@Conditional
//	public static boolean NUMBER = true;
//	@Conditional
//	public static boolean CONNECTED = false;
//	@Conditional
//	public static boolean STRONGLYCONNECTED = false;
//	@Conditional
//	public static boolean TRANSPOSE = true;
//	@Conditional
//	public static boolean CYCLE = false;
//	@Conditional
//	public static boolean MSTPRIM = false;
//	@Conditional
//	public static boolean MSTKRUSKAL = false;
//	@Conditional
//	public static boolean SHORTEST = true;

    public static boolean valid() {
        return GPL && (!GPL || MainGpl) && (!MainGpl || GPL) && (!MainGpl || Alg) && (!MainGpl || Gtp) && (!MainGpl || BASE) && (!Alg || MainGpl) && (!Src || MainGpl) && (!WEIGHTED || MainGpl) && (!Gtp || MainGpl) && (!BASE || MainGpl) && (!Alg || NUMBER || CONNECTED || TRANSPOSE || STRONGLYCONNECTED || CYCLE || MSTPRIM || MSTKRUSKAL || SHORTEST) && (!NUMBER || Alg) && (!CONNECTED || Alg) && (!TRANSPOSE || Alg) && (!STRONGLYCONNECTED || Alg) && (!CYCLE || Alg) && (!MSTPRIM || Alg) && (!MSTKRUSKAL || Alg) && (!SHORTEST || Alg) && (!Src || SrcProg) && (!SrcProg || Src) && (!SrcProg || Src2) && (!SrcProg || SEARCH) && (!Src2 || SrcProg) && (!SEARCH || SrcProg) && (!Src2 || BFS || DFS) && (!BFS || Src2) && (!DFS || Src2) && (!BFS || !DFS) && (!Gtp || DIRECTED || UNDIRECTED) && (!DIRECTED || Gtp) && (!UNDIRECTED || Gtp) && (!DIRECTED || !UNDIRECTED) && (!NUMBER || Src) && (!CONNECTED || UNDIRECTED) && (!CONNECTED || Src) && (!STRONGLYCONNECTED || DIRECTED) && (!STRONGLYCONNECTED || DFS) && (!CYCLE || DFS) && (!MSTKRUSKAL || UNDIRECTED) && (!MSTKRUSKAL || WEIGHTED) && (!MSTPRIM || UNDIRECTED) && (!MSTPRIM || WEIGHTED) && (!MSTKRUSKAL || !MSTKRUSKAL || !MSTPRIM) && (!SHORTEST || DIRECTED) && (!SHORTEST || WEIGHTED) && (!STRONGLYCONNECTED || TRANSPOSE);
    }

}


