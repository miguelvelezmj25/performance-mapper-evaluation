package GPL; 

import java.util.LinkedList; 

// end of Vertex class
 
  // *************************************************************************
  
public   class  Neighbor  implements EdgeIfc, NeighborIfc {
	
    public Vertex end  ;

	
    public Edge edge  ;

	

    // This constructor has to be present here so that the default one
    // Called on Weighted can call it, i.e. it is not longer implicit
    public Neighbor  () {
        end = null;
        edge = null;
    
        neighbor = null;
    
        end = null;
        edge = null;
    
        neighbor = null;
    }

	
        
    public Neighbor  ( Vertex v,  Edge e ) {
        end = v;
        edge = e;
    
        end = v;
        edge = e;
    }

	
    public Vertex neighbor  ;

	

    public Neighbor  ( Vertex theNeighbor ) 
    {
        NeighborConstructor( theNeighbor );
    
        NeighborConstructor( theNeighbor );
    }

	
    
    public void  NeighborConstructor__before__UndirectedWithNeighbors( Vertex theNeighbor ) 
    {
        neighbor = theNeighbor;
    }

	
    
    public void  NeighborConstructor__role__UndirectedWithNeighbors( Vertex theNeighbor ) {
        neighbor = theNeighbor;
    }

	

    public void
NeighborConstructor( Vertex theNeighbor ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        NeighborConstructor__role__UndirectedWithNeighbors(theNeighbor);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
    } else {
        NeighborConstructor__before__UndirectedWithNeighbors(theNeighbor);
    }
}



	
  
    public void  display__before__UndirectedWithNeighbors () 
    {
        System.out.print( neighbor.name + " ," );
    }

	
  
    public void  display__role__UndirectedWithNeighbors()
    {
        System.out.print( neighbor.name + " ," );
    }

	

    public void 
display__before__WeightedWithNeighbors() {
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



	

    public void  display__role__WeightedWithNeighbors()
    {
        System.out.print( " Weight = " + weight + " " );
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



	

    public Vertex  getStart__before__UndirectedWithNeighbors( ) 
    { 
       return null; 
    }

	

    public Vertex  getStart__role__UndirectedWithNeighbors( ) { return null; }

	

    public Vertex
getStart( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = getStart__role__UndirectedWithNeighbors();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return getStart__before__UndirectedWithNeighbors();
    }
}



	

    public Vertex  getEnd__before__UndirectedWithNeighbors( ) 
    { 
      return neighbor; 
    }

	

    public Vertex  getEnd__role__UndirectedWithNeighbors( ) { return null; }

	
    public Vertex
getEnd( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = getEnd__role__UndirectedWithNeighbors();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return getEnd__before__UndirectedWithNeighbors();
    }
}



	

    public void  setWeight__before__UndirectedWithNeighbors( int weight ) 
    {
    }

	

    public void  setWeight__role__UndirectedWithNeighbors(int weight) {}

	

    public void 
setWeight__before__WeightedWithNeighbors( int weight ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        setWeight__role__UndirectedWithNeighbors(weight);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
    } else {
        setWeight__before__UndirectedWithNeighbors(weight);
    }
}



	

    public void  setWeight__role__WeightedWithNeighbors(int weight)
    {
        this.weight = weight;
    }

	

    public void
setWeight( int weight ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("WeightedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        setWeight__role__WeightedWithNeighbors(weight);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: WeightedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("WeightedWithNeighbors", featureTime_gen);
    } else {
        setWeight__before__WeightedWithNeighbors(weight);
    }
}



	

    public Vertex  getOtherVertex__before__UndirectedWithNeighbors( Vertex vertex )
    {
        return neighbor;
    }

	

    public Vertex  getOtherVertex__role__UndirectedWithNeighbors( Vertex vertex )
    {
        return neighbor;
    }

	

    public Vertex
getOtherVertex( Vertex vertex ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = getOtherVertex__role__UndirectedWithNeighbors(vertex);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return getOtherVertex__before__UndirectedWithNeighbors(vertex);
    }
}



	

    public void  adjustAdorns__before__UndirectedWithNeighbors( EdgeIfc the_edge )
    {
    }

	

    public void  adjustAdorns__role__UndirectedWithNeighbors( EdgeIfc the_edge )
    {
    }

	

    public void
adjustAdorns( EdgeIfc the_edge ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithNeighbors"); 		long startTime_gen = System.nanoTime();
        adjustAdorns__role__UndirectedWithNeighbors(the_edge);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithNeighbors", featureTime_gen);
    } else {
        adjustAdorns__before__UndirectedWithNeighbors(the_edge);
    }
}



	
    public int  getWeight__before__WeightedWithNeighbors() { return 0; }

	
    public int  getWeight__role__WeightedWithNeighbors()
    {
        return this.weight;
    }

	

    public int
getWeight() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedWithNeighbors) {
 		long startTime_gen = System.nanoTime();
int tempVar_gen = getWeight__role__WeightedWithNeighbors();
 verificationClasses.PerformanceProfiler.enteringFeature("WeightedWithNeighbors");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: WeightedWithNeighbors Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("WeightedWithNeighbors", featureTime_gen);
		return tempVar_gen;
    } else {
        return getWeight__before__WeightedWithNeighbors();
    }
}



	
    public int weight;

	

    public Neighbor( Vertex theNeighbor, int theWeight ) {
        NeighborConstructor( theNeighbor, theWeight );
    }

	

    public void NeighborConstructor( Vertex theNeighbor, int theWeight )
    {
        NeighborConstructor( theNeighbor );
        weight = theWeight;
    }


}
