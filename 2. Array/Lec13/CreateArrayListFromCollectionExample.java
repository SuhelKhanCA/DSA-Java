// Example 13.2: Creating an ArrayList object with an existing collection

import java.util.ArrayList;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        // Creating a collection first
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(2);
        aList.add(3);
        aList.add(5);
        aList.add(7);
        aList.add(11);

        // Creating another collection initially with aList collection
        ArrayList<Integer> numbers = new ArrayList<>(aList);
        numbers.add(13);
        numbers.add(17);

        System.out.println(aList);    // Displaying the original list
        System.out.println(numbers);  // Displaying the new list
    }
}
