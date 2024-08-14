import java.util.Arrays;

public class Example14_16_TraversalSpliterator {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 22, 35}; // Get the array
        // Get the spliterator of the array
        System.out.println("Spliterator: " + Arrays.spliterator(intArr));
    }
}
