package GPL; 

import java.util.Iterator; 

import java.util.LinkedList; 
import java.util.Comparator; 
import java.util.Collections; 

//dja: added for performance improvement
import java.util.HashMap; 
import java.util.Map; 

import java.lang.Integer; 
import java.util.Set; 
import java.util.HashSet; 

// *********************************************************

public   class  Graph {
	
    public LinkedList vertices  ;

	
    public static final boolean isDirected  = false;

	

    public Graph  () {
        vertices = new LinkedList();
    
        vertices = new LinkedList();
        edges = new LinkedList();
    
        vertices = new LinkedList();
    
        vertices = new LinkedList();
	  //dja: add for performance reasons
        verticesMap = new HashMap( );

    
        vertices = new LinkedList();
        edges = new LinkedList();

	  //dja: add for performance reasons
        verticesMap = new HashMap( );

    
        vertices = new LinkedList();

	  //dja: add for performance reasons
        verticesMap = new HashMap( );

    }

	

    public VertexIter  getVertices__before__DirectedWithEdges( ) 
    { 
        // dja - trying to fix logic problems
        return new VertexIter( ) 
        {
                private Iterator iter = vertices.iterator( );
                public Vertex next( ) 
                { 
                    return ( Vertex )iter.next( ); 
                }
                public boolean hasNext( ) 
                { 
                    return iter.hasNext( ); 
                }
            };

    }

	

    public VertexIter  getVertices__role__DirectedWithEdges() {
        return new VertexIter() {
                private Iterator iter = vertices.iterator();
                public Vertex next() { return (Vertex)iter.next(); }
                public boolean hasNext() { return iter.hasNext(); }
            };
    }

	

    public VertexIter 
getVertices__before__DirectedWithNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
VertexIter tempVar_gen = getVertices__role__DirectedWithEdges();
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return getVertices__before__DirectedWithEdges();
    }
}



	

    public VertexIter  getVertices__role__DirectedWithNeighbors( ) 
    {
        return new VertexIter( ) 
        {
                private Iterator iter = vertices.iterator( );
                public Vertex next( ) 
                { 
                    return (Vertex)iter.next( ); 
                }
                public boolean hasNext( ) 
                { 
                    return iter.hasNext( ); 
                }
            };
    }

	

    public VertexIter 
getVertices__before__UndirectedOnlyVertices( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
VertexIter tempVar_gen = getVertices__role__DirectedWithNeighbors();
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return getVertices__before__DirectedWithNeighbors();
    }
}



	

    public VertexIter  getVertices__role__UndirectedOnlyVertices( )
    {
        return new VertexIter( )
        {
                private Iterator iter = vertices.iterator( );
                public Vertex next( )
                {
                    return ( Vertex )iter.next( );
                }
                public boolean hasNext( )
                {
                    return iter.hasNext( );
                }
        };
    }

	

    public VertexIter 
getVertices__before__UndirectedWithEdges( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 		long startTime_gen = System.nanoTime();
VertexIter tempVar_gen = getVertices__role__UndirectedOnlyVertices();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
		return tempVar_gen;
    } else {
        return getVertices__before__UndirectedOnlyVertices();
    }
}



	

    public VertexIter  getVertices__role__UndirectedWithEdges() {
        return new VertexIter() {
                private Iterator iter = vertices.iterator();
                public Vertex next() { return (Vertex)iter.next(); }
                public boolean hasNext() { return iter.hasNext(); }
            };
    }

	


    public VertexIter 
getVertices__before__UndirectedWithNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
VertexIter tempVar_gen = getVertices__role__UndirectedWithEdges();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return getVertices__before__UndirectedWithEdges();
    }
}



	


    public VertexIter  getVertices__role__UndirectedWithNeighbors( ) 
    {
        return new VertexIter( ) 
        {
            private Iterator iter = vertices.iterator( );
            public Vertex next( ) 
            { 
                return ( Vertex )iter.next( ); 
            }
            public boolean hasNext( ) 
            { 
                return iter.hasNext(); 
            }
        };
    }

	

    public VertexIter
getVertices( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
VertexIter tempVar_gen = getVertices__role__UndirectedWithNeighbors();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return getVertices__before__UndirectedWithNeighbors();
    }
}



	
// dja - fix compile code.
//    public EdgeIter getEdges() { return null; }
//    public EdgeIfc addEdge(Vertex start,  Vertex end) { return null; }
//    public  Vertex findsVertex( String theName ) { return null; }

    // Fall back method that stops the execution of programs
    public void  run__before__DirectedWithEdges( Vertex s ) {}

	
// dja - fix compile code.
//    public EdgeIter getEdges() { return null; }
//    public EdgeIfc addEdge(Vertex start,  Vertex end) { return null; }
//    public  Vertex findsVertex( String theName ) { return null; }

    // Fall back method that stops the execution of programs
    public void  run__role__DirectedWithEdges( Vertex s ) {}

	

    // Fall back method that stops the execution of programs
    public void 
run__before__DirectedWithNeighbors( Vertex s ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        run__role__DirectedWithEdges(s);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithEdges", featureTime_gen);
    } else {
        run__before__DirectedWithEdges(s);
    }
}



	

    // Fall back method that stops the execution of programs
    public void  run__role__DirectedWithNeighbors( Vertex s )
      { }

	
 
    // Fall back method that stops the execution of programs
    public void 
run__before__UndirectedOnlyVertices( Vertex s ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        run__role__DirectedWithNeighbors(s);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithNeighbors", featureTime_gen);
    } else {
        run__before__DirectedWithNeighbors(s);
    }
}



	
 
    // Fall back method that stops the execution of programs
    public void  run__role__UndirectedOnlyVertices( Vertex s )
    {
    }

	

    // Fall back method that stops the execution of programs
    public void 
run__before__UndirectedWithEdges( Vertex s ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices"); 		long startTime_gen = System.nanoTime();
        run__role__UndirectedOnlyVertices(s);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
    } else {
        run__before__UndirectedOnlyVertices(s);
    }
}



	

    // Fall back method that stops the execution of programs
    public void  run__role__UndirectedWithEdges( Vertex s ) {}

	

    // Fall back method that stops the execution of programs
    public void 
run__before__UndirectedWithNeighbors( Vertex s ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        run__role__UndirectedWithEdges(s);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
    } else {
        run__before__UndirectedWithEdges(s);
    }
}



	

    // Fall back method that stops the execution of programs
    public void  run__role__UndirectedWithNeighbors( Vertex s )
    {
    }

	
 
    // Fall back method that stops the execution of programs
    public void 
