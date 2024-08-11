// Example 13.1: Creating a simple collection

import java.util.ArrayList;

public class SimpleArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of String
        ArrayList<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        // This shows how an entire collection can be displayed
        System.out.println(animals);
    }
}
