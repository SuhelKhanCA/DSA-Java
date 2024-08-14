import java.util.Arrays;

public class Example14_13_SortingSublistDemo {
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 22, 35}; // Get the array
        Arrays.sort(intArr, 1, 3); // Sort a sublist
        System.out.println("Integer Array after sorting sublist: " + Arrays.toString(intArr));
    }
}
