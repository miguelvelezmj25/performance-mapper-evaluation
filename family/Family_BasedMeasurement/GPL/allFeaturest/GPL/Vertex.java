package GPL; 
import java.util.Iterator; 
import java.util.LinkedList; 

import java.lang.Integer; 
import java.util.Collections; 
import java.util.Comparator; 

// ***********************************************************************
  
public   class  Vertex  implements EdgeIfc, NeighborIfc {
	
    public LinkedList adjacentVertices  ;

	
    public String name  ;

	

    public Vertex  () {
        VertexConstructor();
    
        VertexConstructor();
    
        VertexConstructor();
    
        VertexConstructor( );
    
        VertexConstructor( );
    
        VertexConstructor();
    }

	
  
    public void  VertexConstructor__before__DirectedWithEdges() {
        name      = null;
        adjacentVertices = new LinkedList();
    }

	
  
    public void  VertexConstructor__role__DirectedWithEdges() {
        name      = null;
        neighbors = new LinkedList();
    }

	

    public void 
VertexConstructor__before__DirectedWithNeighbors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        VertexConstructor__role__DirectedWithEdges();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithEdges", featureTime_gen);
    } else {
        VertexConstructor__before__DirectedWithEdges();
    }
}



	

    public void  VertexConstructor__role__DirectedWithNeighbors() {
        name      = null;
        adjacentNeighbors = new LinkedList();
    }

	

    public void 
VertexConstructor__before__UndirectedOnlyVertices() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        VertexConstructor__role__DirectedWithNeighbors();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithNeighbors", featureTime_gen);
    } else {
        VertexConstructor__before__DirectedWithNeighbors();
    }
}



	

    public void  VertexConstructor__role__UndirectedOnlyVertices( )
    {
        name      = null;
        adjacentVertices = new LinkedList();
    }

	

    public void 
VertexConstructor__before__UndirectedWithEdges() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices"); 		long startTime_gen = System.nanoTime();
        VertexConstructor__role__UndirectedOnlyVertices();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
    } else {
        VertexConstructor__before__UndirectedOnlyVertices();
    }
}



	

    public void  VertexConstructor__role__UndirectedWithEdges( ) 
    {
        name      = null;
        neighbors = new LinkedList( );
    }

	

    public void 
VertexConstructor__before__UndirectedWithNeighbors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        VertexConstructor__role__UndirectedWithEdges();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
    } else {
        VertexConstructor__before__UndirectedWithEdges();
    }
}



	

    public void  VertexConstructor__role__UndirectedWithNeighbors() 
    {
        name      = null;
        adjacentNeighbors = new LinkedList();
    }

	
      
    public void 
VertexConstructor__before__WeightedOnlyVertices() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        VertexConstructor__role__UndirectedWithNeighbors();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
    } else {
        VertexConstructor__before__UndirectedWithNeighbors();
    }
}



	
      
    public void  VertexConstructor__role__WeightedOnlyVertices() {
        VertexConstructor__before__WeightedOnlyVertices();
        weightsList = new LinkedList();
    }

	
 
    public void 
VertexConstructor__before__BFS() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedOnlyVertices) {
 verificationClasses.PerformanceProfiler.enteringFeature("WeightedOnlyVertices"); 		long startTime_gen = System.nanoTime();
        VertexConstructor__role__WeightedOnlyVertices();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: WeightedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("WeightedOnlyVertices", featureTime_gen);
    } else {
        VertexConstructor__before__WeightedOnlyVertices();
    }
}



	
 
    public void  VertexConstructor__role__BFS( ) 
    {
        VertexConstructor__before__BFS();
        visited = false;
    }

	

    public void 
VertexConstructor__before__DFS() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_BFS) {
 verificationClasses.PerformanceProfiler.enteringFeature("BFS"); 		long startTime_gen = System.nanoTime();
        VertexConstructor__role__BFS();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: BFS Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("BFS", featureTime_gen);
    } else {
        VertexConstructor__before__BFS();
    }
}



	

    public void  VertexConstructor__role__DFS( ) 
    {
        VertexConstructor__before__DFS( );
        visited = false;
    }

	

    public void
