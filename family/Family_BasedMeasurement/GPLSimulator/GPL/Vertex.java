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

	

    @featureHouse.FeatureAnnotation(name="DirectedOnlyVertices")
public Vertex() {
        VertexConstructor();
    
        VertexConstructor();
    
        VertexConstructor();
    
        VertexConstructor( );
    
        VertexConstructor( );
    
        VertexConstructor();
    }

	
  
    @featureHouse.FeatureAnnotation(name="DirectedOnlyVertices")
public void VertexConstructor__before__DirectedWithEdges() {
        name      = null;
        adjacentVertices = new LinkedList();
    }

	
  
    @featureHouse.FeatureAnnotation(name="DirectedWithEdges")
public void  VertexConstructor__role__DirectedWithEdges() {
        name      = null;
        neighbors = new LinkedList();
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=7, thenFeature="DirectedWithEdges", elseFeature="DirectedOnlyVertices")
public void
VertexConstructor__before__DirectedWithNeighbors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
        VertexConstructor__role__DirectedWithEdges();
    } else {
        VertexConstructor__before__DirectedWithEdges();
    }
}



	

    @featureHouse.FeatureAnnotation(name="DirectedWithNeighbors")
public void  VertexConstructor__role__DirectedWithNeighbors() {
        name      = null;
        adjacentNeighbors = new LinkedList();
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=19, thenFeature="DirectedWithNeighbors", elseFeature="featureSwitch")
public void
VertexConstructor__before__UndirectedOnlyVertices() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
        VertexConstructor__role__DirectedWithNeighbors();
    } else {
        VertexConstructor__before__DirectedWithNeighbors();
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
public void  VertexConstructor__role__UndirectedOnlyVertices( )
    {
        name      = null;
        adjacentVertices = new LinkedList();
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=31, thenFeature="UndirectedOnlyVertices", elseFeature="featureSwitch")
public void
VertexConstructor__before__UndirectedWithEdges() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        VertexConstructor__role__UndirectedOnlyVertices();
    } else {
        VertexConstructor__before__UndirectedOnlyVertices();
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
public void  VertexConstructor__role__UndirectedWithEdges( ) 
    {
        name      = null;
        neighbors = new LinkedList( );
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=55, thenFeature="UndirectedWithEdges", elseFeature="featureSwitch")
public void
VertexConstructor__before__UndirectedWithNeighbors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        VertexConstructor__role__UndirectedWithEdges();
    } else {
        VertexConstructor__before__UndirectedWithEdges();
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public void  VertexConstructor__role__UndirectedWithNeighbors() 
    {
        name      = null;
        adjacentNeighbors = new LinkedList();
    }

	
      
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=79, thenFeature="UndirectedWithNeighbors", elseFeature="featureSwitch")
public void
VertexConstructor__before__WeightedOnlyVertices() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        VertexConstructor__role__UndirectedWithNeighbors();
    } else {
        VertexConstructor__before__UndirectedWithNeighbors();
    }
}



	
      
    @featureHouse.FeatureAnnotation(name="WeightedOnlyVertices")
public void  VertexConstructor__role__WeightedOnlyVertices() {
        VertexConstructor__before__WeightedOnlyVertices();
        weightsList = new LinkedList();
    }

	
 
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=97, thenFeature="WeightedOnlyVertices", elseFeature="featureSwitch")
public void
VertexConstructor__before__BFS() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedOnlyVertices) {
        VertexConstructor__role__WeightedOnlyVertices();
    } else {
        VertexConstructor__before__WeightedOnlyVertices();
    }
}



	
 
    @featureHouse.FeatureAnnotation(name="BFS")
public void  VertexConstructor__role__BFS( ) 
    {
        VertexConstructor__before__BFS();
        visited = false;
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=108, thenFeature="BFS", elseFeature="featureSwitch")
public void
VertexConstructor__before__DFS() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_BFS) {
        VertexConstructor__role__BFS();
    } else {
        VertexConstructor__before__BFS();
    }
}



	

    @featureHouse.FeatureAnnotation(name="DFS")
