package BST;

// Define the BST
public class TreeNode<T extends Comparable<T>> {
    T element;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T obj) {
        this.element = obj;
        this.left = null;
        this.right = null;
    }

    public TreeNode() {
        this(null);
    }

    // Insertion method
    public void insert(T data) {
        
    }

    // Deletion
    public void delete(T data) {

    }
    
    // in-order
    public void inOrder() {
    
    }

    // searching
    public boolean search(T data) {
    
    }

    // Traversal - pre
    public void preOrder() {
    
    }

    // Traversal - post
    public void postOrder() {
    
    }

    // main method
    public static void main(String[] args) {
    
    }
}