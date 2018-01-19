package GPL; 

import java.util.LinkedList; 

// end of Vertex class
 
  // *************************************************************************
  
public   class  Neighbor  implements EdgeIfc, NeighborIfc {
	
    public Vertex end  ;

	
    public Edge edge  ;

	

    // This constructor has to be present here so that the default one
    // Called on Weighted can call it, i.e. it is not longer implicit
    @featureHouse.FeatureAnnotation(name="DirectedWithEdges")
public Neighbor() {
        end = null;
        edge = null;
    
        neighbor = null;
    
        end = null;
        edge = null;
    
        neighbor = null;
    }

	
        
    @featureHouse.FeatureAnnotation(name="DirectedWithEdges")
public Neighbor( Vertex v,  Edge e ) {
        end = v;
        edge = e;
    
        end = v;
        edge = e;
    }

	
    public Vertex neighbor  ;

	

    @featureHouse.FeatureAnnotation(name="DirectedWithNeighbors")
public Neighbor( Vertex theNeighbor ) 
    {
        NeighborConstructor( theNeighbor );
    
        NeighborConstructor( theNeighbor );
    }

	
    
    @featureHouse.FeatureAnnotation(name="DirectedWithNeighbors")
public void NeighborConstructor__before__UndirectedWithNeighbors( Vertex theNeighbor ) 
    {
        neighbor = theNeighbor;
    }

	
    
    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public void  NeighborConstructor__role__UndirectedWithNeighbors( Vertex theNeighbor ) {
        neighbor = theNeighbor;
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=88, thenFeature="UndirectedWithNeighbors", elseFeature="DirectedWithNeighbors")
public void
NeighborConstructor( Vertex theNeighbor ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        NeighborConstructor__role__UndirectedWithNeighbors(theNeighbor);
    } else {
        NeighborConstructor__before__UndirectedWithNeighbors(theNeighbor);
    }
}



	
  
    @featureHouse.FeatureAnnotation (name="DirectedWithNeighbors")
public void display__before__UndirectedWithNeighbors () 
    {
        System.out.print( neighbor.name + " ," );
    }

	
  
    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public void  display__role__UndirectedWithNeighbors()
    {
        System.out.print( neighbor.name + " ," );
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=89, thenFeature="UndirectedWithNeighbors", elseFeature="DirectedWithNeighbors")
public void
display__before__WeightedWithNeighbors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        display__role__UndirectedWithNeighbors();
    } else {
        display__before__UndirectedWithNeighbors();
    }
}



	

    @featureHouse.FeatureAnnotation(name="WeightedWithNeighbors")
public void  display__role__WeightedWithNeighbors()
    {
        System.out.print( " Weight = " + weight + " " );
        display__before__WeightedWithNeighbors();
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=105, thenFeature="WeightedWithNeighbors", elseFeature="featureSwitch")
public void
display() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedWithNeighbors) {
        display__role__WeightedWithNeighbors();
    } else {
        display__before__WeightedWithNeighbors();
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedWithNeighbors")
public Vertex getStart__before__UndirectedWithNeighbors( ) 
    { 
       return null; 
    }

	

    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public Vertex  getStart__role__UndirectedWithNeighbors( ) { return null; }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=90, thenFeature="UndirectedWithNeighbors", elseFeature="DirectedWithNeighbors")
public Vertex
getStart( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        return getStart__role__UndirectedWithNeighbors();
    } else {
        return getStart__before__UndirectedWithNeighbors();
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedWithNeighbors")
public Vertex getEnd__before__UndirectedWithNeighbors( ) 
    { 
      return neighbor; 
    }

	

    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public Vertex  getEnd__role__UndirectedWithNeighbors( ) { return null; }

	
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=91, thenFeature="UndirectedWithNeighbors", elseFeature="DirectedWithNeighbors")
public Vertex
getEnd( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        return getEnd__role__UndirectedWithNeighbors();
    } else {
        return getEnd__before__UndirectedWithNeighbors();
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedWithNeighbors")
public void setWeight__before__UndirectedWithNeighbors( int weight ) 
    {
    }

	

    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public void  setWeight__role__UndirectedWithNeighbors(int weight) {}

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=92, thenFeature="UndirectedWithNeighbors", elseFeature="DirectedWithNeighbors")
public void
setWeight__before__WeightedWithNeighbors( int weight ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        setWeight__role__UndirectedWithNeighbors(weight);
    } else {
        setWeight__before__UndirectedWithNeighbors(weight);
    }
}



	

    @featureHouse.FeatureAnnotation(name="WeightedWithNeighbors")
public void  setWeight__role__WeightedWithNeighbors(int weight)
    {
        this.weight = weight;
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=106, thenFeature="WeightedWithNeighbors", elseFeature="featureSwitch")
public void
setWeight( int weight ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedWithNeighbors) {
        setWeight__role__WeightedWithNeighbors(weight);
    } else {
        setWeight__before__WeightedWithNeighbors(weight);
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedWithNeighbors")
public Vertex getOtherVertex__before__UndirectedWithNeighbors( Vertex vertex )
    {
        return neighbor;
    }

	

    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public Vertex  getOtherVertex__role__UndirectedWithNeighbors( Vertex vertex )
    {
        return neighbor;
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=93, thenFeature="UndirectedWithNeighbors", elseFeature="DirectedWithNeighbors")
public Vertex
getOtherVertex( Vertex vertex ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        return getOtherVertex__role__UndirectedWithNeighbors(vertex);
    } else {
        return getOtherVertex__before__UndirectedWithNeighbors(vertex);
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedWithNeighbors")
public void adjustAdorns__before__UndirectedWithNeighbors( EdgeIfc the_edge )
    {
    }

	

    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public void  adjustAdorns__role__UndirectedWithNeighbors( EdgeIfc the_edge )
    {
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=94, thenFeature="UndirectedWithNeighbors", elseFeature="DirectedWithNeighbors")
public void
adjustAdorns( EdgeIfc the_edge ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        adjustAdorns__role__UndirectedWithNeighbors(the_edge);
    } else {
        adjustAdorns__before__UndirectedWithNeighbors(the_edge);
    }
}



	
    @featureHouse.FeatureAnnotation (name="UndirectedWithNeighbors")
public int getWeight__before__WeightedWithNeighbors() { return 0; }

	
    @featureHouse.FeatureAnnotation(name="WeightedWithNeighbors")
public int  getWeight__role__WeightedWithNeighbors()
    {
        return this.weight;
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=107, thenFeature="WeightedWithNeighbors", elseFeature="UndirectedWithNeighbors")
public int
getWeight() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedWithNeighbors) {
        return getWeight__role__WeightedWithNeighbors();
    } else {
        return getWeight__before__WeightedWithNeighbors();
    }
}



	
    public int weight;

	

    @featureHouse.FeatureAnnotation(name="WeightedWithNeighbors")
public Neighbor( Vertex theNeighbor, int theWeight ) {
        NeighborConstructor( theNeighbor, theWeight );
    }

	

    @featureHouse.FeatureAnnotation(name="WeightedWithNeighbors")
public void NeighborConstructor( Vertex theNeighbor, int theWeight )
    {
        NeighborConstructor( theNeighbor );
        weight = theWeight;
    }


}