run__before__Connected( Vertex s ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        run__role__UndirectedWithNeighbors(s);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
    } else {
        run__before__UndirectedWithNeighbors(s);
    }
}



	
 
    // Fall back method that stops the execution of programs
    public void  run__role__Connected( Vertex s )
    {
	     	System.out.println("Connected");
        ConnectedComponents( );
        run__before__Connected( s );
    }

	
    // Executes Connected Components
    public void 
run__before__Cycle( Vertex s ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Connected) {
 verificationClasses.PerformanceProfiler.enteringFeature("Connected"); 		long startTime_gen = System.nanoTime();
        run__role__Connected(s);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: Connected Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("Connected", featureTime_gen);
    } else {
        run__before__Connected(s);
    }
}



	
    // Executes Connected Components
    public void  run__role__Cycle( Vertex s )
     {
        System.out.println( "Cycle? " + CycleCheck() );
        run__before__Cycle( s );
    }

	

    // Executes Cycle Checking
    public void 
run__before__MSTKruskal( Vertex s ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Cycle) {
 verificationClasses.PerformanceProfiler.enteringFeature("Cycle"); 		long startTime_gen = System.nanoTime();
        run__role__Cycle(s);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: Cycle Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("Cycle", featureTime_gen);
    } else {
        run__before__Cycle(s);
    }
}



	

    // Executes Cycle Checking
    public void  run__role__MSTKruskal( Vertex s )
     {
     	System.out.println("MSTKruskal");
        Graph gaux = Kruskal();
//        Graph.stopProfile();
        gaux.display();
//        Graph.resumeProfile();
        run__before__MSTKruskal( s );
    }

	

    // Executes MSTKruskal
    public void 
run__before__MSTPrim( Vertex s ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_MSTKruskal) {
 verificationClasses.PerformanceProfiler.enteringFeature("MSTKruskal"); 		long startTime_gen = System.nanoTime();
        run__role__MSTKruskal(s);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: MSTKruskal Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("MSTKruskal", featureTime_gen);
    } else {
        run__before__MSTKruskal(s);
    }
}



	

    // Executes MSTKruskal
    public void  run__role__MSTPrim( Vertex s )
     {
          	System.out.println("MSTPrim");
        Graph gaux = Prim( s );
//        Graph.stopProfile();
        gaux.display();
//        Graph.resumeProfile();
        run__before__MSTPrim( s );
    }

	

    // Executes MSTPrim
    public void 
run__before__Number( Vertex s ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_MSTPrim) {
 verificationClasses.PerformanceProfiler.enteringFeature("MSTPrim"); 		long startTime_gen = System.nanoTime();
        run__role__MSTPrim(s);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: MSTPrim Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("MSTPrim", featureTime_gen);
    } else {
        run__before__MSTPrim(s);
    }
}



	

    // Executes MSTPrim
    public void  run__role__Number( Vertex s )
     {
       	System.out.println("Number");
        NumberVertices( );
        run__before__Number( s );
    }

	
    // Executes Number Vertices
    public void
run( Vertex s ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Number) {
 verificationClasses.PerformanceProfiler.enteringFeature("Number"); 		long startTime_gen = System.nanoTime();
        run__role__Number(s);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: Number Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("Number", featureTime_gen);
    } else {
        run__before__Number(s);
    }
}



	

    //dja: fix for compile problems during performance improvements
    public void  sortVertices__before__DirectedWithEdges(Comparator c) {
        Collections.sort(vertices, c);
    }

	

    //dja: fix for compile problems during performance improvements
    public void  sortVertices__role__DirectedWithEdges(Comparator c) {
        Collections.sort(vertices, c);
    }

	

    public void 
sortVertices__before__DirectedWithNeighbors(Comparator c) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        sortVertices__role__DirectedWithEdges(c);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithEdges", featureTime_gen);
    } else {
        sortVertices__before__DirectedWithEdges(c);
    }
}



	

    public void  sortVertices__role__DirectedWithNeighbors(Comparator c) {
        Collections.sort(vertices, c);
    }

	

    //dja: fix for compile problems during performance improvements
    public void 
sortVertices__before__UndirectedWithEdges(Comparator c) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        sortVertices__role__DirectedWithNeighbors(c);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithNeighbors", featureTime_gen);
    } else {
        sortVertices__before__DirectedWithNeighbors(c);
    }
}



	

    //dja: fix for compile problems during performance improvements
    public void  sortVertices__role__UndirectedWithEdges(Comparator c) {
        Collections.sort(vertices, c);
    }

	

    public void
sortVertices(Comparator c) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        sortVertices__role__UndirectedWithEdges(c);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
    } else {
        sortVertices__before__UndirectedWithEdges(c);
    }
}



	

    // Adds an edge without weights if Weighted layer is not present
    public void  addAnEdge__before__UndirectedOnlyVertices( Vertex start,  Vertex end, int weight )
      {
        addEdge( start,end );
    }

	

    // Adds an edge without weights if Weighted layer is not present
    public void  addAnEdge__role__UndirectedOnlyVertices( Vertex start,  Vertex end, int weight )
    {
        addEdge( start,end );
    }

	

    // Adds an edge without weights if Weighted layer is not present
    public void 
addAnEdge__before__WeightedOnlyVertices( Vertex start,  Vertex end, int weight ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices"); 		long startTime_gen = System.nanoTime();
        addAnEdge__role__UndirectedOnlyVertices(start, end, weight);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
    } else {
        addAnEdge__before__UndirectedOnlyVertices(start, end, weight);
    }
}



	

    // Adds an edge without weights if Weighted layer is not present
    public void  addAnEdge__role__WeightedOnlyVertices( Vertex start,  Vertex end, int weight )
   {
        addEdge( start,end, weight );
    }

	
    // Adds an edge with weights
    public void 
addAnEdge__before__WeightedWithNeighbors( Vertex start,  Vertex end, int weight ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedOnlyVertices) {
 verificationClasses.PerformanceProfiler.enteringFeature("WeightedOnlyVertices"); 		long startTime_gen = System.nanoTime();
        addAnEdge__role__WeightedOnlyVertices(start, end, weight);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: WeightedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("WeightedOnlyVertices", featureTime_gen);
    } else {
        addAnEdge__before__WeightedOnlyVertices(start, end, weight);
    }
}



	
    // Adds an edge with weights
    public void  addAnEdge__role__WeightedWithNeighbors( Vertex start,  Vertex end, int weight )
    {
        addEdge( start, new  Neighbor( end, weight ) );
    }

	
    // Adds an edge with weights
    public void
