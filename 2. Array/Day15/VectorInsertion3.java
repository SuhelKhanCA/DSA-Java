package Six6MonthsOfCode.Day15;

import java.util.ArrayList;
import java.util.Vector;

public class VectorInsertion3 { // copying an array-list into a vector
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(3);
        arr.add("Oracle");
        arr.add("Java");
        arr.add(4);

        Vector v = new Vector(); // creating a default vector
        v.addAll(arr); // copying all the elements of array-list into vector
        System.out.println("Vector is : " + v);
    }
}