VertexConstructor() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
 verificationClasses.PerformanceProfiler.enteringFeature("DFS"); 		long startTime_gen = System.nanoTime();
        VertexConstructor__role__DFS();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DFS Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DFS", featureTime_gen);
    } else {
        VertexConstructor__before__DFS();
    }
}



	

    public Vertex  assignName__before__DirectedWithEdges( String name ) {
        this.name = name;
        return ( Vertex ) this;
    }

	

    public Vertex  assignName__role__DirectedWithEdges( String name ) {
        this.name = name;
        return ( Vertex ) this;
    }

	

    public Vertex 
assignName__before__DirectedWithNeighbors( String name ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = assignName__role__DirectedWithEdges(name);
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return assignName__before__DirectedWithEdges(name);
    }
}



	

    public Vertex  assignName__role__DirectedWithNeighbors( String name ) {
        this.name = name;
        return ( Vertex ) this;
    }

	

    public Vertex 
assignName__before__UndirectedOnlyVertices( String name ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = assignName__role__DirectedWithNeighbors(name);
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return assignName__before__DirectedWithNeighbors(name);
    }
}



	

    public Vertex  assignName__role__UndirectedOnlyVertices( String name )
    {
        this.name = name;
        return ( Vertex ) this;
    }

	

    public Vertex 
assignName__before__UndirectedWithEdges( String name ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = assignName__role__UndirectedOnlyVertices(name);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
		return tempVar_gen;
    } else {
        return assignName__before__UndirectedOnlyVertices(name);
    }
}



	

    public Vertex  assignName__role__UndirectedWithEdges( String name ) 
    {
        this.name = name;
        return ( Vertex ) this;
    }

	

    public Vertex 
assignName__before__UndirectedWithNeighbors( String name ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = assignName__role__UndirectedWithEdges(name);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return assignName__before__UndirectedWithEdges(name);
    }
}



	

    public Vertex  assignName__role__UndirectedWithNeighbors( String name ) 
    {
        this.name = name;
        return ( Vertex ) this;
    }

	

    public  Vertex
assignName( String name ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = assignName__role__UndirectedWithNeighbors(name);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return assignName__before__UndirectedWithNeighbors(name);
    }
}



	

    //dja: fix for compile errors during performance improvements
    public String  getName__before__DirectedWithEdges( ) 
    { 
        return name; 
    }

	

    //dja: fix for compile errors during performance improvements
    public String  getName__role__DirectedWithEdges() { return name; }

	

    public String 
getName__before__DirectedWithNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
String tempVar_gen = getName__role__DirectedWithEdges();
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return getName__before__DirectedWithEdges();
    }
}



	

    public String  getName__role__DirectedWithNeighbors( ) 
    { 
        return name; 
    }

	
    public String 
getName__before__UndirectedOnlyVertices( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
String tempVar_gen = getName__role__DirectedWithNeighbors();
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return getName__before__DirectedWithNeighbors();
    }
}



	
    public String  getName__role__UndirectedOnlyVertices( )
    {
        return this.name;
    }

	

    public String 
getName__before__UndirectedWithEdges( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 		long startTime_gen = System.nanoTime();
String tempVar_gen = getName__role__UndirectedOnlyVertices();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
		return tempVar_gen;
    } else {
        return getName__before__UndirectedOnlyVertices();
    }
}



	

    public String  getName__role__UndirectedWithEdges( )
    {
        return this.name;
    }

	

    public String 
getName__before__UndirectedWithNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
String tempVar_gen = getName__role__UndirectedWithEdges();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return getName__before__UndirectedWithEdges();
    }
}



	

    public String  getName__role__UndirectedWithNeighbors( )
    {
        return this.name;
    }

	

    public String
