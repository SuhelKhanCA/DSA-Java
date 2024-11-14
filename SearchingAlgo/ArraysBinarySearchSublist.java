// package SearchingAlgo;
import java.util.Arrays;
public class ArraysBinarySearchSublist {

    public static void main(String[] args) {
        // Allocate and Initialize the array
        int[] arr = { 10, 20, 15, 55, 11, 22, 35 };
        System.out.println("========== Original Contents =======");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("========== Array after Sorting =======");
        System.out.println(Arrays.toString(arr));
        int key = 22;
        System.out.println(key + " found at index : " + Arrays.binarySearch(arr, 0, 3, key));
    }
}