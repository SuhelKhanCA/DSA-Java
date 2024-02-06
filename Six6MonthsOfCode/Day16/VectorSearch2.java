package Six6MonthsOfCode.Day16;

import java.util.Vector;

public class VectorSearch2 { // checking last occurence of an element
    public static void main(String[] args) {
        
        // create default vector of capacity 10
        Vector v = new Vector(); 

        v.add(1);
        v.add(2);
        v.add("Oracle");
        v.add(2);
        v.add("Java");
        v.add(4);

        // checking last occurence of an elements
        System.out.println("The last occurence of 2 is : " + v.lastIndexOf(2));
    }
}
