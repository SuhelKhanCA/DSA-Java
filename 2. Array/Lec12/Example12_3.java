// Example 12.3: Initialization of a 1D array with user input from keyboard

import java.util.Scanner;

class Example12_3 {

    int[] a = new int[100];  // Declaring a 1D array of size 100
    int size;                // Actual size of the array

    void loadArray() {
        Scanner in = new Scanner(System.in);  // To read from keyboard
        System.out.println("Enter size < 100");
        size = in.nextInt();  // read a number

        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + "th number ");
            a[i] = in.nextInt();  // Load the i-th entry
        }

        System.out.println("Length = " + a.length);
        System.out.println(java.util.Arrays.toString(a));  // Display the array on the screen
    }

    public static void main(String[] args) {
        new Example12_3().loadArray();
    }
}
