// Example 12.8: Deletion from a 1D array

import java.util.Scanner;

public class Example12_8 {

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

    public void delete(int loc) {  // Deletion of the item at loc position
        if (size == 0) {
            System.out.println("Array is underflow: No item to delete!");
            return;
        }
        if (loc < 0 || loc >= size) {
            System.out.println("Out of range: Deletion fails...");
            return;
        }

        int item = a[loc];  // The item at loc
        for (int i = loc; i < size - 1; i++) {  // Shifting operation
            a[i] = a[i + 1];  // Shift to left one place
        }
        a[size - 1] = 0;  // Optional: Clear the last element
        size--;

        System.out.println("Capacity = " + a.length + " Size = " + size);
        System.out.println(java.util.Arrays.toString(a));  // Display the array on the screen
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // To read from keyboard

        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();

        Example12_8 example = new Example12_8();
        example.create(n);

        System.out.println("Enter the position from number to be deleted: ");
        int pos = in.nextInt();

        example.delete(pos);

        System.out.println("Capacity = " + example.a.length + " Size = " + example.size);
        System.out.println(java.util.Arrays.toString(example.a));  // Display the array on the screen
    }
}
