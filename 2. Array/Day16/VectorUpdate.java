package Six6MonthsOfCode.Day16;

import java.util.Vector;

public class VectorUpdate { // replacement after searching
    public static void main(String[] args) {
        Vector v = new Vector(); // creating a vector of default size 10
        

        v.add(1);
        v.add(2);
        v.add("Mother");
        v.add("Merry");
        v.add(4);
        System.out.println("Vector before updation: " + v);

        // set 4 at the place of 2
        v.setElementAt(4, 2);
        System.out.println("Vector after updation: " + v);
    }
}
