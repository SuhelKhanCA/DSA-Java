import java.util.*;

class VectorHashcodeDemo {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>(7);

        // use add() method to add elements in the vector
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(7);

        // checking hash code
        System.out.println("Hash code: " + vec.hashCode());
    }
}