public void  VertexConstructor__role__DFS( ) 
    {
        VertexConstructor__before__DFS( );
        visited = false;
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=115, thenFeature="DFS", elseFeature="featureSwitch")
public void
VertexConstructor() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
        VertexConstructor__role__DFS();
    } else {
        VertexConstructor__before__DFS();
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedOnlyVertices")
public  Vertex assignName__before__DirectedWithEdges( String name ) {
        this.name = name;
        return ( Vertex ) this;
    }

	

    @featureHouse.FeatureAnnotation(name="DirectedWithEdges")
public Vertex  assignName__role__DirectedWithEdges( String name ) {
        this.name = name;
        return ( Vertex ) this;
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=8, thenFeature="DirectedWithEdges", elseFeature="DirectedOnlyVertices")
public  Vertex
assignName__before__DirectedWithNeighbors( String name ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
        return assignName__role__DirectedWithEdges(name);
    } else {
        return assignName__before__DirectedWithEdges(name);
    }
}



	

    @featureHouse.FeatureAnnotation(name="DirectedWithNeighbors")
public Vertex  assignName__role__DirectedWithNeighbors( String name ) {
        this.name = name;
        return ( Vertex ) this;
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=20, thenFeature="DirectedWithNeighbors", elseFeature="featureSwitch")
public  Vertex
assignName__before__UndirectedOnlyVertices( String name ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
        return assignName__role__DirectedWithNeighbors(name);
    } else {
        return assignName__before__DirectedWithNeighbors(name);
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
public Vertex  assignName__role__UndirectedOnlyVertices( String name )
    {
        this.name = name;
        return ( Vertex ) this;
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=32, thenFeature="UndirectedOnlyVertices", elseFeature="featureSwitch")
public  Vertex
assignName__before__UndirectedWithEdges( String name ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        return assignName__role__UndirectedOnlyVertices(name);
    } else {
        return assignName__before__UndirectedOnlyVertices(name);
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
public Vertex  assignName__role__UndirectedWithEdges( String name ) 
    {
        this.name = name;
        return ( Vertex ) this;
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=56, thenFeature="UndirectedWithEdges", elseFeature="featureSwitch")
public  Vertex
assignName__before__UndirectedWithNeighbors( String name ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        return assignName__role__UndirectedWithEdges(name);
    } else {
        return assignName__before__UndirectedWithEdges(name);
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public Vertex  assignName__role__UndirectedWithNeighbors( String name ) 
    {
        this.name = name;
        return ( Vertex ) this;
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=80, thenFeature="UndirectedWithNeighbors", elseFeature="featureSwitch")
public  Vertex
assignName( String name ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        return assignName__role__UndirectedWithNeighbors(name);
    } else {
        return assignName__before__UndirectedWithNeighbors(name);
    }
}



	

    //dja: fix for compile errors during performance improvements
    @featureHouse.FeatureAnnotation (name="DirectedOnlyVertices")
public String getName__before__DirectedWithEdges( ) 
    { 
        return name; 
    }

	

    //dja: fix for compile errors during performance improvements
    @featureHouse.FeatureAnnotation(name="DirectedWithEdges")
public String  getName__role__DirectedWithEdges() { return name; }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=9, thenFeature="DirectedWithEdges", elseFeature="DirectedOnlyVertices")
public String
getName__before__DirectedWithNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
        return getName__role__DirectedWithEdges();
    } else {
        return getName__before__DirectedWithEdges();
    }
}



	

    @featureHouse.FeatureAnnotation(name="DirectedWithNeighbors")
public String  getName__role__DirectedWithNeighbors( ) 
    { 
        return name; 
    }

	
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=21, thenFeature="DirectedWithNeighbors", elseFeature="featureSwitch")
public String
getName__before__UndirectedOnlyVertices( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
        return getName__role__DirectedWithNeighbors();
    } else {
        return getName__before__DirectedWithNeighbors();
    }
}



	
    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
