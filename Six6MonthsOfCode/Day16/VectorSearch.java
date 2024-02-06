package Six6MonthsOfCode.Day16;

import java.util.Vector;

public class VectorSearch { // Searching an element using contains method
    public static void main(String[] args) {
        
        // creating a default vector
        Vector  v  = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("C++");
        v.add("Python");
        v.add(3);

        // check whether a vector contains a elements or not
        if (v.contains("Java")) {
            System.out.println("The elements exists.");
        } else {
            System.out.println("Element does not exists");
        }
    }
}
