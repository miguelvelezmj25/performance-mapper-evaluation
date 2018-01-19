package GPL; 

// *****************************************************************
   
public  class  RegionWorkSpace  extends  WorkSpace {
	
    int counter;

	

    @featureHouse.FeatureAnnotation(name="Connected")
public RegionWorkSpace( ) 
    {
        counter = 0;
    }

	

    @featureHouse.FeatureAnnotation(name="Connected")
public void init_vertex( Vertex v ) 
    {
        v.componentNumber = -1;
    }

	
      
    @featureHouse.FeatureAnnotation(name="Connected")
public void postVisitAction( Vertex v ) 
    {
        v.componentNumber = counter;
    }

	

    @featureHouse.FeatureAnnotation(name="Connected")
public void nextRegionAction( Vertex v ) 
    {
        counter ++;
    }


}