public String  getName__role__UndirectedOnlyVertices( )
    {
        return this.name;
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=33, thenFeature="UndirectedOnlyVertices", elseFeature="featureSwitch")
public String
getName__before__UndirectedWithEdges( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        return getName__role__UndirectedOnlyVertices();
    } else {
        return getName__before__UndirectedOnlyVertices();
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
public String  getName__role__UndirectedWithEdges( )
    {
        return this.name;
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=57, thenFeature="UndirectedWithEdges", elseFeature="featureSwitch")
public String
getName__before__UndirectedWithNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        return getName__role__UndirectedWithEdges();
    } else {
        return getName__before__UndirectedWithEdges();
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public String  getName__role__UndirectedWithNeighbors( )
    {
        return this.name;
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=81, thenFeature="UndirectedWithNeighbors", elseFeature="featureSwitch")
public String
getName( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        return getName__role__UndirectedWithNeighbors();
    } else {
        return getName__before__UndirectedWithNeighbors();
    }
}



	

 
    @featureHouse.FeatureAnnotation (name="DirectedOnlyVertices")
public void addAdjacent__before__UndirectedOnlyVertices( Vertex n ) {
        adjacentVertices.add( n );
    }

	

 
    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
public void  addAdjacent__role__UndirectedOnlyVertices( Vertex n ) {
        adjacentVertices.add( n );
    }

	
//--------------------
// differences
//--------------------

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=34, thenFeature="UndirectedOnlyVertices", elseFeature="DirectedOnlyVertices")
public void
addAdjacent( Vertex n ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        addAdjacent__role__UndirectedOnlyVertices(n);
    } else {
        addAdjacent__before__UndirectedOnlyVertices(n);
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedOnlyVertices")
public void adjustAdorns__before__UndirectedOnlyVertices( Vertex the_vertex, int index ) 
      {}

	

    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
public void  adjustAdorns__role__UndirectedOnlyVertices( Vertex the_vertex, int index )
      {}

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=35, thenFeature="UndirectedOnlyVertices", elseFeature="DirectedOnlyVertices")
public void
adjustAdorns__before__WeightedOnlyVertices( Vertex the_vertex, int index ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        adjustAdorns__role__UndirectedOnlyVertices(the_vertex, index);
    } else {
        adjustAdorns__before__UndirectedOnlyVertices(the_vertex, index);
    }
}



	

    @featureHouse.FeatureAnnotation(name="WeightedOnlyVertices")
public void  adjustAdorns__role__WeightedOnlyVertices( Vertex the_vertex, int index )
    {
        int the_weight = ( ( Integer )the_vertex.weightsList.get( index ) ).intValue();
        weightsList.add( new Integer( the_weight ) );
        adjustAdorns__before__WeightedOnlyVertices( the_vertex, index );
    }

	
    
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=98, thenFeature="WeightedOnlyVertices", elseFeature="featureSwitch")
public void
adjustAdorns( Vertex the_vertex, int index ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedOnlyVertices) {
        adjustAdorns__role__WeightedOnlyVertices(the_vertex, index);
    } else {
        adjustAdorns__before__WeightedOnlyVertices(the_vertex, index);
    }
}



	
      
    // dja - trying to fix compile errors
    @featureHouse.FeatureAnnotation (name="DirectedOnlyVertices")
public VertexIter getNeighbors__before__DirectedWithEdges( ) 
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
    @featureHouse.FeatureAnnotation(name="DirectedWithEdges")
