import java.util.Arrays;

public class Example14_11_ArraysBinarySearchSubListDemo {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 22, 35}; // Get the array
        Arrays.sort(intArr); // Sort the array
        int intKey = 22;
        // Perform binary search on a sublist
        int index = Arrays.binarySearch(intArr, 1, 3, intKey);
        System.out.println(intKey + " found at index = " + index);
    }
}
