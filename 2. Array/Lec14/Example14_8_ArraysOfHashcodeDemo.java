import java.util.Arrays;

public class Example14_8_ArraysOfHashcodeDemo {
    public static void main(String[] args) {
        int[][] intArr = {{10, 20, 15, 22, 35}}; // Get the 2D array
        // Get the deep hash code of the array
        System.out.println("Integer Array Hashcode: " + Arrays.deepHashCode(intArr));
    }
}
