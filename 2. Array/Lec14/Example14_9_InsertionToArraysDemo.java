import java.util.Arrays;

public class Example14_9_InsertionToArraysDemo {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 22, 35}; // Get the array
        int intKey = 22;
        Arrays.fill(intArr, intKey); // Fill the array
        System.out.println("Integer Array after filling: " + Arrays.toString(intArr));
    }
}
