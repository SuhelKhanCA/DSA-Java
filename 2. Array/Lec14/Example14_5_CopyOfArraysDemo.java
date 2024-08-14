import java.util.Arrays;

public class Example14_5_CopyOfArraysDemo {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 22, 35}; // An input array
        // Print the original array
        System.out.println("Original Integer Array: " + Arrays.toString(intArr));
        // Create a new array with a larger size
        int[] newArr = Arrays.copyOf(intArr, 10);
        System.out.println("New Array by copyOf: " + Arrays.toString(newArr));
    }
}