getName( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
String tempVar_gen = getName__role__UndirectedWithNeighbors();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return getName__before__UndirectedWithNeighbors();
    }
}



	

 
    public void  addAdjacent__before__UndirectedOnlyVertices( Vertex n ) {
        adjacentVertices.add( n );
    }

	

 
    public void  addAdjacent__role__UndirectedOnlyVertices( Vertex n ) {
        adjacentVertices.add( n );
    }

	
//--------------------
// differences
//--------------------

    public void
addAdjacent( Vertex n ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices"); 		long startTime_gen = System.nanoTime();
        addAdjacent__role__UndirectedOnlyVertices(n);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
    } else {
        addAdjacent__before__UndirectedOnlyVertices(n);
    }
}



	

    public void  adjustAdorns__before__UndirectedOnlyVertices( Vertex the_vertex, int index ) 
      {}

	

    public void  adjustAdorns__role__UndirectedOnlyVertices( Vertex the_vertex, int index )
      {}

	

    public void 
adjustAdorns__before__WeightedOnlyVertices( Vertex the_vertex, int index ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices"); 		long startTime_gen = System.nanoTime();
        adjustAdorns__role__UndirectedOnlyVertices(the_vertex, index);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
    } else {
        adjustAdorns__before__UndirectedOnlyVertices(the_vertex, index);
    }
}



	

    public void  adjustAdorns__role__WeightedOnlyVertices( Vertex the_vertex, int index )
    {
        int the_weight = ( ( Integer )the_vertex.weightsList.get( index ) ).intValue();
        weightsList.add( new Integer( the_weight ) );
        adjustAdorns__before__WeightedOnlyVertices( the_vertex, index );
    }

	
    
    public void
adjustAdorns( Vertex the_vertex, int index ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedOnlyVertices) {
 verificationClasses.PerformanceProfiler.enteringFeature("WeightedOnlyVertices"); 		long startTime_gen = System.nanoTime();
        adjustAdorns__role__WeightedOnlyVertices(the_vertex, index);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: WeightedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("WeightedOnlyVertices", featureTime_gen);
    } else {
        adjustAdorns__before__WeightedOnlyVertices(the_vertex, index);
    }
}



	
      
    // dja - trying to fix compile errors
    public VertexIter  getNeighbors__before__DirectedWithEdges( ) 
    {
        return new VertexIter( ) 
        {
            private Iterator iter = adjacentVertices.iterator( );
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

	
      
    // dja - trying to fix compile errors
    public VertexIter  getNeighbors__role__DirectedWithEdges() {
        return new VertexIter() {
                private Iterator iter = neighbors.iterator();
                public Vertex next() { return ((Neighbor)iter.next()).end; }
                public boolean hasNext() { return iter.hasNext(); }
            };
    }

	

    public VertexIter 
getNeighbors__before__DirectedWithNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
VertexIter tempVar_gen = getNeighbors__role__DirectedWithEdges();
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return getNeighbors__before__DirectedWithEdges();
    }
}



	

    public VertexIter  getNeighbors__role__DirectedWithNeighbors( ) 
    {
        return new VertexIter( ) 
        {
            private Iterator iter = adjacentNeighbors.iterator( );
            public Vertex next( ) 
            { 
               return ( ( Neighbor )iter.next( ) ).neighbor; 
            }

            public boolean hasNext( ) 
            {
               return iter.hasNext( ); 
            }
        };
    }

	


    public VertexIter 
