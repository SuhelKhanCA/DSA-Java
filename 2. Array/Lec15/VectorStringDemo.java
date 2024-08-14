import java.util.*;

class VectorStringDemo {
    public static void main(String[] args) {
        // create default vector of capacity 10
        Vector<Object> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("Debasis");
        v.add("Samanta");
        v.add(4);

        // string equivalent of vector
        System.out.println("String equivalent of vector: " + v.toString());
    }
}
