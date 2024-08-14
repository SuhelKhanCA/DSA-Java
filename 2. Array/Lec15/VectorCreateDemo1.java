import java.util.*;

class VectorCreateDemo1 {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>(); // Create a vector of default size 10
        v.add(1);
        v.add(2);
        v.add("Debasis");
        v.add(3.4);
        v.add("Samanta");
        System.out.println("Vector is " + v);
    }
}
