// Example 12.4: Initialization of a 1D array with random numbers

import java.util.Scanner;

class Example12_4 {

    int[] a = new int[100];  // Declaring a 1D array of size 100
    int size;                // Actual size of the array
    int MIN = 1, MAX = 100;  // Range of the numbers

    int generateRandom(int min, int max) {  // Generating a random number
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // To read the size from the user
        System.out.println("Enter size < 100");
        int size = in.nextInt();  // read a number from the keyboard

        Example12_4 example = new Example12_4();
        example.size = size;

        for (int i = 0; i < size; i++) {
            example.a[i] = example.generateRandom(example.MIN, example.MAX);  // Generate and return a random number
        }

        System.out.println("Capacity = " + example.a.length + " Size = " + size);
        System.out.println(java.util.Arrays.toString(example.a));  // Display the array on the screen
    }
}
