// Example 13.4: Insertion into an ArrayList collection

import java.util.ArrayList;

public class InsertionArrayListDemo {
    public static void main(String[] args) {
        // Creating a collection
        ArrayList<Integer> odd = new ArrayList<>();
        odd.add(1);
        odd.add(3);
        odd.add(5);
        odd.add(7);
        odd.add(9);

        System.out.println(odd);

        // Creating another collection
        ArrayList<Integer> numbers = new ArrayList<>(odd);
        System.out.println(numbers);

        // Creating another collection
        ArrayList<Integer> even1 = new ArrayList<>();
        even1.add(2);
        even1.add(4);
        even1.add(6);

        // Insert all elements of even1 into numbers
        numbers.addAll(even1);
        System.out.println(numbers);

        // Creating another collection
        ArrayList<Integer> any = new ArrayList<>();
        any.add(8);
        any.add(11);
        any.add(13);

        // Add the collection any at 5-th location
        numbers.addAll(5, any);
        numbers.add(0, 0);
        System.out.println(numbers);

        // Uncommenting the following line will throw an exception:
        // numbers.add(100, 999); // Index out of bounds
    }
}
