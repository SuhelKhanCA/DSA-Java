import java.util.Arrays;

public class Example14_7_CompareArraysDemo {
    public static void main(String[] args) {
        int[][] intArr1 = {{10, 20, 15, 22, 35}}; // An input array
        int[][] intArr2 = {{10, 15, 22}}; // Another input array
        // Compare both arrays
        System.out.println("Arrays comparison result: " + Arrays.deepEquals(intArr1, intArr2));
    }
}