getNeighbors__before__UndirectedOnlyVertices( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
VertexIter tempVar_gen = getNeighbors__role__DirectedWithNeighbors();
 verificationClasses.PerformanceProfiler.enteringFeature("DirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return getNeighbors__before__DirectedWithNeighbors();
    }
}



	


    public VertexIter  getNeighbors__role__UndirectedOnlyVertices( )
    {
        return new VertexIter( )
        {
            private Iterator iter = adjacentVertices.iterator( );
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
getNeighbors__before__UndirectedWithEdges( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 		long startTime_gen = System.nanoTime();
VertexIter tempVar_gen = getNeighbors__role__UndirectedOnlyVertices();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
		return tempVar_gen;
    } else {
        return getNeighbors__before__UndirectedOnlyVertices();
    }
}



	

    public VertexIter  getNeighbors__role__UndirectedWithEdges( )
    {
        return new VertexIter( )
        {
            private Iterator iter = neighbors.iterator( );
            public Vertex next( ) 
            { 
              return ( ( Neighbor )iter.next( ) ).end; 
            }
            public boolean hasNext( ) 
            { 
              return iter.hasNext( ); 
            }
        };
    }

	


    public VertexIter 
getNeighbors__before__UndirectedWithNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
VertexIter tempVar_gen = getNeighbors__role__UndirectedWithEdges();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return getNeighbors__before__UndirectedWithEdges();
    }
}



	


    public VertexIter  getNeighbors__role__UndirectedWithNeighbors( )
    {
        return new VertexIter( )
        {
            private Iterator iter = adjacentNeighbors.iterator( );
            public Vertex next( ) 
            { 
                return ( ( Neighbor )iter.next( ) ).neighbor; 
            }
            public boolean hasNext( ) 
            { 
                return iter.hasNext( ); 
            }
        };
    }

	

    public VertexIter
getNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
VertexIter tempVar_gen = getNeighbors__role__UndirectedWithNeighbors();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return getNeighbors__before__UndirectedWithNeighbors();
    }
}



	


    public void  display__before__DirectedWithEdges() {
        int s = adjacentVertices.size();
        int i;

        System.out.print( "Vertex " + name + " connected to: " );

        for ( i=0; i<s; i++ )
            System.out.print( ( ( Vertex )adjacentVertices.get( i ) ).name+", " );
        System.out.println();
    }

	


    public void  display__role__DirectedWithEdges() {
        System.out.print( " Node " + getName() + " connected to: " );

        for(VertexIter vxiter = getNeighbors(); vxiter.hasNext(); )
         {
            Vertex v = vxiter.next();
            System.out.print( v.getName() + ", " );
        }

        System.out.println();
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



	

    public void  display__role__DirectedWithNeighbors() 
    {
        System.out.print( "Node " + getName( ) + " connected to: " );

        for(VertexIter vxiter = getNeighbors( ); vxiter.hasNext( ); )
         {
            Vertex v = vxiter.next( );
            System.out.print( v.getName( ) + ", " );
        }
        System.out.println( );
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
        int s = adjacentVertices.size();
        int i;

        System.out.print( "Vertex " + name + " connected to: " );
        for ( i=0; i<s; i++ )
            System.out.print( ( ( Vertex ) adjacentVertices.get( i ) ).name
                                                + ", " );
        System.out.println();
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



	

    public void  display__role__UndirectedWithEdges( ) 
    {
        System.out.print( " Node " + name + " connected to: " );

        for ( VertexIter vxiter = getNeighbors( ); vxiter.hasNext( ); )
        {
            System.out.print( vxiter.next().getName() + ", " );
        }

        System.out.println( );
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
        System.out.print( "Node " + name + " connected to: " );

        for ( VertexIter vxiter = getNeighbors( ); vxiter.hasNext( ); )
        {
            System.out.print( vxiter.next( ).getName( ) + ", " );
        }

        System.out.println();
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
        int s = weightsList.size();
        int i;

        System.out.print( " Weights : " );

        for ( i=0; i<s; i++ ) {
            System.out.print( ( ( Integer )weightsList.get( i ) ).intValue() + ", " );
        }

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
display__before__BFS() {
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



	
    
    public void  display__role__BFS( ) 
    {
        if ( visited )
            System.out.print( "  visited " );
        else
            System.out.println( " !visited " );
        display__before__BFS( );
    }

	 // of bfsNodeSearch

    public void 
display__before__Connected() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_BFS) {
 verificationClasses.PerformanceProfiler.enteringFeature("BFS"); 		long startTime_gen = System.nanoTime();
        display__role__BFS();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: BFS Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("BFS", featureTime_gen);
    } else {
        display__before__BFS();
    }
}



	 // of bfsNodeSearch

    public void  display__role__Connected( ) 
    {
        System.out.print( " comp# "+ componentNumber + " " );
        display__before__Connected( );
    }

	

    public void 
display__before__Cycle() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Connected) {
 verificationClasses.PerformanceProfiler.enteringFeature("Connected"); 		long startTime_gen = System.nanoTime();
        display__role__Connected();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: Connected Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("Connected", featureTime_gen);
    } else {
        display__before__Connected();
    }
}



	

    public void  display__role__Cycle() {
        System.out.print( " VertexCycle# " + VertexCycle + " " );
        display__before__Cycle();
    }

	 // white ->0, gray ->1, black->2
      
    public void 