public VertexIter  getNeighbors__role__DirectedWithEdges() {
        return new VertexIter() {
                private Iterator iter = neighbors.iterator();
                public Vertex next() { return ((Neighbor)iter.next()).end; }
                public boolean hasNext() { return iter.hasNext(); }
            };
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=10, thenFeature="DirectedWithEdges", elseFeature="DirectedOnlyVertices")
public VertexIter
getNeighbors__before__DirectedWithNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
        return getNeighbors__role__DirectedWithEdges();
    } else {
        return getNeighbors__before__DirectedWithEdges();
    }
}



	

    @featureHouse.FeatureAnnotation(name="DirectedWithNeighbors")
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

	


    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=22, thenFeature="DirectedWithNeighbors", elseFeature="featureSwitch")
public VertexIter
getNeighbors__before__UndirectedOnlyVertices( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
        return getNeighbors__role__DirectedWithNeighbors();
    } else {
        return getNeighbors__before__DirectedWithNeighbors();
    }
}



	


    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
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

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=36, thenFeature="UndirectedOnlyVertices", elseFeature="featureSwitch")
public VertexIter
getNeighbors__before__UndirectedWithEdges( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        return getNeighbors__role__UndirectedOnlyVertices();
    } else {
        return getNeighbors__before__UndirectedOnlyVertices();
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
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

	


    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=58, thenFeature="UndirectedWithEdges", elseFeature="featureSwitch")
public VertexIter
getNeighbors__before__UndirectedWithNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        return getNeighbors__role__UndirectedWithEdges();
    } else {
        return getNeighbors__before__UndirectedWithEdges();
    }
}



	


    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
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

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=82, thenFeature="UndirectedWithNeighbors", elseFeature="featureSwitch")
public VertexIter
getNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        return getNeighbors__role__UndirectedWithNeighbors();
    } else {
        return getNeighbors__before__UndirectedWithNeighbors();
    }
}



	


    @featureHouse.FeatureAnnotation (name="DirectedOnlyVertices")
public void display__before__DirectedWithEdges() {
        int s = adjacentVertices.size();
        int i;

        System.out.print( "Vertex " + name + " connected to: " );

        for ( i=0; i<s; i++ )
            System.out.print( ( ( Vertex )adjacentVertices.get( i ) ).name+", " );
        System.out.println();
    }

	


    @featureHouse.FeatureAnnotation(name="DirectedWithEdges")
public void  display__role__DirectedWithEdges() {
        System.out.print( " Node " + getName() + " connected to: " );

        for(VertexIter vxiter = getNeighbors(); vxiter.hasNext(); )
         {
            Vertex v = vxiter.next();
            System.out.print( v.getName() + ", " );
        }

        System.out.println();
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=11, thenFeature="DirectedWithEdges", elseFeature="DirectedOnlyVertices")
public void
display__before__DirectedWithNeighbors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithEdges) {
        display__role__DirectedWithEdges();
    } else {
        display__before__DirectedWithEdges();
    }
}



	

    @featureHouse.FeatureAnnotation(name="DirectedWithNeighbors")
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

	
      
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=23, thenFeature="DirectedWithNeighbors", elseFeature="featureSwitch")
public void
display__before__UndirectedOnlyVertices() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DirectedWithNeighbors) {
        display__role__DirectedWithNeighbors();
    } else {
        display__before__DirectedWithNeighbors();
    }
}



	
      
    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
