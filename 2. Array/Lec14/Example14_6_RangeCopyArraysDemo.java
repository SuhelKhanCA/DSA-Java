import java.util.Arrays;

public class Example14_6_RangeCopyArraysDemo {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 22, 35}; // Get the array
        // Print the original array
        System.out.println("Original Integer Array: " + Arrays.toString(intArr));
        // Copy a range of the array
        int[] rangeArr = Arrays.copyOfRange(intArr, 1, 3);
        System.out.println("New Array by copyOfRange: " + Arrays.toString(rangeArr));
    }
}
