import java.util.*;

class VectorDeletionDemo2 {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>(); // Create a vector of (default) capacity 10
        v.add(1);
        v.add(2);
        v.add("India");
        v.add("Japan");
        v.add(4);
        v.removeElementAt(0); // Removing the element at 0, if it occurs
        System.out.println("After removal: " + v); // Checking vector
        v.removeElement("Japan");
        System.out.println("After removal: " + v); // Checking vector
    }
}
