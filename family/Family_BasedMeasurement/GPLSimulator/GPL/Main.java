package GPL; 

 

class  Main {
	
    @featureHouse.FeatureAnnotation(name="TestProg")
public static void main( String[] args ) {
    	verificationClasses.FeatureSwitches.select_features();
        Graph g = new  Graph();

        Vertex pre = null;
        for(int i = 0; i < 1000; i++) {
            Vertex v = new Vertex();
            v.assignName("vertex " + i);
            g.addVertex(v);
            if(pre != null) {
               // g.addEdge(pre, v);
                g.addEdge(pre, v, i);
            }
            pre = v;
        }
		g.run(g.getVertices().next());
        g.display();

    }


}