display__before__DFS() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Cycle) {
 verificationClasses.PerformanceProfiler.enteringFeature("Cycle"); 		long startTime_gen = System.nanoTime();
        display__role__Cycle();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: Cycle Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("Cycle", featureTime_gen);
    } else {
        display__before__Cycle();
    }
}



	 // white ->0, gray ->1, black->2
      
    public void  display__role__DFS( ) {
        if ( visited )
            System.out.print( "  visited" );
        else
            System.out.println( " !visited " );
        display__before__DFS( );
    }

	 // of dftNodeSearch

    public void 
display__before__MSTKruskal() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
 verificationClasses.PerformanceProfiler.enteringFeature("DFS"); 		long startTime_gen = System.nanoTime();
        display__role__DFS();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DFS Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DFS", featureTime_gen);
    } else {
        display__before__DFS();
    }
}



	 // of dftNodeSearch

    public void  display__role__MSTKruskal() {
        if ( representative == null )
            System.out.print( "Rep null " );
        else
            System.out.print( " Rep " + representative.getName() + " " );
        display__before__MSTKruskal();
    }

	

    public void 
display__before__MSTPrim() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_MSTKruskal) {
 verificationClasses.PerformanceProfiler.enteringFeature("MSTKruskal"); 		long startTime_gen = System.nanoTime();
        display__role__MSTKruskal();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: MSTKruskal Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("MSTKruskal", featureTime_gen);
    } else {
        display__before__MSTKruskal();
    }
}



	

    public void  display__role__MSTPrim( ) 
    {
        System.out.print( " Pred " + pred + " Key " + key + " " );
        display__before__MSTPrim( );
    }

	 // weight so far from s to it
            
    public void 
display__before__Number() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_MSTPrim) {
 verificationClasses.PerformanceProfiler.enteringFeature("MSTPrim"); 		long startTime_gen = System.nanoTime();
        display__role__MSTPrim();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: MSTPrim Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("MSTPrim", featureTime_gen);
    } else {
        display__before__MSTPrim();
    }
}



	 // weight so far from s to it
            
    public void  display__role__Number( ) 
    {
        System.out.print( " # "+ VertexNumber + " " );
        display__before__Number( );
    }

	

    public void
display() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Number) {
 verificationClasses.PerformanceProfiler.enteringFeature("Number"); 		long startTime_gen = System.nanoTime();
        display__role__Number();
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: Number Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("Number", featureTime_gen);
    } else {
        display__before__Number();
    }
}



	

//--------------------
// from EdgeIfc
//--------------------

    public Vertex  getStart__before__UndirectedOnlyVertices( ) { return null; }

	

//--------------------
// from EdgeIfc
//--------------------

    public Vertex  getStart__role__UndirectedOnlyVertices( ) { return null; }

	

//--------------------
// from EdgeIfc
//--------------------

    public Vertex
getStart( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = getStart__role__UndirectedOnlyVertices();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
		return tempVar_gen;
    } else {
        return getStart__before__UndirectedOnlyVertices();
    }
}



	
    public Vertex  getEnd__before__UndirectedOnlyVertices( ) { return null; }

	
    public Vertex  getEnd__role__UndirectedOnlyVertices( ) { return null; }

	
    public Vertex
