package verificationClasses;
import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    public T data;
    public Node<T> parent;
    
    public Node()
    {
    	children = new ArrayList<Node<T>>();
    }
    
    public void addChild(Node<T> node)
    {
    	if(children == null)
    		children = new ArrayList<Node<T>>();
    	children.add(node);
    	node.parent = this;
    }
    public Measurement getData()
    {
    	return (Measurement)data;
    }
    public List<Node<T>> children;
}