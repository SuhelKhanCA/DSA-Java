import java.util.*;

class VectorUpdateDemo {
    public static void main(String[] args) {
        // Create default vector of capacity 10
        Vector<Object> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("Mother");
        v.add("Merry");
        v.add(4);

        // Set 4 at the place of 2
        v.setElementAt(4, 1);

        System.out.println("Vector: " + v);
    }
}
