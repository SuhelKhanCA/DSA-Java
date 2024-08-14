import java.util.Arrays;

public class Example14_17_ArraysTraversalDemo {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 22, 35}; // Get the array
        // Get the spliterator of a sublist
        System.out.println("Spliterator of sublist: " + Arrays.spliterator(intArr, 1, 3));
    }
}
