// Example 12.7: Insertion into a 1D array

import java.util.Scanner;

public class Example12_7 {

    int[] a = new int[100];  // An integer array with default 100 capacity
    int size = 0;            // The number of items present

    public void create(int size) {  // Initialize the array
        if (size > 100) {
            System.out.println("Could not initialize");
            return;
        }
        this.size = size;
        Scanner in = new Scanner(System.in);  // To read from keyboard
        for (int i = 0; i < size; i++) {  // Reading the number
            System.out.println("Enter " + (i + 1) + "th number ");
            a[i] = in.nextInt();  // Load the i-th entry
        }
        System.out.println("Capacity = " + a.length + " Size = " + size);
        System.out.println(java.util.Arrays.toString(a));  // Display the array on the screen
    }

    public void insert(int item, int loc) {  // Insertion at loc of the array
        if (size == a.length) {
            System.out.println("Array is overflow: Insertion fails");
            return;
        }
        if (loc < 0 || loc > size) {
            System.out.println("Out of range: Insertion fails");
            return;
        }

        for (int i = size; i > loc; i--) {  // Shifting operation
            a[i] = a[i - 1];  // Shift to right one place
        }
        a[loc] = item;
        size++;

        System.out.println("Capacity = " + a.length + " Size = " + size);
        System.out.println(java.util.Arrays.toString(a));  // Display the array on the screen
    }

    public static void main(String[] args) {
        Scanner in =
        Scanner in = new Scanner(System.in);  // To read from keyboard

        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();

        Example12_7 example = new Example12_7();
        example.create(n);

        System.out.println("Enter the new number to be inserted: ");
        int item = in.nextInt();

        System.out.println("At position? ");
        int pos = in.nextInt();

        example.insert(item, pos);

        System.out.println("Capacity = " + example.a.length + " Size = " + example.size);
        System.out.println(java.util.Arrays.toString(example.a));  // Display the array on the screen
    }
}
