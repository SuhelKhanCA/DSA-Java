import java.util.*;

class VectorCopyDemo {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>(7);
        // Use add() method to add elements in the vector
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(7);

        Integer[] arr = new Integer[7];

        // Copy a vector into array arr
        vec.copyInto(arr);

        System.out.println("Elements in array arr: ");
        for (Integer num : arr) {
            System.out.println(num);
        }
    }
}