public void  display__role__UndirectedOnlyVertices() {
        int s = adjacentVertices.size();
        int i;

        System.out.print( "Vertex " + name + " connected to: " );
        for ( i=0; i<s; i++ )
            System.out.print( ( ( Vertex ) adjacentVertices.get( i ) ).name
                                                + ", " );
        System.out.println();
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=37, thenFeature="UndirectedOnlyVertices", elseFeature="featureSwitch")
public void
display__before__UndirectedWithEdges() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        display__role__UndirectedOnlyVertices();
    } else {
        display__before__UndirectedOnlyVertices();
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
public void  display__role__UndirectedWithEdges( ) 
    {
        System.out.print( " Node " + name + " connected to: " );

        for ( VertexIter vxiter = getNeighbors( ); vxiter.hasNext( ); )
        {
            System.out.print( vxiter.next().getName() + ", " );
        }

        System.out.println( );
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=59, thenFeature="UndirectedWithEdges", elseFeature="featureSwitch")
public void
display__before__UndirectedWithNeighbors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        display__role__UndirectedWithEdges();
    } else {
        display__before__UndirectedWithEdges();
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public void  display__role__UndirectedWithNeighbors( ) 
    {
        System.out.print( "Node " + name + " connected to: " );

        for ( VertexIter vxiter = getNeighbors( ); vxiter.hasNext( ); )
        {
            System.out.print( vxiter.next( ).getName( ) + ", " );
        }

        System.out.println();
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=83, thenFeature="UndirectedWithNeighbors", elseFeature="featureSwitch")
public void
display__before__WeightedOnlyVertices() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        display__role__UndirectedWithNeighbors();
    } else {
        display__before__UndirectedWithNeighbors();
    }
}



	

    @featureHouse.FeatureAnnotation(name="WeightedOnlyVertices")
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

	
                          
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=99, thenFeature="WeightedOnlyVertices", elseFeature="featureSwitch")
public void
display__before__WeightedWithNeighbors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedOnlyVertices) {
        display__role__WeightedOnlyVertices();
    } else {
        display__before__WeightedOnlyVertices();
    }
}



	
                          
    @featureHouse.FeatureAnnotation(name="WeightedWithNeighbors")
public void  display__role__WeightedWithNeighbors()
    {
        display__before__WeightedWithNeighbors();
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=103, thenFeature="WeightedWithNeighbors", elseFeature="featureSwitch")
public void
display__before__BFS() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedWithNeighbors) {
        display__role__WeightedWithNeighbors();
    } else {
        display__before__WeightedWithNeighbors();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="BFS")
public void  display__role__BFS( ) 
    {
        if ( visited )
            System.out.print( "  visited " );
        else
            System.out.println( " !visited " );
        display__before__BFS( );
    }

	 // of bfsNodeSearch

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=109, thenFeature="BFS", elseFeature="featureSwitch")
public void
display__before__Connected() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_BFS) {
        display__role__BFS();
    } else {
        display__before__BFS();
    }
}



	 // of bfsNodeSearch

    @featureHouse.FeatureAnnotation(name="Connected")
public void  display__role__Connected( ) 
    {
        System.out.print( " comp# "+ componentNumber + " " );
        display__before__Connected( );
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=111, thenFeature="Connected", elseFeature="featureSwitch")
public void
display__before__Cycle() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Connected) {
        display__role__Connected();
    } else {
        display__before__Connected();
    }
}



	

    @featureHouse.FeatureAnnotation(name="Cycle")
public void  display__role__Cycle() {
        System.out.print( " VertexCycle# " + VertexCycle + " " );
        display__before__Cycle();
    }

	 // white ->0, gray ->1, black->2
      
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=113, thenFeature="Cycle", elseFeature="featureSwitch")
public void
display__before__DFS() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Cycle) {
        display__role__Cycle();
    } else {
        display__before__Cycle();
    }
}



	 // white ->0, gray ->1, black->2
      
    @featureHouse.FeatureAnnotation(name="DFS")
public void  display__role__DFS( ) {
        if ( visited )
            System.out.print( "  visited" );
        else
            System.out.println( " !visited " );
        display__before__DFS( );
    }

	 // of dftNodeSearch

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=116, thenFeature="DFS", elseFeature="featureSwitch")
public void
display__before__MSTKruskal() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
        display__role__DFS();
    } else {
        display__before__DFS();
    }
}



	 // of dftNodeSearch

    @featureHouse.FeatureAnnotation(name="MSTKruskal")
public void  display__role__MSTKruskal() {
        if ( representative == null )
            System.out.print( "Rep null " );
        else
            System.out.print( " Rep " + representative.getName() + " " );
        display__before__MSTKruskal();
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=125, thenFeature="MSTKruskal", elseFeature="featureSwitch")
public void
display__before__MSTPrim() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_MSTKruskal) {
        display__role__MSTKruskal();
    } else {
        display__before__MSTKruskal();
    }
}



	

    @featureHouse.FeatureAnnotation(name="MSTPrim")