addAnEdge( Vertex start,  Vertex end, int weight ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("WeightedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        addAnEdge__role__WeightedWithNeighbors(start, end, weight);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: WeightedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("WeightedWithNeighbors", featureTime_gen);
    } else {
        addAnEdge__before__WeightedWithNeighbors(start, end, weight);
    }
}



	



    public void  addVertex__before__DirectedWithEdges( Vertex v ) {
        vertices.add( v );
    }

	



    protected void  addVertex__role__DirectedWithEdges( Vertex v ) {
        vertices.add( v );
    }

	

    public void 
addVertex__before__DirectedWithNeighbors( Vertex v ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        addVertex__role__DirectedWithEdges(v);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithEdges", featureTime_gen);
    } else {
        addVertex__before__DirectedWithEdges(v);
    }
}



	

    public void  addVertex__role__DirectedWithNeighbors( Vertex v ) {
        vertices.add( v );
    }

	

        
    public void 
addVertex__before__UndirectedOnlyVertices( Vertex v ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        addVertex__role__DirectedWithNeighbors(v);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithNeighbors", featureTime_gen);
    } else {
        addVertex__before__DirectedWithNeighbors(v);
    }
}



	

        
    public void  addVertex__role__UndirectedOnlyVertices( Vertex v )
    {
        vertices.add( v );

	  //dja: add for performance reasons
	  verticesMap.put( v.name, v );
    }

	

     // Adds an edge without weights if Weighted layer is not present
 //   public void addEdge( Vertex start,   NeighborIfc theNeighbor )
   // {
     //   addEdge( Vertex start,  ( Vertex ) theNeighbor )
   // }



    public void 
addVertex__before__UndirectedWithEdges( Vertex v ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices"); 		long startTime_gen = System.nanoTime();
        addVertex__role__UndirectedOnlyVertices(v);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
    } else {
        addVertex__before__UndirectedOnlyVertices(v);
    }
}



	

     // Adds an edge without weights if Weighted layer is not present
 //   public void addEdge( Vertex start,   NeighborIfc theNeighbor )
   // {
     //   addEdge( Vertex start,  ( Vertex ) theNeighbor )
   // }



    protected void  addVertex__role__UndirectedWithEdges( Vertex v ) {
        vertices.add( v );

	  //dja: add for performance reasons
	  verticesMap.put( v.name, v );

    }

	

    public void 
addVertex__before__UndirectedWithNeighbors( Vertex v ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        addVertex__role__UndirectedWithEdges(v);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
    } else {
        addVertex__before__UndirectedWithEdges(v);
    }
}



	

    public void  addVertex__role__UndirectedWithNeighbors( Vertex v ) 
    {
        vertices.add( v );

	  //dja: add for performance reasons
	  verticesMap.put( v.name, v );
    }

	

        
    public void
addVertex( Vertex v ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        addVertex__role__UndirectedWithNeighbors(v);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
    } else {
        addVertex__before__UndirectedWithNeighbors(v);
    }
}



	

    // Adds and edge by setting end as adjacent to start vertices
    public EdgeIfc  addEdge__before__DirectedWithEdges( Vertex start,  Vertex end ) {
        start.addAdjacent( end );
        return( EdgeIfc ) start;
    }

	

    // Adds and edge by setting end as adjacent to start vertices
    public EdgeIfc  addEdge__role__DirectedWithEdges(Vertex start,  Vertex end) {
        Edge theEdge = new  Edge();
        theEdge.EdgeConstructor( start, end );
        edges.add( theEdge );
        start.addNeighbor( new  Neighbor( end, theEdge ) );
        //end.addNeighbor( new  Neighbor( start, theEdge ) );

        return theEdge;
    }

	

    // Adds an edge without weights if Weighted layer is not present
    public EdgeIfc 
addEdge__before__DirectedWithNeighbors( Vertex start,  Vertex end ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
EdgeIfc tempVar_gen = addEdge__role__DirectedWithEdges(start, end);
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return addEdge__before__DirectedWithEdges(start, end);
    }
}



	

    // Adds an edge without weights if Weighted layer is not present
    public EdgeIfc  addEdge__role__DirectedWithNeighbors( Vertex start,  Vertex end )
    {
	  Neighbor e = new Neighbor( end );
        addEdge( start, e );
        return e;
    }

	


    // Adds an edge without weights if Weighted layer is not present
//    public void addAnEdge( Vertex start,  Vertex end, int weight )
  //    {
    //    addEdge( start, new  Neighbor( end ) );
//    }

    // Adds an edge without weights if Weighted layer is not present
    public EdgeIfc 
addEdge__before__UndirectedOnlyVertices( Vertex start,  Vertex end ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
EdgeIfc tempVar_gen = addEdge__role__DirectedWithNeighbors(start, end);
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return addEdge__before__DirectedWithNeighbors(start, end);
    }
}



	


    // Adds an edge without weights if Weighted layer is not present
//    public void addAnEdge( Vertex start,  Vertex end, int weight )
  //    {
    //    addEdge( start, new  Neighbor( end ) );
//    }

    // Adds an edge without weights if Weighted layer is not present
    public EdgeIfc  addEdge__role__UndirectedOnlyVertices( Vertex start,  Vertex end )
    {
        start.addAdjacent( end );
        end.addAdjacent( start );
        return ( EdgeIfc ) start;
    }

	

    // Adds and edge by setting start as adjacent to end and
    // viceversa
    public EdgeIfc 
addEdge__before__UndirectedWithEdges( Vertex start,  Vertex end ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 		long startTime_gen = System.nanoTime();
EdgeIfc tempVar_gen = addEdge__role__UndirectedOnlyVertices(start, end);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
		return tempVar_gen;
    } else {
        return addEdge__before__UndirectedOnlyVertices(start, end);
    }
}



	

    // Adds and edge by setting start as adjacent to end and
    // viceversa
    public EdgeIfc  addEdge__role__UndirectedWithEdges(Vertex start,  Vertex end) {
        Edge theEdge = new  Edge();
        theEdge.EdgeConstructor( start, end );
        edges.add( theEdge );
        start.addNeighbor( new  Neighbor( end, theEdge ) );
        end.addNeighbor( new  Neighbor( start, theEdge ) );

        return theEdge;
    }

	

    // Adds an edge without weights if Weighted layer is not present
    public EdgeIfc 
