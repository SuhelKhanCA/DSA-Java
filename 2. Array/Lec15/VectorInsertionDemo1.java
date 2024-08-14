import java.util.*;

class VectorInsertionDemo1 {
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
        // insert 10 at the index 7
        vec.insertElementAt(10, 7);
        // checking vector
        System.out.println("Vector: " + vec);
    }
}
