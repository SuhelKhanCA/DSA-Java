import java.util.*;

class VectorDeletionDemo1 {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>(); // The initial size of the vector is 10
        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "IIT");
        v.add(3, "Kharagpur");
        v.add(4, 3);
        System.out.println("Vector is: " + v);
        v.clear(); // Clearing the vector
        System.out.println("After clearing: " + v); // checking vector
    }
}
