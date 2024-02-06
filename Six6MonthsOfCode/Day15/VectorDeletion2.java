package Six6MonthsOfCode.Day15;

import java.util.Vector;

public class VectorDeletion2 { // removing the elements from vector one by one
    public static void main(String[] args) {
        Vector v = new Vector(); // Create a vector of (default) capacity 10
        v.add(1);
        v.add(2);
        v.add("India");
        v.add("Japan");
        v.add(4);
        
        v.removeElementAt(0); // removing the element at 0, if it occurs
        System.out.println("After removal: " + v);

        v.removeElement("Japan");
        System.out.println("After removal: "+ v);
    }
}
