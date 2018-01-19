package verificationClasses;
import java.util.*;

public class Tree<T> {
    public Node<T> root;
    public Tree(T rootData) {
        root = new Node<T>();
        root.data = rootData;
        root.children = new ArrayList<Node<T>>();
    }
}


