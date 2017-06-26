package edu.cmu.cs.mvelezce.gpl;

// *************************************************************************

import static edu.cmu.cs.mvelezce.Main.DIRECTED;

public class CycleWorkSpace implements WorkSpace {
    public boolean AnyCycles;

    public int counter;

    public static final int WHITE = 0;

    public static final int GRAY = 1;

    public static final int BLACK = 2;

    public CycleWorkSpace() {
        AnyCycles = false;
        counter = 0;
    }

    public void init_vertex(Vertex v) {
        v.VertexCycle = Integer.MAX_VALUE;
        v.VertexColor = WHITE; // initialize to white color
    }

    public void preVisitAction(Vertex v) {

        // This assigns the values on the way in
        if (v.visited != true) { // if it has not been visited then set the
            // VertexCycle accordingly
            v.VertexCycle = counter++;
            v.VertexColor = GRAY; // we make the vertex gray
        }
    }


    public void postVisitAction(Vertex v) {
        // we are done with the visiting so make it black        
        v.VertexColor = BLACK;
        counter--;
    }


    public void checkNeighborAction(Vertex vsource,
                                    Vertex vtarget) {
        // if the graph is directed is enough to check that the source node
        // is gray and the adyacent is gray also to find a cycle
        // if the graph is undirected we need to check that the adyacent is not
        // the father, if it is the father the difference in the VertexCount is
        // only one.                                   
        if (DIRECTED) {
            if ((vsource.VertexColor == GRAY) && (vtarget.VertexColor == GRAY)) {
                AnyCycles = true;
            }
        }
        else { // undirected case
            if ((vsource.VertexColor == GRAY) &&
                    (vtarget.VertexColor == GRAY) &&
                    vsource.VertexCycle != vtarget.VertexCycle + 1) {
                AnyCycles = true;
            }
        }

    } // of checkNeighboor


    //@Override
    public void nextRegionAction(Vertex v) {

    }
}