package Six6MonthsOfCode.Day15;

import java.util.Vector;

public class VectorDeletion { // Deletion of elements
    public static void main(String[] args) {
        Vector v = new Vector(); // The initial size of the vector is 10
        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "IIT Kgp");
        v.add(4, 30);
        System.out.println("Vector is : " + v);
        v.clear(); // Clearing the vector
        System.out.println("After clearing : " + v); // checking the vector
    }
}