getEnd( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = getEnd__role__UndirectedOnlyVertices();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
		return tempVar_gen;
    } else {
        return getEnd__before__UndirectedOnlyVertices();
    }
}



	

    public void  setWeight__before__UndirectedOnlyVertices( int weight ){}

	

    public void  setWeight__role__UndirectedOnlyVertices( int weight ){}

	

    public void
setWeight( int weight ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices"); 		long startTime_gen = System.nanoTime();
        setWeight__role__UndirectedOnlyVertices(weight);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
    } else {
        setWeight__before__UndirectedOnlyVertices(weight);
    }
}



	
    public int  getWeight__before__UndirectedOnlyVertices() { return 0; }

	
    public int  getWeight__role__UndirectedOnlyVertices() { return 0; }

	
    public int
getWeight() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 		long startTime_gen = System.nanoTime();
int tempVar_gen = getWeight__role__UndirectedOnlyVertices();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
		return tempVar_gen;
    } else {
        return getWeight__before__UndirectedOnlyVertices();
    }
}



	

    public Vertex  getOtherVertex__before__UndirectedOnlyVertices( Vertex vertex )
    {
        return this;
    }

	

    public Vertex  getOtherVertex__role__UndirectedOnlyVertices( Vertex vertex )
    {
        return this;
    }

	

    public Vertex
getOtherVertex( Vertex vertex ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = getOtherVertex__role__UndirectedOnlyVertices(vertex);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
		return tempVar_gen;
    } else {
        return getOtherVertex__before__UndirectedOnlyVertices(vertex);
    }
}



	



    public void  adjustAdorns__before__UndirectedOnlyVertices( EdgeIfc the_edge )
    {
    }

	



    public void  adjustAdorns__role__UndirectedOnlyVertices( EdgeIfc the_edge )
    {
    }

	



    public void
adjustAdorns( EdgeIfc the_edge ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices"); 		long startTime_gen = System.nanoTime();
        adjustAdorns__role__UndirectedOnlyVertices(the_edge);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
    } else {
        adjustAdorns__before__UndirectedOnlyVertices(the_edge);
    }
}



	
    public LinkedList neighbors  ;

	

    public void  addNeighbor__before__UndirectedWithEdges( Neighbor n ) {
        neighbors.add( n );
    }

	

    public void  addNeighbor__role__UndirectedWithEdges( Neighbor n ) 
    {
        neighbors.add( n );
    }

	      
//--------------------
// differences
//--------------------

    public void
addNeighbor( Neighbor n ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        addNeighbor__role__UndirectedWithEdges(n);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
    } else {
        addNeighbor__before__UndirectedWithEdges(n);
    }
}



	

    public EdgeIter  getEdges__before__UndirectedOnlyVertices()
    {
        return new EdgeIter()
            {
                private Iterator iter = neighbors.iterator();
                /* dja: changed to fix compile error */
//                public EdgeIfc next() { return ((EdgeIfc)  iter.next()).edge; }
                public EdgeIfc next( ) 
                { 
                  return ( ( EdgeIfc ) ( ( Neighbor ) iter.next( ) ).edge ); 
                }
                public boolean hasNext() { return iter.hasNext(); }
            };
    }

	

    public EdgeIter  getEdges__role__UndirectedOnlyVertices( )
    {
        return new EdgeIter( )
        {
            private Iterator iter = adjacentVertices.iterator( );
            public EdgeIfc next( )
            {
                return ( EdgeIfc ) iter.next( );

//              return ( ( EdgeIfc ) ( ( Neighbor )iter.next( ) ).edge );
            }
            public boolean hasNext( )
            {
              return iter.hasNext( );
            }
        };
    }

	

    public EdgeIter 
getEdges__before__UndirectedWithEdges() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
 		long startTime_gen = System.nanoTime();