addEdge__before__UndirectedWithNeighbors( Vertex start,  Vertex end ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
EdgeIfc tempVar_gen = addEdge__role__UndirectedWithEdges(start, end);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return addEdge__before__UndirectedWithEdges(start, end);
    }
}



	

    // Adds an edge without weights if Weighted layer is not present
    public EdgeIfc  addEdge__role__UndirectedWithNeighbors( Vertex start,  Vertex end )
      {
	  Neighbor e = new Neighbor( end );
        addEdge( start, e );
        return e;
    }

	

    // Adds an edge without weights if Weighted layer is not present
    public EdgeIfc
addEdge( Vertex start,  Vertex end ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
EdgeIfc tempVar_gen = addEdge__role__UndirectedWithNeighbors(start, end);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return addEdge__before__UndirectedWithNeighbors(start, end);
    }
}



	

    // Finds a vertex given its name in the vertices list
    public Vertex  findsVertex__before__DirectedWithEdges( String theName )
      {
        int i=0;
        Vertex theVertex;

        // if we are dealing with the root
        if ( theName==null )
            return null;

        for( i=0; i<vertices.size(); i++ )
            {
            theVertex = ( Vertex )vertices.get( i );
            if ( theName.equals( theVertex.name ) )
                return theVertex;
        }
        return null;
    }

	

    // Finds a vertex given its name in the vertices list
    public Vertex  findsVertex__role__DirectedWithEdges( String theName )
      {
        Vertex theVertex = null;

        // if we are dealing with the root
        if ( theName==null )
            return null;

        for(VertexIter vxiter = getVertices(); vxiter.hasNext(); )
        {
            theVertex = vxiter.next();
            if ( theName.equals( theVertex.getName() ) )
                return theVertex;
        }

        return theVertex;
    }

	

    // Finds a vertex given its name in the vertices list
    public Vertex 
findsVertex__before__DirectedWithNeighbors( String theName ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = findsVertex__role__DirectedWithEdges(theName);
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return findsVertex__before__DirectedWithEdges(theName);
    }
}



	

    // Finds a vertex given its name in the vertices list
    public Vertex  findsVertex__role__DirectedWithNeighbors( String theName )
      {
        Vertex theVertex = null;

        // if we are dealing with the root
        if ( theName==null )
        {
            return null;
        }

        for(VertexIter vxiter = getVertices( ); vxiter.hasNext( ); )
        {
            theVertex = vxiter.next( );
            if ( theName.equals( theVertex.getName( ) ) )
            {
                return theVertex;
            }
        }

        return theVertex;
    }

	
    
    // Finds a vertex given its name in the vertices list
    public Vertex 
findsVertex__before__UndirectedOnlyVertices( String theName ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = findsVertex__role__DirectedWithNeighbors(theName);
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return findsVertex__before__DirectedWithNeighbors(theName);
    }
}



	
    
    // Finds a vertex given its name in the vertices list
    public Vertex  findsVertex__role__UndirectedOnlyVertices( String theName )
      {
        int i=0;
        Vertex theVertex;

        // if we are dealing with the root
        if ( theName == null )
            return null;

	  //dja: removed for performance reasons
//        for( i=0; i<vertices.size(); i++ )
//        {
//            theVertex = ( Vertex )vertices.get( i );
//            if ( theName.equals( theVertex.name ) )
//                return theVertex;
//        }
//        return null;

	  //dja: add for performance reasons
	  return ( Vertex ) verticesMap.get( theName );
    }

	

    // Finds a vertex given its name in the vertices list
    public Vertex 
findsVertex__before__UndirectedWithEdges( String theName ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = findsVertex__role__UndirectedOnlyVertices(theName);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
		return tempVar_gen;
    } else {
        return findsVertex__before__UndirectedOnlyVertices(theName);
    }
}



	

    // Finds a vertex given its name in the vertices list
    public Vertex  findsVertex__role__UndirectedWithEdges( String theName ) {
        Vertex theVertex;

        // if we are dealing with the root
        if ( theName==null )
            return null;

	  //dja: removed for performance reasons
//        for( VertexIter vxiter = getVertices(); vxiter.hasNext(); )
//        {
//            theVertex = vxiter.next();
//            if ( theName.equals( theVertex.getName() ) )
//                return theVertex;
//        }
//        return null;

	  //dja: add for performance reasons
	  return ( Vertex ) verticesMap.get( theName );

    }

	

    // Finds a vertex given its name in the vertices list
    public Vertex 
findsVertex__before__UndirectedWithNeighbors( String theName ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = findsVertex__role__UndirectedWithEdges(theName);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return findsVertex__before__UndirectedWithEdges(theName);
    }
}



	

    // Finds a vertex given its name in the vertices list
    public Vertex  findsVertex__role__UndirectedWithNeighbors( String theName )
    {
        Vertex theVertex;
        
        // if we are dealing with the root
        if ( theName == null )
            return null;

	  //dja: removed for performance reasons
//        for( VertexIter vxiter = getVertices( ); vxiter.hasNext( ); )
//        {
//            theVertex = vxiter.next( );
//            if ( theName.equals( theVertex.getName( ) ) )
//            {
//               return theVertex;
//            }
//        }
//        return null;

	  //dja: add for performance reasons
	  return ( Vertex ) verticesMap.get( theName );

    }

	
   
    // Finds a vertex given its name in the vertices list
    public  Vertex
findsVertex( String theName ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = findsVertex__role__UndirectedWithNeighbors(theName);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return findsVertex__before__UndirectedWithNeighbors(theName);
    }
}



	

    public void  display__before__DirectedWithEdges() {
        int s = vertices.size();
        int i;

        System.out.println( "******************************************" );
        System.out.println( "Vertices " );
        for ( i=0; i<s; i++ )
            ( ( Vertex ) vertices.get( i ) ).display();
        System.out.println( "******************************************" );

    }

	

    public void  display__role__DirectedWithEdges() {
        int i;

        System.out.println( "******************************************" );
        System.out.println( "Vertices " );
        for ( VertexIter vxiter = getVertices(); vxiter.hasNext() ; )
            vxiter.next().display();

        System.out.println( "******************************************" );
        System.out.println( "Edges " );
        for ( EdgeIter edgeiter = getEdges(); edgeiter.hasNext(); )
            edgeiter.next().display();

        System.out.println( "******************************************" );
    }

	

    public void 
display__before__DirectedWithNeighbors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        display__role__DirectedWithEdges();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithEdges", featureTime_gen);
    } else {
        display__before__DirectedWithEdges();
    }
}



	

    public void  display__role__DirectedWithNeighbors( ) 
    {
        System.out.println( "******************************************" );
        System.out.println( "Vertices " );
        for ( VertexIter vxiter = getVertices( ); vxiter.hasNext( ) ; )
        {
            vxiter.next( ).display( );
        }
        System.out.println( "******************************************" );

    }

	

    
    public void 
