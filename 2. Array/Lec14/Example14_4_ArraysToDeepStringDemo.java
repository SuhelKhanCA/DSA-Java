import java.util.Arrays;

public class Example14_4_ArraysToDeepStringDemo {
    public static void main(String[] args) {
        int[][] intArr = {{10, 20, 15, 22, 35}}; // Get the 2D array
        // Get the deep string representation of the array
        System.out.println("Integer Array: " + Arrays.deepToString(intArr));
    }
}
