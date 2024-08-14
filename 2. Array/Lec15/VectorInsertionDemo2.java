import java.util.*;

class VectorInsertionDemo2 {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>(5); // Create a default vector of size 5
        v.add(1, 1);
        v.add(2, 2);
        v.add(0, "Debasis");
        v.add(3, "Samanta");
        v.add(4, 3);
        v.add(5, 6.9);  // Vector will grow automatically
        // insert 10 at the index 7
        v.insertElementAt(7, 10);
        System.out.println("Vector is " + v);
    }
}
