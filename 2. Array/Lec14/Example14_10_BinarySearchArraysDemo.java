import java.util.Arrays;

public class Example14_10_BinarySearchArraysDemo {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 22, 35}; // Get the array
        Arrays.sort(intArr); // Sort the array
        int intKey = 22;
        // Perform binary search
        int index = Arrays.binarySearch(intArr, intKey);
        System.out.println(intKey + " found at index = " + index);
    }
}
