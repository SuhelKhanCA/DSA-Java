import java.util.Arrays;

public class Example14_2_ArraysToStreamDemo {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 22, 35}; // Get the array
        // Get the stream from the array
        System.out.println("Integer Array Stream: " + Arrays.stream(intArr));
    }
}
