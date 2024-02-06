package Six6MonthsOfCode.Day17;

import java.util.Vector;

public class VectorCopy { // copying an vector into an array of integers
    public static void main(String[] args) {
        Vector vec = new Vector<>(); //

        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(7);

        Integer[] arr = new Integer[7];

        // copying a vector into an array rr
        vec.copyInto(arr);

        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