display__before__UndirectedOnlyVertices() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        display__role__DirectedWithNeighbors();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithNeighbors", featureTime_gen);
    } else {
        display__before__DirectedWithNeighbors();
    }
}



	

    
    public void  display__role__UndirectedOnlyVertices() {
        int s = vertices.size();
        int i;

        System.out.println( "******************************************" );
        System.out.println( "Vertices " );
        for ( i=0; i<s; i++ )
            ( ( Vertex ) vertices.get( i ) ).display();
        System.out.println( "******************************************" );

    }

	

    public void 
display__before__UndirectedWithEdges() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices"); 		long startTime_gen = System.nanoTime();
        display__role__UndirectedOnlyVertices();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
    } else {
        display__before__UndirectedOnlyVertices();
    }
}



	

    public void  display__role__UndirectedWithEdges() {
        System.out.println( "******************************************" );
        System.out.println( "Vertices " );
        for ( VertexIter vxiter = getVertices(); vxiter.hasNext() ; )
            vxiter.next().display();

        System.out.println( "******************************************" );
        System.out.println( "Edges " );
        for ( EdgeIter edgeiter = getEdges(); edgeiter.hasNext(); )
            edgeiter.next().display();

        System.out.println( "******************************************" );
    }

	

    public void 
display__before__UndirectedWithNeighbors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        display__role__UndirectedWithEdges();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
    } else {
        display__before__UndirectedWithEdges();
    }
}



	

    public void  display__role__UndirectedWithNeighbors( ) 
    {
        System.out.println( "******************************************" );
        System.out.println( "Vertices " );
        for ( VertexIter vxiter = getVertices( ); vxiter.hasNext( ) ; )
        {
            vxiter.next( ).display( );
        }

        System.out.println( "******************************************" );
    }

	


    public void 
display__before__WeightedOnlyVertices() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        display__role__UndirectedWithNeighbors();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
    } else {
        display__before__UndirectedWithNeighbors();
    }
}



	


    public void  display__role__WeightedOnlyVertices() 
   {
        display__before__WeightedOnlyVertices();
    }

	
    
    public void 
display__before__WeightedWithNeighbors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedOnlyVertices) {
 verificationClasses.PerformanceProfiler.enteringFeature("WeightedOnlyVertices"); 		long startTime_gen = System.nanoTime();
        display__role__WeightedOnlyVertices();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: WeightedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("WeightedOnlyVertices", featureTime_gen);
    } else {
        display__before__WeightedOnlyVertices();
    }
}



	
    
    public void  display__role__WeightedWithNeighbors() 
    {
        display__before__WeightedWithNeighbors();
    }

	
    
    public void
display() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("WeightedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        display__role__WeightedWithNeighbors();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: WeightedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("WeightedWithNeighbors", featureTime_gen);
    } else {
        display__before__WeightedWithNeighbors();
    }
}



	
    private LinkedList edges  ;

	

    public void  sortEdges__before__UndirectedWithEdges(Comparator c) {
        Collections.sort(edges, c);
    }

	

    public void  sortEdges__role__UndirectedWithEdges(Comparator c) {
        Collections.sort(edges, c);
    }

	

    public void
sortEdges(Comparator c) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        sortEdges__role__UndirectedWithEdges(c);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
    } else {
        sortEdges__before__UndirectedWithEdges(c);
    }
}



	


    public EdgeIter  getEdges__before__UndirectedWithEdges() {
        return new EdgeIter() {
                private Iterator iter = edges.iterator();
                public EdgeIfc next() { return (EdgeIfc)iter.next(); }
                public boolean hasNext() { return iter.hasNext(); }
            };
    }

	


    public EdgeIter  getEdges__role__UndirectedWithEdges() {
        return new EdgeIter() {
                private Iterator iter = edges.iterator();
                public EdgeIfc next() { return (EdgeIfc)iter.next(); }
                public boolean hasNext() { return iter.hasNext(); }
            };
    }

	

    public EdgeIter
getEdges() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
EdgeIter tempVar_gen = getEdges__role__UndirectedWithEdges();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return getEdges__before__UndirectedWithEdges();
    }
}



	
   
    public void  addEdge__before__UndirectedWithNeighbors( Vertex start,  Neighbor theNeighbor ) {
        start.addEdge( theNeighbor );
    }

	
   
    public void  addEdge__role__UndirectedWithNeighbors( Vertex start,   Neighbor theNeighbor ) 
    {
        start.addEdge( theNeighbor );
        Vertex end = theNeighbor.neighbor;
        end.addEdge( new  Neighbor( start ) );
    }

	

    // Adds an edge without weights if Weighted layer is not present
    public void 
addEdge__before__WeightedWithNeighbors( Vertex start,  Neighbor theNeighbor ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        addEdge__role__UndirectedWithNeighbors(start, theNeighbor);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
    } else {
        addEdge__before__UndirectedWithNeighbors(start, theNeighbor);
    }
}



	

    // Adds an edge without weights if Weighted layer is not present
    public void  addEdge__role__WeightedWithNeighbors( Vertex start,  Neighbor theNeighbor )
    {
        addEdge__before__WeightedWithNeighbors( start,theNeighbor );
          
        // At this point the edges are added.
        // If there is an adorn like weight it has to be added to
        // the neighbor already present there
        if ( isDirected==false ) 
      {
            // It has to add ONLY the weight object to the neighbor
            Vertex end = theNeighbor.neighbor;
            end.addWeight( end,theNeighbor.weight );
        
        } // of else
    }

	
      
    public void
