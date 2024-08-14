import java.util.*;

class VectorSearchDemo2 {
    public static void main(String[] args) {
        // create default vector of capacity 10
        Vector<Object> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("Oracle");
        v.add(2);
        v.add("Java");
        v.add(4);

        // Checking last occurrence of 2
        System.out.println("Last occurrence of 2 is: " + v.lastIndexOf(2));
    }
}
