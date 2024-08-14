import java.util.*;

class VectorSearchDemo1 {
    public static void main(String[] args) {
        // create default vector
        Vector<Object> v = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("C++");
        v.add("Python");
        v.add(3);

        // check whether vector contains "Java"
        if (v.contains("Java")) {
            System.out.println("The element exists");
        } else {
            System.out.println("The element does not exist");
        }
    }
}
