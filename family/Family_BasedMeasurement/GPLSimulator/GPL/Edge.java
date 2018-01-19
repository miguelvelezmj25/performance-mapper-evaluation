package GPL; 

import java.util.LinkedList; 

// *************************************************************************

public   class  Edge  extends Neighbor  implements EdgeIfc {
	
     public Vertex start  ;

	

    @featureHouse.FeatureAnnotation (name="DirectedWithEdges")
public void EdgeConstructor__before__UndirectedWithEdges( Vertex the_start,
                      Vertex the_end ) {
        start = the_start;
        end = the_end;
    }

	

    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
public void  EdgeConstructor__role__UndirectedWithEdges( Vertex the_start, Vertex the_end )
    {
        start = the_start;
        end = the_end;
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=63, thenFeature="UndirectedWithEdges", elseFeature="DirectedWithEdges")
public void
EdgeConstructor( Vertex the_start,
                      Vertex the_end ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        EdgeConstructor__role__UndirectedWithEdges(the_start, the_end);
    } else {
        EdgeConstructor__before__UndirectedWithEdges(the_start, the_end);
    }
}



	

    // dja: fix compile error.
//    public void adjustAdorns( Edge the_edge ) {}
    @featureHouse.FeatureAnnotation (name="DirectedWithEdges")
public void adjustAdorns__before__UndirectedWithEdges( EdgeIfc the_edge ) {}

	

    // dja: fix compile error.
//    public void adjustAdorns( Edge the_edge ) {}
    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
public void  adjustAdorns__role__UndirectedWithEdges( EdgeIfc the_edge ) 
    {
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=64, thenFeature="UndirectedWithEdges", elseFeature="DirectedWithEdges")
public void
adjustAdorns( EdgeIfc the_edge ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        adjustAdorns__role__UndirectedWithEdges(the_edge);
    } else {
        adjustAdorns__before__UndirectedWithEdges(the_edge);
    }
}



	


    // dja: fix compile error.
    @featureHouse.FeatureAnnotation (name="DirectedWithEdges")
public void setWeight__before__UndirectedWithEdges(int weight){}

	


    // dja: fix compile error.
    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
public void  setWeight__role__UndirectedWithEdges(int weight) 
    {
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=65, thenFeature="UndirectedWithEdges", elseFeature="DirectedWithEdges")
public void
setWeight(int weight) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        setWeight__role__UndirectedWithEdges(weight);
    } else {
        setWeight__before__UndirectedWithEdges(weight);
    }
}



	
    @featureHouse.FeatureAnnotation (name="DirectedWithEdges")
public int getWeight__before__UndirectedWithEdges() { return 0; }

	
    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
public int  getWeight__role__UndirectedWithEdges( ) 
    { 
        return 0; 
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=66, thenFeature="UndirectedWithEdges", elseFeature="DirectedWithEdges")
public int
getWeight() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        return getWeight__role__UndirectedWithEdges();
    } else {
        return getWeight__before__UndirectedWithEdges();
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedWithEdges")
public Vertex getOtherVertex__before__UndirectedWithEdges(Vertex vertex)
    {
        if(vertex == start)
            return end;
        else if(vertex == end)
            return start;
        else
            return null;
    }

	

    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
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

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=67, thenFeature="UndirectedWithEdges", elseFeature="DirectedWithEdges")
public Vertex
getOtherVertex(Vertex vertex) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        return getOtherVertex__role__UndirectedWithEdges(vertex);
    } else {
        return getOtherVertex__before__UndirectedWithEdges(vertex);
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedWithEdges")
public Vertex getStart__before__UndirectedWithEdges()
    {
        return start;
    }

	

    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
public Vertex  getStart__role__UndirectedWithEdges( )
    {
        return start;
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=68, thenFeature="UndirectedWithEdges", elseFeature="DirectedWithEdges")
public Vertex
getStart() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        return getStart__role__UndirectedWithEdges();
    } else {
        return getStart__before__UndirectedWithEdges();
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedWithEdges")
public Vertex getEnd__before__UndirectedWithEdges()
    {
        return end;
    }

	

    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
public Vertex  getEnd__role__UndirectedWithEdges( )
    {
        return end;
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=69, thenFeature="UndirectedWithEdges", elseFeature="DirectedWithEdges")
public Vertex
getEnd() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        return getEnd__role__UndirectedWithEdges();
    } else {
        return getEnd__before__UndirectedWithEdges();
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedWithEdges")
public void display__before__UndirectedWithEdges() {
        System.out.println( " start=" + start.getName() + " end=" + end.getName() );
    }

	

    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
public void  display__role__UndirectedWithEdges( ) 
    {
        System.out.println( " start=" + start.getName() + " end=" + end.getName( ) );
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=70, thenFeature="UndirectedWithEdges", elseFeature="DirectedWithEdges")
public void
display() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        display__role__UndirectedWithEdges();
    } else {
        display__before__UndirectedWithEdges();
    }
}




}
