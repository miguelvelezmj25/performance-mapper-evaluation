//created on: Sun Jul 13 23:04:15 CDT 2003

package GPL; 

public   interface  EdgeIfc {
	
    @featureHouse.FeatureAnnotation(name="Base")
public Vertex getStart( );

	
    @featureHouse.FeatureAnnotation(name="Base")
public Vertex getEnd( );

	
    @featureHouse.FeatureAnnotation(name="Base")
public void display( );

	


    @featureHouse.FeatureAnnotation(name="Base")
public void setWeight( int weight );

	
 //   public int getWeight();

    @featureHouse.FeatureAnnotation(name="Base")
public Vertex getOtherVertex( Vertex vertex );

	

    @featureHouse.FeatureAnnotation(name="Base")
public void adjustAdorns( EdgeIfc the_edge );

	
    //public void setWeight( int weight );
    public int getWeight();


}
