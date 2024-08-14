import java.util.*;

class VectorInsertionDemo3 {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(3);
        arr.add("Oracle");
        arr.add("Java");
        arr.add(4);

        Vector<Object> v = new Vector<>(); // Creating a default vector
        v.addAll(arr); // copying all elements of array list into vector
        System.out.println("vector v: " + v); // checking vector v
    }
}
