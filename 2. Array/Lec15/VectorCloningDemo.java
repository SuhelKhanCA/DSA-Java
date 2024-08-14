import java.util.*;

class VectorCloningDemo {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();
        Vector<Object> v_clone;

        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "Oracle");
        v.add(3, "Java");
        v.add(4, 3);

        v_clone = (Vector<Object>) v.clone();
        System.out.println("Clone of v: " + v_clone);
    }
}