addEdge( Vertex start,  Neighbor theNeighbor ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("WeightedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        addEdge__role__WeightedWithNeighbors(start, theNeighbor);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: WeightedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("WeightedWithNeighbors", featureTime_gen);
    } else {
        addEdge__before__WeightedWithNeighbors(start, theNeighbor);
    }
}



	
      
    //dja: add for performance reasons
    private Map verticesMap  ;

	
   public EdgeIfc  findsEdge__before__UndirectedWithEdges( Vertex theSource,
                    Vertex theTarget )
       {
        //dja: performance improvement
//        for( VertexIter vertexiter = getVertices(); vertexiter.hasNext(); )
//         {
//        Vertex v1 = vertexiter.next( );
//        for( EdgeIter edgeiter = v1.getEdges(); edgeiter.hasNext(); )
//            {
//                EdgeIfc theEdge = edgeiter.next();
//            Vertex v2 = theEdge.getOtherVertex( v1 );
//              if ( ( v1.getName().equals( theSource.getName() ) &&
//                       v2.getName().equals( theTarget.getName() ) ) ||
//                         ( v1.getName().equals( theTarget.getName() ) &&
//                     v2.getName().equals( theSource.getName() ) ) )
//                    return theEdge;
//            }
//        }
        Vertex v1 = theSource;
        for( EdgeIter edgeiter = v1.getEdges(); edgeiter.hasNext(); )
            {
                EdgeIfc theEdge = edgeiter.next();
            Vertex v2 = theEdge.getOtherVertex( v1 );
              if ( ( v1.getName().equals( theSource.getName() ) &&
                       v2.getName().equals( theTarget.getName() ) ) ||
                         ( v1.getName().equals( theTarget.getName() ) &&
                     v2.getName().equals( theSource.getName() ) ) )
                    return theEdge;
            }
        return null;
    }

	
   public EdgeIfc  findsEdge__role__UndirectedWithEdges( Vertex theSource,
                    Vertex theTarget )
       {
        EdgeIfc theEdge;

	  // dja: performance improvement
      //  for( EdgeIter edgeiter = getEdges(); edgeiter.hasNext(); )
        for( EdgeIter edgeiter = theSource.getEdges(); edgeiter.hasNext(); )
         {
            theEdge = edgeiter.next();
            if ( ( theEdge.getStart().getName().equals( theSource.getName() ) &&
                  theEdge.getEnd().getName().equals( theTarget.getName() ) ) ||
                 ( theEdge.getStart().getName().equals( theTarget.getName() ) &&
                  theEdge.getEnd().getName().equals( theSource.getName() ) ) )
                return theEdge;
        }
        return null;
    }

	

    // Finds an Edge given both of its vertices
    public EdgeIfc 
findsEdge__before__UndirectedWithNeighbors( Vertex theSource,
                    Vertex theTarget ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
EdgeIfc tempVar_gen = findsEdge__role__UndirectedWithEdges(theSource, theTarget);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return findsEdge__before__UndirectedWithEdges(theSource, theTarget);
    }
}



	

    // Finds an Edge given both of its vertices
    public EdgeIfc  findsEdge__role__UndirectedWithNeighbors( Vertex theSource,
                    Vertex theTarget )
       {
	  //dja: performance improvement
        //for( VertexIter vertexiter = getVertices(); vertexiter.hasNext(); )
        // {
	  //	Vertex v1 = vertexiter.next( );
	  //	for( EdgeIter edgeiter = v1.getEdges(); edgeiter.hasNext(); )
        //    {
	  //          EdgeIfc theEdge = edgeiter.next();
	  //		Vertex v2 = theEdge.getOtherVertex( v1 );
        //	      if ( ( v1.getName().equals( theSource.getName() ) &&
        //    	       v2.getName().equals( theTarget.getName() ) ) ||
        //         	     ( v1.getName().equals( theTarget.getName() ) &&
        //          	 v2.getName().equals( theSource.getName() ) ) )
        //        	return theEdge;
        //    }
        //}
		Vertex v1 = theSource;
		for( EdgeIter edgeiter = v1.getEdges(); edgeiter.hasNext(); )
            {
	            EdgeIfc theEdge = edgeiter.next();
			Vertex v2 = theEdge.getOtherVertex( v1 );
      	      if ( ( v1.getName().equals( theSource.getName() ) &&
            	       v2.getName().equals( theTarget.getName() ) ) ||
                 	     ( v1.getName().equals( theTarget.getName() ) &&
                  	 v2.getName().equals( theSource.getName() ) ) )
                	return theEdge;
            }
        return null;
    }

	

    // Finds an Edge given both of its vertices
    public  EdgeIfc
findsEdge( Vertex theSource,
                    Vertex theTarget ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
EdgeIfc tempVar_gen = findsEdge__role__UndirectedWithNeighbors(theSource, theTarget);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return findsEdge__before__UndirectedWithNeighbors(theSource, theTarget);
    }
}



	
 
    public void addEdge( Vertex start,  Vertex end, int weight )
   {
        addEdge( start,end ); // adds the start and end as adjacent
        start.addWeight( weight ); // the direction layer takes care of that
                
        // if the graph is undirected you have to include 
        // the weight of the edge coming back
        if ( isDirected==false )
            end.addWeight( weight );
    }

	
    public void  GraphSearch__before__DFS( WorkSpace w ) 
    {
        // Step 1: initialize visited member of all nodes
        VertexIter vxiter = getVertices( );
        if ( vxiter.hasNext( ) == false )
        {
            return;
        }

        // Showing the initialization process
        while(vxiter.hasNext( ) ) 
        {
            Vertex v = vxiter.next( );
            v.init_vertex( w );
        }

        // Step 2: traverse neighbors of each node
        for (vxiter = getVertices( ); vxiter.hasNext( ); ) 
        {
            Vertex v = vxiter.next( );
            if ( !v.visited ) 
            {
                w.nextRegionAction( v );
                v.nodeSearch( w );
            }
        } //end for
    }

	
    public void  GraphSearch__role__DFS( WorkSpace w ) 
    {
        // Step 1: initialize visited member of all nodes
        VertexIter vxiter = getVertices( );
        if ( vxiter.hasNext( ) == false )
        {
            return; // if there are no vertices return
        }

        // Initializing the vertices
        while( vxiter.hasNext( ) ) 
        {
            Vertex v = vxiter.next( );
            v.init_vertex( w );
        }

        // Step 2: traverse neighbors of each node
        for( vxiter = getVertices( ); vxiter.hasNext( ); ) 
        {
            Vertex v = vxiter.next( );
            if ( !v.visited ) 
            {
                w.nextRegionAction( v );
                v.nodeSearch( w );
            }
        } 
    }

	
    public void