public void  display__role__MSTPrim( ) 
    {
        System.out.print( " Pred " + pred + " Key " + key + " " );
        display__before__MSTPrim( );
    }

	 // weight so far from s to it
            
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=127, thenFeature="MSTPrim", elseFeature="featureSwitch")
public void
display__before__Number() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_MSTPrim) {
        display__role__MSTPrim();
    } else {
        display__before__MSTPrim();
    }
}



	 // weight so far from s to it
            
    @featureHouse.FeatureAnnotation(name="Number")
public void  display__role__Number( ) 
    {
        System.out.print( " # "+ VertexNumber + " " );
        display__before__Number( );
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=129, thenFeature="Number", elseFeature="featureSwitch")
public void
display() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Number) {
        display__role__Number();
    } else {
        display__before__Number();
    }
}



	

//--------------------
// from EdgeIfc
//--------------------

    @featureHouse.FeatureAnnotation (name="DirectedOnlyVertices")
public Vertex getStart__before__UndirectedOnlyVertices( ) { return null; }

	

//--------------------
// from EdgeIfc
//--------------------

    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
public Vertex  getStart__role__UndirectedOnlyVertices( ) { return null; }

	

//--------------------
// from EdgeIfc
//--------------------

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=38, thenFeature="UndirectedOnlyVertices", elseFeature="DirectedOnlyVertices")
public Vertex
getStart( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        return getStart__role__UndirectedOnlyVertices();
    } else {
        return getStart__before__UndirectedOnlyVertices();
    }
}



	
    @featureHouse.FeatureAnnotation (name="DirectedOnlyVertices")
public Vertex getEnd__before__UndirectedOnlyVertices( ) { return null; }

	
    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
public Vertex  getEnd__role__UndirectedOnlyVertices( ) { return null; }

	
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=39, thenFeature="UndirectedOnlyVertices", elseFeature="DirectedOnlyVertices")
public Vertex
getEnd( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        return getEnd__role__UndirectedOnlyVertices();
    } else {
        return getEnd__before__UndirectedOnlyVertices();
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedOnlyVertices")
public void setWeight__before__UndirectedOnlyVertices( int weight ){}

	

    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
public void  setWeight__role__UndirectedOnlyVertices( int weight ){}

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=40, thenFeature="UndirectedOnlyVertices", elseFeature="DirectedOnlyVertices")
public void
setWeight( int weight ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        setWeight__role__UndirectedOnlyVertices(weight);
    } else {
        setWeight__before__UndirectedOnlyVertices(weight);
    }
}



	
    @featureHouse.FeatureAnnotation (name="DirectedOnlyVertices")
public int getWeight__before__UndirectedOnlyVertices() { return 0; }

	
    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
public int  getWeight__role__UndirectedOnlyVertices() { return 0; }

	
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=41, thenFeature="UndirectedOnlyVertices", elseFeature="DirectedOnlyVertices")
public int
getWeight() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        return getWeight__role__UndirectedOnlyVertices();
    } else {
        return getWeight__before__UndirectedOnlyVertices();
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedOnlyVertices")
public Vertex getOtherVertex__before__UndirectedOnlyVertices( Vertex vertex )
    {
        return this;
    }

	

    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
public Vertex  getOtherVertex__role__UndirectedOnlyVertices( Vertex vertex )
    {
        return this;
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=42, thenFeature="UndirectedOnlyVertices", elseFeature="DirectedOnlyVertices")
public Vertex
getOtherVertex( Vertex vertex ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        return getOtherVertex__role__UndirectedOnlyVertices(vertex);
    } else {
        return getOtherVertex__before__UndirectedOnlyVertices(vertex);
    }
}



	



    @featureHouse.FeatureAnnotation (name="DirectedOnlyVertices")
