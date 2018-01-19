package GPL; 

import java.util.LinkedList; 
  // *************************************************************************
   
public   class  WorkSpace {
	 // supply template actions
    public void  init_vertex__before__DFS( Vertex v ) {}

	 // supply template actions
    public void  init_vertex__role__DFS( Vertex v ) {}

	 // supply template actions
    public void
init_vertex( Vertex v ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
 verificationClasses.PerformanceProfiler.enteringFeature("DFS"); 		long startTime_gen = System.nanoTime();
        init_vertex__role__DFS(v);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DFS Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DFS", featureTime_gen);
    } else {
        init_vertex__before__DFS(v);
    }
}



	
    public void  preVisitAction__before__DFS( Vertex v ) {}

	
    public void  preVisitAction__role__DFS( Vertex v ) {}

	
    public void
preVisitAction( Vertex v ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
 verificationClasses.PerformanceProfiler.enteringFeature("DFS"); 		long startTime_gen = System.nanoTime();
        preVisitAction__role__DFS(v);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DFS Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DFS", featureTime_gen);
    } else {
        preVisitAction__before__DFS(v);
    }
}



	
    public void  postVisitAction__before__DFS( Vertex v ) {}

	
    public void  postVisitAction__role__DFS( Vertex v ) {}

	
    public void
postVisitAction( Vertex v ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
 verificationClasses.PerformanceProfiler.enteringFeature("DFS"); 		long startTime_gen = System.nanoTime();
        postVisitAction__role__DFS(v);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DFS Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DFS", featureTime_gen);
    } else {
        postVisitAction__before__DFS(v);
    }
}



	
    public void  nextRegionAction__before__DFS( Vertex v ) {}

	
    public void  nextRegionAction__role__DFS( Vertex v ) {}

	
    public void
nextRegionAction( Vertex v ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
 verificationClasses.PerformanceProfiler.enteringFeature("DFS"); 		long startTime_gen = System.nanoTime();
        nextRegionAction__role__DFS(v);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DFS Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DFS", featureTime_gen);
    } else {
        nextRegionAction__before__DFS(v);
    }
}



	
    public void  checkNeighborAction__before__DFS( Vertex vsource, 
     Vertex vtarget ) {}

	
    public void  checkNeighborAction__role__DFS( Vertex vsource, 
                       Vertex vtarget ) {}

	
    public void
checkNeighborAction( Vertex vsource, 
     Vertex vtarget ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
 verificationClasses.PerformanceProfiler.enteringFeature("DFS"); 		long startTime_gen = System.nanoTime();
        checkNeighborAction__role__DFS(vsource, vtarget);
		 long featureTime_gen = System.nanoTime() - startTime_gen;
		System.out.println("Feature: DFS Time spent: " +  featureTime_gen);
		verificationClasses.PerformanceProfiler.add("DFS", featureTime_gen);
    } else {
        checkNeighborAction__before__DFS(vsource, vtarget);
    }
}




}
