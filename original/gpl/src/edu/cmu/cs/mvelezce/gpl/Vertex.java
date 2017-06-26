package edu.cmu.cs.mvelezce.gpl;


import java.util.ArrayList;
import java.util.LinkedList;

import static edu.cmu.cs.mvelezce.Main.*;


// ************************************************************

public class Vertex {
/*@(Base)*/

    public ArrayList<Vertex> adjacentVertices;
/*@(Base)*/

    public String name;
/*@(Base)*/


    public Vertex() {
        VertexConstructor();
    }
/*@(Base)*/


    public Vertex assignName(String name) {
        this.name = name;
        return this;
    }
/*@(Base)*/


    public void addAdjacent(Vertex n) {
        adjacentVertices.add(n);
    }
/*@(Base)*/


    public ArrayList<Integer> weightsList;
/*@(Weighted)*/


    public void addWeight(int weight) {
        weightsList.add(new Integer(weight));
    }
/*@(Weighted)*/


    public void adjustAdorns(Vertex the_vertex, int index) {
        if (WEIGHTED) {
            int the_weight = the_vertex.weightsList.get(index).intValue();
            weightsList.add(new Integer(the_weight));
        }
    }
/*@(Weighted)*/


    public boolean visited;
/*@(Search)*/


    public void VertexConstructor() {
        name = null;
        adjacentVertices = new ArrayList<>();
        weightsList = new ArrayList<>();
        if (SEARCH) {
            visited = false;
        }
    }
/*@(Search)*/


    public void init_vertex(WorkSpace w) {
        visited = false;
        w.init_vertex(this);
    }
/*@(Search)*/


    public void bftNodeSearch(WorkSpace w) {
        int s, c;
        Vertex v;
        Vertex header;

        // Step 1: if preVisitAction is true or if we've already
        //         visited this node

        w.preVisitAction(this);

        if (visited) {
            return;
        }

        // Step 2: Mark as visited, put the unvisited adjacentVertices in the queue 
        //         and make the recursive call on the first element of the queue
        //         if there is such if not you are done

        visited = true;

        // Step 3: do postVisitAction now, you are no longer going through the
        // node again, mark it as black
        w.postVisitAction(this);

        s = adjacentVertices.size();

        // enqueues the vertices not visited
        for (c = 0; c < s; c++) {
            v = adjacentVertices.get(c);

            // if your neighbor has not been visited then enqueue 
            if (!v.visited) {
                GlobalVarsWrapper.Queue.add(v);
            }

        } // end of for

        // while there is something in the queue
        while (GlobalVarsWrapper.Queue.size() != 0) {
            header = (Vertex) GlobalVarsWrapper.Queue.get(0);
            GlobalVarsWrapper.Queue.remove(0);
            header.bftNodeSearch(w);
        }
    }
/*@(DFS)*/

    public void dftNodeSearch(WorkSpace w) {
        int s, c;
        Vertex v;

        // Step 1: Do preVisitAction. 
        //                        If we've already visited this node return
        w.preVisitAction(this);

        if (visited) {
            return;
        }

        // Step 2: else remember that we've visited and 
        //         visit all adjacentVertices

        visited = true;

        s = adjacentVertices.size();
        for (c = 0; c < s; c++) {
            v = adjacentVertices.get(c);
            w.checkNeighborAction(this, v);
            v.dftNodeSearch(w);

        }
        ;

        // Step 3: do postVisitAction now
        w.postVisitAction(this);
    }
/*@(Number)*/

    public int VertexNumber;
/*@(Number)*/


    public int componentNumber;
/*@(Connected)*/


    public int finishTime;
/*@(StronglyConnected)*/

    public int strongComponentNumber;
/*@(StronglyConnected)*/


    public int VertexCycle;
/*@(Cycle)*/

    public int VertexColor;
/*@(Cycle)*/
    // white ->0, gray ->1, black->2

    public String pred;
    /*@(MSTPrim)*/
    // the name of the predecessor if any
    public int key;
/*@(MSTPrim)*/
    // weight so far from s to it

    public Vertex representative;
/*@(MSTKruskal)*/

    public LinkedList<Vertex> members;
/*@(MSTKruskal)*/


    public String predecessor;
    /*@(Shortest)*/
    // the name of the predecessor if any
    public int dweight;
/*@(Shortest)*/
    // weight so far from s to it

    public void display() {
        Main.splPrint___("Printing vertex: ");
        Main.splPrint___(name);

        if (SHORTEST) {
            Main.splPrint___("ShortestPred: " + predecessor);
            Main.splPrint___("DWeight: " + dweight);
        }
        if (MSTKRUSKAL) {
            if (representative == null) {
                Main.splPrint___("Rep: null ");
            }
            else {
                Main.splPrint___("Rep: " + representative.name);
            }
        }
        if (MSTPRIM) {
            Main.splPrint___("MSTPrimPred: " + pred);
            Main.splPrint___("Key: " + key);
        }
        if (CYCLE) {
            Main.splPrint___("VertexCycle: " + VertexCycle);
        }
        if (STRONGLYCONNECTED) {
            Main.splPrint___("FinishTime: " + finishTime);
            Main.splPrint___("SCCNo: " + strongComponentNumber);
        }
        if (CONNECTED) {
            Main.splPrint___("comp: " + componentNumber);
        }
        if (NUMBER) {
            Main.splPrint___("VertexNumber: " + VertexNumber);
        }
        if (SEARCH) {
            Main.splPrint___("visisted: " + visited);
        }
        if (WEIGHTED) {
            int s = weightsList.size();
            int i;
            Main.splPrint___("Weights: ");
            for (i = 0; i < s; i++) {
                Main.splPrint___(String.valueOf(weightsList.get(i).intValue()));
            }
        }
        int s = adjacentVertices.size();
        int i;

        Main.splPrint___("Connected to: ");
        for (i = 0; i < s; i++)
            Main.splPrint___(adjacentVertices.get(i).name);
        Main.splPrint___("\n");
    }
}