public void adjustAdorns__before__UndirectedOnlyVertices( EdgeIfc the_edge )
    {
    }

	



    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
public void  adjustAdorns__role__UndirectedOnlyVertices( EdgeIfc the_edge )
    {
    }

	



    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=43, thenFeature="UndirectedOnlyVertices", elseFeature="DirectedOnlyVertices")
public void
adjustAdorns( EdgeIfc the_edge ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        adjustAdorns__role__UndirectedOnlyVertices(the_edge);
    } else {
        adjustAdorns__before__UndirectedOnlyVertices(the_edge);
    }
}



	
    public LinkedList neighbors  ;

	

    @featureHouse.FeatureAnnotation (name="DirectedWithEdges")
public void addNeighbor__before__UndirectedWithEdges( Neighbor n ) {
        neighbors.add( n );
    }

	

    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
public void  addNeighbor__role__UndirectedWithEdges( Neighbor n ) 
    {
        neighbors.add( n );
    }

	      
//--------------------
// differences
//--------------------

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=60, thenFeature="UndirectedWithEdges", elseFeature="DirectedWithEdges")
public void
addNeighbor( Neighbor n ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        addNeighbor__role__UndirectedWithEdges(n);
    } else {
        addNeighbor__before__UndirectedWithEdges(n);
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedWithEdges")
public EdgeIter getEdges__before__UndirectedOnlyVertices()
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

	

    @featureHouse.FeatureAnnotation(name="UndirectedOnlyVertices")
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

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=44, thenFeature="UndirectedOnlyVertices", elseFeature="DirectedWithEdges")
public EdgeIter
getEdges__before__UndirectedWithEdges() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedOnlyVertices) {
        return getEdges__role__UndirectedOnlyVertices();
    } else {
        return getEdges__before__UndirectedOnlyVertices();
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
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

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=61, thenFeature="UndirectedWithEdges", elseFeature="featureSwitch")
public EdgeIter
getEdges__before__UndirectedWithNeighbors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        return getEdges__role__UndirectedWithEdges();
    } else {
        return getEdges__before__UndirectedWithEdges();
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
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

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=84, thenFeature="UndirectedWithNeighbors", elseFeature="featureSwitch")
public EdgeIter
getEdges() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        return getEdges__role__UndirectedWithNeighbors();
    } else {
        return getEdges__before__UndirectedWithNeighbors();
    }
}



	
    public LinkedList adjacentNeighbors  ;

	
   
    @featureHouse.FeatureAnnotation (name="DirectedWithNeighbors")
public void addEdge__before__UndirectedWithNeighbors( Neighbor n ) {
        adjacentNeighbors.add( n );
    }

	
   
    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public void  addEdge__role__UndirectedWithNeighbors( Neighbor n ) 
    {
        adjacentNeighbors.add( n );
    }

	
//--------------------
// differences
//--------------------

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=85, thenFeature="UndirectedWithNeighbors", elseFeature="DirectedWithNeighbors")
public void
addEdge( Neighbor n ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        addEdge__role__UndirectedWithNeighbors(n);
    } else {
        addEdge__before__UndirectedWithNeighbors(n);
    }
}



	

    @featureHouse.FeatureAnnotation (name="DirectedWithNeighbors")
public void adjustAdorns__before__UndirectedWithNeighbors( Neighbor sourceNeighbor )
      {}

	

    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public void  adjustAdorns__role__UndirectedWithNeighbors( Neighbor sourceNeighbor )
    {
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=86, thenFeature="UndirectedWithNeighbors", elseFeature="DirectedWithNeighbors")
public void
adjustAdorns__before__WeightedWithNeighbors( Neighbor sourceNeighbor ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        adjustAdorns__role__UndirectedWithNeighbors(sourceNeighbor);
    } else {
        adjustAdorns__before__UndirectedWithNeighbors(sourceNeighbor);
    }
}



	

    @featureHouse.FeatureAnnotation(name="WeightedWithNeighbors")
