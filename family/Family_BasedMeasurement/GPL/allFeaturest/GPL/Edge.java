package GPL; 

import java.util.LinkedList; 

// *************************************************************************

public   class  Edge  extends Neighbor  implements EdgeIfc {
	
     public Vertex start  ;

	

    public void  EdgeConstructor__before__UndirectedWithEdges( Vertex the_start,
                      Vertex the_end ) {
        start = the_start;
        end = the_end;
    }

	

    public void  EdgeConstructor__role__UndirectedWithEdges( Vertex the_start, Vertex the_end )
    {
        start = the_start;
        end = the_end;
    }

	

    public void
EdgeConstructor( Vertex the_start,
                      Vertex the_end ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        EdgeConstructor__role__UndirectedWithEdges(the_start, the_end);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
    } else {
        EdgeConstructor__before__UndirectedWithEdges(the_start, the_end);
    }
}



	

    // dja: fix compile error.
//    public void adjustAdorns( Edge the_edge ) {}
    public void  adjustAdorns__before__UndirectedWithEdges( EdgeIfc the_edge ) {}

	

    // dja: fix compile error.
//    public void adjustAdorns( Edge the_edge ) {}
    public void  adjustAdorns__role__UndirectedWithEdges( EdgeIfc the_edge ) 
    {
    }

	

    public void
adjustAdorns( EdgeIfc the_edge ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        adjustAdorns__role__UndirectedWithEdges(the_edge);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
    } else {
        adjustAdorns__before__UndirectedWithEdges(the_edge);
    }
}



	


    // dja: fix compile error.
    public void  setWeight__before__UndirectedWithEdges(int weight){}

	


    // dja: fix compile error.
    public void  setWeight__role__UndirectedWithEdges(int weight) 
    {
    }

	

    public void
setWeight(int weight) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges"); 		long startTime_gen = System.nanoTime();
        setWeight__role__UndirectedWithEdges(weight);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
    } else {
        setWeight__before__UndirectedWithEdges(weight);
    }
}



	
    public int  getWeight__before__UndirectedWithEdges() { return 0; }

	
    public int  getWeight__role__UndirectedWithEdges( ) 
    { 
        return 0; 
    }

	

    public int
getWeight() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
int tempVar_gen = getWeight__role__UndirectedWithEdges();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return getWeight__before__UndirectedWithEdges();
    }
}



	

    public Vertex  getOtherVertex__before__UndirectedWithEdges(Vertex vertex)
    {
        if(vertex == start)
            return end;
        else if(vertex == end)
            return start;
        else
            return null;
    }

	

    public Vertex  getOtherVertex__role__UndirectedWithEdges( Vertex vertex )
    {
        if( vertex == start )
        { 
            return end;
        }
        else if(vertex == end)
        { 
            return start;
        }
        else
        { 
            return null;
        }
    }

	

    public Vertex
getOtherVertex(Vertex vertex) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = getOtherVertex__role__UndirectedWithEdges(vertex);
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return getOtherVertex__before__UndirectedWithEdges(vertex);
    }
}



	

    public Vertex  getStart__before__UndirectedWithEdges()
    {
        return start;
    }

	

    public Vertex  getStart__role__UndirectedWithEdges( )
    {
        return start;
    }

	

    public Vertex
getStart() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = getStart__role__UndirectedWithEdges();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return getStart__before__UndirectedWithEdges();
    }
}



	

    public Vertex  getEnd__before__UndirectedWithEdges()
    {
        return end;
    }

	

    public Vertex  getEnd__role__UndirectedWithEdges( )
    {
        return end;
    }

	

    public Vertex
getEnd() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
 		long startTime_gen = System.nanoTime();
Vertex tempVar_gen = getEnd__role__UndirectedWithEdges();
 verificationClasses.PerformanceProfiler.enteringFeature("UndirectedWithEdges");		long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: UndirectedWithEdges Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("UndirectedWithEdges", featureTime_gen);
		return tempVar_gen;
    } else {
        return getEnd__before__UndirectedWithEdges();
    }
}



	

    public void  display__before__UndirectedWithEdges() {
        System.out.println( " start=" + start.getName() + " end=" + end.getName() );
    }

	

    public void  display__role__UndirectedWithEdges( ) 
    {
        System.out.println( " start=" + start.getName() + " end=" + end.getName( ) );
    }

	

    public void
display() {
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




}