EdgeIter tempVar_gen = getEdges__role__UndirectedOnlyVertices();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedOnlyVertices");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedOnlyVertices Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedOnlyVertices", featureTime_gen);
		return tempVar_gen;
    } else {
        return getEdges__before__UndirectedOnlyVertices();
    }
}



	

    public EdgeIter  getEdges__role__UndirectedWithEdges( )
    {
        return new EdgeIter( )
        {
            private Iterator iter = neighbors.iterator( );
            public EdgeIfc next( ) 
            { 
              return ( ( EdgeIfc ) ( ( Neighbor )iter.next( ) ).edge );
            }
            public boolean hasNext( ) 
            { 
              return iter.hasNext( ); 
            }
        };
    }

	

    public EdgeIter 
getEdges__before__UndirectedWithNeighbors() {
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



	

    public EdgeIter  getEdges__role__UndirectedWithNeighbors( )
    {
        return new EdgeIter( )
        {
            private Iterator iter = adjacentNeighbors.iterator( );
            public EdgeIfc next( ) 
            { 
                return ( Neighbor ) iter.next( ); 

//              return ( ( EdgeIfc ) ( ( Neighbor )iter.next( ) ).edge );
            }
            public boolean hasNext( ) 
            { 
              return iter.hasNext( ); 
            }
        };
    }

	

    public EdgeIter
getEdges() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
EdgeIter tempVar_gen = getEdges__role__UndirectedWithNeighbors();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return getEdges__before__UndirectedWithNeighbors();
    }
}



	
    public LinkedList adjacentNeighbors  ;

	
   
    public void  addEdge__before__UndirectedWithNeighbors( Neighbor n ) {
        adjacentNeighbors.add( n );
    }

	
   
    public void  addEdge__role__UndirectedWithNeighbors( Neighbor n ) 
    {
        adjacentNeighbors.add( n );
    }

	
//--------------------
// differences
//--------------------

    public void
addEdge( Neighbor n ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        addEdge__role__UndirectedWithNeighbors(n);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
    } else {
        addEdge__before__UndirectedWithNeighbors(n);
    }
}



	

    public void  adjustAdorns__before__UndirectedWithNeighbors( Neighbor sourceNeighbor )
      {}

	

    public void  adjustAdorns__role__UndirectedWithNeighbors( Neighbor sourceNeighbor )
    {
    }

	

    public void 
adjustAdorns__before__WeightedWithNeighbors( Neighbor sourceNeighbor ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        adjustAdorns__role__UndirectedWithNeighbors(sourceNeighbor);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
    } else {
        adjustAdorns__before__UndirectedWithNeighbors(sourceNeighbor);
    }
}



	

    public void  adjustAdorns__role__WeightedWithNeighbors( Neighbor sourceNeighbor )
     {
        Neighbor targetNeighbor = 
                ( Neighbor )adjacentNeighbors.getLast();
        targetNeighbor.weight = sourceNeighbor.weight;
        adjustAdorns__before__WeightedWithNeighbors( sourceNeighbor );
    }

	
    
    public void
adjustAdorns( Neighbor sourceNeighbor ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("WeightedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        adjustAdorns__role__WeightedWithNeighbors(sourceNeighbor);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: WeightedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("WeightedWithNeighbors", featureTime_gen);
    } else {
        adjustAdorns__before__WeightedWithNeighbors(sourceNeighbor);
    }
}



	
    public LinkedList  getNeighborsObj__before__UndirectedWithEdges( )
    {
      return adjacentVertices;
    }

	
    public LinkedList  getNeighborsObj__role__UndirectedWithEdges( )
    {
 	  return neighbors;
    }

	

    public LinkedList 
getNeighborsObj__before__UndirectedWithNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
LinkedList tempVar_gen = getNeighborsObj__role__UndirectedWithEdges();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return getNeighborsObj__before__UndirectedWithEdges();
    }
}



	

    public LinkedList  getNeighborsObj__role__UndirectedWithNeighbors( )
    {
 	  return adjacentNeighbors;
    }

	
    
    public LinkedList
