package GPL; 

import java.util.LinkedList; 
  // *************************************************************************
   
public   class  WorkSpace {
	 // supply template actions
    @featureHouse.FeatureAnnotation (name="BFS")
public void init_vertex__before__DFS( Vertex v ) {}

	 // supply template actions
    @featureHouse.FeatureAnnotation(name="DFS")
public void  init_vertex__role__DFS( Vertex v ) {}

	 // supply template actions
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=119, thenFeature="DFS", elseFeature="BFS")
public void
init_vertex( Vertex v ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
        init_vertex__role__DFS(v);
    } else {
        init_vertex__before__DFS(v);
    }
}



	
    @featureHouse.FeatureAnnotation (name="BFS")
public void preVisitAction__before__DFS( Vertex v ) {}

	
    @featureHouse.FeatureAnnotation(name="DFS")
public void  preVisitAction__role__DFS( Vertex v ) {}

	
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=120, thenFeature="DFS", elseFeature="BFS")
public void
preVisitAction( Vertex v ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
        preVisitAction__role__DFS(v);
    } else {
        preVisitAction__before__DFS(v);
    }
}



	
    @featureHouse.FeatureAnnotation (name="BFS")
public void postVisitAction__before__DFS( Vertex v ) {}

	
    @featureHouse.FeatureAnnotation(name="DFS")
public void  postVisitAction__role__DFS( Vertex v ) {}

	
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=121, thenFeature="DFS", elseFeature="BFS")
public void
postVisitAction( Vertex v ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
        postVisitAction__role__DFS(v);
    } else {
        postVisitAction__before__DFS(v);
    }
}



	
    @featureHouse.FeatureAnnotation (name="BFS")
public void nextRegionAction__before__DFS( Vertex v ) {}

	
    @featureHouse.FeatureAnnotation(name="DFS")
public void  nextRegionAction__role__DFS( Vertex v ) {}

	
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=122, thenFeature="DFS", elseFeature="BFS")
public void
nextRegionAction( Vertex v ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
        nextRegionAction__role__DFS(v);
    } else {
        nextRegionAction__before__DFS(v);
    }
}



	
    @featureHouse.FeatureAnnotation (name="BFS")
public void checkNeighborAction__before__DFS( Vertex vsource, 
     Vertex vtarget ) {}

	
    @featureHouse.FeatureAnnotation(name="DFS")
public void  checkNeighborAction__role__DFS( Vertex vsource, 
                       Vertex vtarget ) {}

	
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=123, thenFeature="DFS", elseFeature="BFS")
public void
checkNeighborAction( Vertex vsource, 
     Vertex vtarget ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
        checkNeighborAction__role__DFS(vsource, vtarget);
    } else {
        checkNeighborAction__before__DFS(vsource, vtarget);
    }
}




}