public void  adjustAdorns__role__WeightedWithNeighbors( Neighbor sourceNeighbor )
     {
        Neighbor targetNeighbor = 
                ( Neighbor )adjacentNeighbors.getLast();
        targetNeighbor.weight = sourceNeighbor.weight;
        adjustAdorns__before__WeightedWithNeighbors( sourceNeighbor );
    }

	
    
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=104, thenFeature="WeightedWithNeighbors", elseFeature="featureSwitch")
public void
adjustAdorns( Neighbor sourceNeighbor ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_WeightedWithNeighbors) {
        adjustAdorns__role__WeightedWithNeighbors(sourceNeighbor);
    } else {
        adjustAdorns__before__WeightedWithNeighbors(sourceNeighbor);
    }
}



	
    @featureHouse.FeatureAnnotation (name="UndirectedOnlyVertices")
public LinkedList getNeighborsObj__before__UndirectedWithEdges( )
    {
      return adjacentVertices;
    }

	
    @featureHouse.FeatureAnnotation(name="UndirectedWithEdges")
public LinkedList  getNeighborsObj__role__UndirectedWithEdges( )
    {
 	  return neighbors;
    }

	

    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=62, thenFeature="UndirectedWithEdges", elseFeature="UndirectedOnlyVertices")
public LinkedList
getNeighborsObj__before__UndirectedWithNeighbors( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithEdges) {
        return getNeighborsObj__role__UndirectedWithEdges();
    } else {
        return getNeighborsObj__before__UndirectedWithEdges();
    }
}



	

    @featureHouse.FeatureAnnotation(name="UndirectedWithNeighbors")
public LinkedList  getNeighborsObj__role__UndirectedWithNeighbors( )
    {
 	  return adjacentNeighbors;
    }

	
    
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=87, thenFeature="UndirectedWithNeighbors", elseFeature="featureSwitch")
public LinkedList
getNeighborsObj( ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_UndirectedWithNeighbors) {
        return getNeighborsObj__role__UndirectedWithNeighbors();
    } else {
        return getNeighborsObj__before__UndirectedWithNeighbors();
    }
}



	
    public LinkedList weightsList;

	
         
    @featureHouse.FeatureAnnotation(name="WeightedOnlyVertices")
public void addWeight( int weight )
    {
        weightsList.add( new Integer( weight ) );
    }

	
    @featureHouse.FeatureAnnotation(name="WeightedWithNeighbors")
public void addWeight( Vertex end, int theWeight ) 
    {
        Neighbor the_neighbor = 
                ( Neighbor ) ( end.adjacentNeighbors ).removeLast();
        the_neighbor.weight = theWeight;
        ( end.adjacentNeighbors ).add( the_neighbor );
    }

	
    public boolean visited  ;

	

    @featureHouse.FeatureAnnotation (name="BFS")
public void init_vertex__before__DFS( WorkSpace w ) 
    {
        visited = false;
        w.init_vertex( ( Vertex ) this );
    }

	

    @featureHouse.FeatureAnnotation(name="DFS")
public void  init_vertex__role__DFS( WorkSpace w ) 
    {
        visited = false;
        w.init_vertex( ( Vertex ) this );
    }

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=117, thenFeature="DFS", elseFeature="BFS")
public void
init_vertex( WorkSpace w ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
        init_vertex__role__DFS(w);
    } else {
        init_vertex__before__DFS(w);
    }
}



	

    @featureHouse.FeatureAnnotation (name="BFS")
public void nodeSearch__before__DFS( WorkSpace w ) 
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

	

    @featureHouse.FeatureAnnotation(name="DFS")
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

	

    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=118, thenFeature="DFS", elseFeature="BFS")
public void
nodeSearch( WorkSpace w ) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_DFS) {
        nodeSearch__role__DFS(w);
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


}