getNeighborsObj( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
LinkedList tempVar_gen = getNeighborsObj__role__UndirectedWithNeighbors();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return getNeighborsObj__before__UndirectedWithNeighbors();
    }
}



	
    public LinkedList weightsList;

	
         
    public void addWeight( int weight )
    {
        weightsList.add( new Integer( weight ) );
    }

	
    public void addWeight( Vertex end, int theWeight ) 
    {
        Neighbor the_neighbor = 
                ( Neighbor ) ( end.adjacentNeighbors ).removeLast();
        the_neighbor.weight = theWeight;
        ( end.adjacentNeighbors ).add( the_neighbor );
    }

	
    public boolean visited  ;

	

    public void  init_vertex__before__DFS( WorkSpace w ) 
    {
        visited = false;
        w.init_vertex( ( Vertex ) this );
    }

	

    public void  init_vertex__role__DFS( WorkSpace w ) 
    {
        visited = false;
        w.init_vertex( ( Vertex ) this );
    }

	

    public void
init_vertex( WorkSpace w ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
 verificationClasses.PerformanceProfiler.enteringFeature("DFS"); 		long startTime_gen = System.nanoTime();
        init_vertex__role__DFS(w);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DFS Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DFS", featureTime_gen);
    } else {
        init_vertex__before__DFS(w);
    }
}



	

    public void  nodeSearch__before__DFS( WorkSpace w ) 
    {
        int     s, c;
        Vertex  v;
        Vertex  header;

        // Step 1: if preVisitAction is true or if we've already
        //         visited this node
        w.preVisitAction( ( Vertex ) this );

        if ( visited )
        {
            return;
        }

        // Step 2: Mark as visited, put the unvisited neighbors in the queue
        //     and make the recursive call on the first element of the queue
        //     if there is such if not you are done
        visited = true;

        // Step 3: do postVisitAction now, you are no longer going through the
        // node again, mark it as black
        w.postVisitAction( ( Vertex ) this );

        // enqueues the vertices not visited
        for ( VertexIter vxiter = getNeighbors( ); vxiter.hasNext( ); )
        {
            v = vxiter.next( );

            // if your neighbor has not been visited then enqueue
            if ( !v.visited ) 
            {
                GlobalVarsWrapper.Queue.add( v );
            }

        } // end of for

        // while there is something in the queue
        while( GlobalVarsWrapper.Queue.size( )!= 0 )
        {
            header = ( Vertex ) GlobalVarsWrapper.Queue.get( 0 );
            GlobalVarsWrapper.Queue.remove( 0 );
            header.nodeSearch( w );
        }
    }

	

    public void  nodeSearch__role__DFS( WorkSpace w ) 
    {
        Vertex v;

        // Step 1: Do preVisitAction.
        //            If we've already visited this node return
        w.preVisitAction( ( Vertex ) this );

        if ( visited )
            return;

        // Step 2: else remember that we've visited and
        //         visit all neighbors
        visited = true;

        for ( VertexIter  vxiter = getNeighbors(); vxiter.hasNext(); ) 
        {
            v = vxiter.next( );
            w.checkNeighborAction( ( Vertex ) this, v );
            v.nodeSearch( w );
        }

        // Step 3: do postVisitAction now
        w.postVisitAction( ( Vertex ) this );
    }

	

    public void
nodeSearch( WorkSpace w ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
 verificationClasses.PerformanceProfiler.enteringFeature("DFS"); 		long startTime_gen = System.nanoTime();
        nodeSearch__role__DFS(w);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DFS Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DFS", featureTime_gen);
    } else {
        nodeSearch__before__DFS(w);
    }
}



	
    public int componentNumber;

	
    public int VertexCycle;

	
    public int VertexColor;

	
    public  Vertex representative;

	
    public LinkedList members;

	
    public String pred;

	 // the predecessor vertex if any
    public int key;

	
    public int VertexNumber;


	public int finishTime;


}