GraphSearch( WorkSpace w ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
 verificationClasses.PerformanceProfiler.enteringFeature("DFS"); 		long startTime_gen = System.nanoTime();
        GraphSearch__role__DFS(w);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DFS Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DFS", featureTime_gen);
    } else {
        GraphSearch__before__DFS(w);
    }
}



	

    public void ConnectedComponents( ) 
    {
        GraphSearch( new RegionWorkSpace( ) );
    }

	
              
    public boolean CycleCheck() {
        CycleWorkSpace c = new CycleWorkSpace( isDirected );
        GraphSearch( c );
        return c.AnyCycles;
    }

	

    public  Graph Kruskal() {

        // 1. A <- Empty set
        LinkedList A = new LinkedList();

        // 2. for each vertex v E V[G]
        // 3.    do Make-Set(v)

        for ( VertexIter vxiter = getVertices(); vxiter.hasNext(); )
        {
            Vertex v = vxiter.next();
            v.representative = v; // I am in my set
            v.members = new LinkedList(); // I have no members in my set
        }

        // 4. sort the edges of E by nondecreasing weight w
        // Creates the edges objects
        //int j;
        LinkedList Vneighbors = new LinkedList();
        //Vertex u;

        // Sort the Edges in non decreasing order
        sortEdges(
            new Comparator() {
                public int compare( Object o1, Object o2 )
                 {
                Edge e1 = ( Edge )o1;
                Edge e2 = ( Edge )o2;
                if ( e1.getWeight() < e2.getWeight() )
                    return -1;
                if ( e1.getWeight() == e2.getWeight() )
                    return 0;
                return 1;
                }
        } );

        // 5. for each edge in the nondecresing order
        Vertex vaux, urep, vrep;

        for( EdgeIter edgeiter = getEdges(); edgeiter.hasNext(); )
        {
            // 6. if Find-Set(u)!=Find-Set(v)
            EdgeIfc e1 = edgeiter.next();
            Vertex u = e1.getStart();
            Vertex v = e1.getEnd();

            if ( ! ( v.representative.getName() ).equals( u.representative.getName() ) )
              {
                // 7. A <- A U {(u,v)}
                A.add( e1 );

                // 8. Union(u,v)
                urep = u.representative;
                vrep = v.representative;

                if ( ( urep.members ).size() > ( vrep.members ).size() )
                    { // we add elements of v to u
                    for( int j=0; j< ( vrep.members ).size(); j++ )
                          {
                        vaux = ( Vertex ) ( vrep.members ).get( j );
                        vaux.representative = urep;
                        ( urep.members ).add( vaux );
                    }
                    v.representative = urep;
                    vrep.representative = urep;
                    ( urep.members ).add( v );
                    if ( !v.equals( vrep ) )
                        ( urep.members ).add( vrep );
                    ( vrep.members ).clear();
                }
                else
                     { // we add elements of u to v
                    for( int j=0; j< ( urep.members ).size(); j++ )
                           {
                        vaux = ( Vertex ) ( urep.members ).get( j );
                        vaux.representative = vrep;
                        ( vrep.members ).add( vaux );
                    }
                    u.representative = vrep;
                    urep.representative = vrep;
                    ( vrep.members ).add( u );
                    if ( !u.equals( urep ) )
                        ( vrep.members ).add( urep );
                    ( urep.members ).clear();

                } // else

            } // of if

        } // of for numedges

        // 9. return A
        // Creates the new Graph that contains the SSSP
        String theName;
        Graph newGraph = new  Graph();

        // Creates and adds the vertices with the same name
        for ( VertexIter vxiter = getVertices(); vxiter.hasNext(); )
      {
            theName = vxiter.next().getName();
            newGraph.addVertex( new  Vertex().assignName( theName ) );
        }

        // Creates the edges from the NewGraph
        Vertex theStart, theEnd;
        Vertex theNewStart, theNewEnd;
        EdgeIfc   theEdge;

        // For each edge in A we find its two vertices
        // make an edge for the new graph from with the correspoding
        // new two vertices
        for( int i=0; i<A.size(); i++ )
       {
            // theEdge with its two vertices
            theEdge = ( Edge )A.get( i );
            theStart = theEdge.getStart();
            theEnd = theEdge.getEnd();

            // Find the references in the new Graph
            theNewStart = newGraph.findsVertex( theStart.getName() );
            theNewEnd = newGraph.findsVertex( theEnd.getName() );

            // Creates the new edge with new start and end vertices
            // in the newGraph
            // and ajusts the adorns based on the old edge
            // Adds the new edge to the newGraph
            // dja - the fix below fixes a bug where the proper adjust adorns gets called
//            EdgeIfc theNewEdge = newGraph.addEdge( theNewStart, theNewEnd );
//            theNewEdge.adjustAdorns( theEdge );
            Edge theNewEdge = ( Edge ) newGraph.addEdge( theNewStart, theNewEnd );
            theNewEdge.adjustAdorns( ( Edge )  theEdge );
        }
        return newGraph;

    }

	

    public  Graph Prim( Vertex r ) {
        Vertex root;

        root = r;
        Vertex x;

        // 2. and 3. Initializes the vertices
        for ( VertexIter vxiter = getVertices(); vxiter.hasNext(); )
        {
            x = vxiter.next();
            x.pred = null;
            x.key = Integer.MAX_VALUE;
        }

        // 4. and 5.
        root.key = 0;
        root.pred = null;

        // 2. S <- empty set

        // 1. Queue <- V[G], copy the vertex in the graph in the priority queue
        LinkedList Queue = new LinkedList();
	  //dja: added for performance reasons
        Set indx = new HashSet( );

        // Inserts the root at the head of the queue
        //dja: Moved from below the for loop for performance reasons
        Queue.add( root );
     
        //dja: added for performance reasons
        indx.add( root.getName( ) );
        for ( VertexIter vxiter = getVertices(); vxiter.hasNext(); )
        {
            x = vxiter.next();
            if ( x.key != 0 ) // this means, if this is not the root
            {
                Queue.add( x );
	          //dja: added for performance reasons
                indx.add( x.getName( ) );
            }
        }

        // Inserts the root at the head of the queue
        //dja: moved above for loop for perf. reasons
        // Queue.addFirst( root );

        // 6. while Q!=0
        Vertex ucurrent;
        int j,k,l;
        int pos;
        LinkedList Uneighbors;
        Vertex u,v;
        EdgeIfc en;
        NeighborIfc vn;

        int wuv;
        boolean isNeighborInQueue = false;

        // Queue is a list ordered by key values.
        // At the beginning all key values are INFINITUM except
        // for the root whose value is 0.
        while ( Queue.size()!=0 )
        {
            // 7. u <- Extract-Min(Q);
            // Since this is an ordered queue the first element is the min
            u = ( Vertex )Queue.removeFirst();

		//dja: added code below for per. reasons
            indx.remove( u.getName( ) );
            

            // 8. for each vertex v adjacent to u
            Uneighbors = u.getNeighborsObj( );

            // dja - fix compile erros
            // for( EdgeIter edgeiter = u.getEdges(); edgeiter.hasNext(); )
            k = 0;
            for( EdgeIter edgeiter = u.getEdges(); edgeiter.hasNext(); k++ )
            {
                vn = ( NeighborIfc )Uneighbors.get( k );
                // dja - fix compile bug
                // en = edgeiter.next();
//                en = ( Edge ) edgeiter.next();
                en = edgeiter.next();

                v = en.getOtherVertex(u);

                // Check to see if the neighbor is in the queue
                isNeighborInQueue = false;

                // if the Neighor is in the queue
		    //dja: removed 2 lines for performance reasons and added 3rd line.  left 4th line alone
                //int indexNeighbor = Queue.indexOf( v );
                //if ( indexNeighbor>=0 )
                if ( indx.contains( v.getName( ) ) )
                    isNeighborInQueue = true;
                wuv = en.getWeight();

                // 9. Relax (u,v w)
                if ( isNeighborInQueue && ( wuv < v.key ) )
                    {
                    v.key = wuv;
                    v.pred = u.getName();
                    Uneighbors.set( k,vn ); // adjust values in the neighbors

                    // update the values of v in the queue
                    // Remove v from the Queue so that we can reinsert it
                    // in a new place according to its new value to keep
                    // the Linked List ordered
		        //dja: added for perf. reasons
			  Object residue = ( Object ) v;
                    Queue.remove( residue );
	              // Object residue = Queue.remove( indexNeighbor );

			  //dja: added for performance reasons
                    indx.remove( v.getName( ) );

                    // Get the new position for v
                    int position = Collections.binarySearch( Queue,v,
                                              new Comparator() {
                        public int compare( Object o1, Object o2 )
                                                 {
                            Vertex v1 = ( Vertex )o1;
                            Vertex v2 = ( Vertex )o2;

                            if ( v1.key < v2.key )
                                return -1;
                            if ( v1.key == v2.key )
                                return 0;
                            return 1;
                        }
                    } );

                    // Adds v in its new position in Queue
                    if ( position < 0 )  // means it is not there
                                         {
                        Queue.add( - ( position+1 ),v );
                    }
                    else      // means it is there
                                         {
                        Queue.add( position,v );
                    }
                
 			  //dja: added for perf. reasons
                    indx.add( v.getName( ) );

                } // if 8-9.
            } // for all neighbors
        } // of while

        // Creates the new Graph that contains the SSSP
        String theName;
        Graph newGraph = new  Graph();

        // Creates and adds the vertices with the same name
        // dja - fixed compile bug
        // for ( i=0; i<numvertices; i++ )
        for ( VertexIter vxiter = getVertices( ); vxiter.hasNext( ); )
        {
            // dja - fixing compile bugs
            // theName = ( ( Vertex )vertices.get( i ) ).name;
            Vertex vtx = vxiter.next( );
            theName = vtx.name;

            newGraph.addVertex( new  Vertex().assignName( theName ) );
        }

        // Creates the edges from the NewGraph
        Vertex theVertex, thePred;
        Vertex theNewVertex, theNewPred;
        EdgeIfc   e;

        // Creates and adds the vertices with the same name
        // dja - fixed compile bug
        // for ( i=0; i<numvertices; i++ )
        for ( VertexIter vxiter = getVertices( ); vxiter.hasNext( ); )
        {
            // theVertex and its Predecessor
            // dja - fixing compile bugs
            // theVertex = ( Vertex )vertices.get( i );
            theVertex = vxiter.next( );

            thePred = findsVertex( theVertex.pred );

            // if theVertex is the source then continue we dont need
            // to create a new edge at all
            if ( thePred==null )
                continue;

            // Find the references in the new Graph
            theNewVertex = newGraph.findsVertex( theVertex.name );
            theNewPred = newGraph.findsVertex( thePred.name );

            // Creates the new edge from predecessor -> vertex in the newGraph
            // and ajusts the adorns based on the old edge
//            EdgeIfc theNewEdge = new  Edge();

            // dja - fix compile errors
            // theNewEdge.EdgeConstructor( theNewPred, theNewVertex );
            EdgeIfc theNewEdge = newGraph.addEdge( theNewPred, theNewVertex );

            // dja - fix compile errors
            // e = findsEdge( thePred,theVertex );
            e = findsEdge( thePred,theVertex );

            // dja - fix comple errors
            // theNewEdge.adjustAdorns( e );
            theNewEdge.adjustAdorns( e );


            // Adds the new edge to the newGraph
            // dja - fix compile errors
            // newGraph.addEdge( theNewEdge );
        }
        return newGraph;

    }

	

    public void NumberVertices( ) 
    {
        GraphSearch( new NumberWorkSpace( ) );
    }

	

    public  Graph ComputeTranspose( Graph the_graph )
   {
        int i;
        String theName;

        //dja: added for performance improvement
        Map newVertices = new HashMap( );

        // Creating the new Graph
        Graph newGraph = new  Graph();

        // Creates and adds the vertices with the same name
        for ( VertexIter vxiter = getVertices(); vxiter.hasNext(); )
        {
            theName = vxiter.next().getName();
            //dja: changes for performance improvement
            Vertex v = new  Vertex( ).assignName( theName );
//            newGraph.addVertex( new  Vertex().assignName( theName ) );
            newGraph.addVertex( v );

            //dja: added for performance improvement
            newVertices.put( theName, v );
        }

        Vertex theVertex, newVertex;
        Vertex theNeighbor;
        Vertex newAdjacent;
        EdgeIfc newEdge;

        // adds the transposed edges
        // dja: added line below for performance improvements
        VertexIter newvxiter = newGraph.getVertices( );
        for ( VertexIter vxiter = getVertices(); vxiter.hasNext(); )
        {
            // theVertex is the original source vertex
            // the newAdjacent is the reference in the newGraph to theVertex
            theVertex = vxiter.next();

            // dja: performance improvement fix
            // newAdjacent = newGraph.findsVertex( theVertex.getName() );
            newAdjacent = newvxiter.next( );

            for( VertexIter neighbors = theVertex.getNeighbors(); neighbors.hasNext(); )
            {
                // Gets the neighbor object
                theNeighbor = neighbors.next();

                // the new Vertex is the vertex that was adjacent to theVertex
                // but now in the new graph
                // dja: performance improvement fix
                // newVertex = newGraph.findsVertex( theNeighbor.getName() );
                newVertex = ( Vertex ) newVertices.get( theNeighbor.getName( ) );

                // Creates a new Edge object and adjusts the adornments
                newEdge = newGraph.addEdge( newVertex, newAdjacent );
                //newEdge.adjustAdorns( theNeighbor.edge );

                // Adds the new Neighbor object with the newly formed edge
                // newNeighbor = new $TEqn.Neighbor(newAdjacent, newEdge);
                // (newVertex.neighbors).add(newNeighbor);

            } // all adjacentNeighbors
        } // all the vertices

        return newGraph;

    }


}
