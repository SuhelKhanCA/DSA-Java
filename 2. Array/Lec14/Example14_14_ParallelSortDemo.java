import java.util.Arrays;

public class Example14_14_ParallelSortDemo {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 22, 35}; // Get the array
        Arrays.parallelSort(intArr); // Sort the array using parallelSort
        System.out.println("Sorted Integer Array using parallelSort: " + Arrays.toString(intArr));
    }
}
