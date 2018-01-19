package GPL; 

// **********************************************************************
   
public  class  NumberWorkSpace  extends  WorkSpace {
	
    int vertexCounter;

	

    @featureHouse.FeatureAnnotation(name="Number")
public NumberWorkSpace( ) 
    {
        vertexCounter = 0;
    }

	

    @featureHouse.FeatureAnnotation(name="Number")
public void preVisitAction( Vertex v )
    {
        // This assigns the values on the way in
        if ( v.visited != true )
        {
            v.VertexNumber = vertexCounter++;
        }
    }


}
