import java.util.*;

class VectorCheckDemo {
    public static void main(String[] args) {
        // Create default vector of capacity 10
        Vector<Object> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("Oracle");
        v.add("Java");
        v.add(4);

        // Second vector
        Vector<Object> v_2nd = new Vector<>();
        v_2nd.add(1);
        v_2nd.add(2);
        v_2nd.add("Java");
        v_2nd.add("Oracle");
        v_2nd.add(4);

        if (v.equals(v_2nd)) {
            System.out.println("Both vectors are equal");
        }
    }
}
