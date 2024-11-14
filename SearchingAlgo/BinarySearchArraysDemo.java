// package SearchingAlgo;

import java.util.Arrays;

public class BinarySearchArraysDemo {

    public static void main(String[] args) {
        // Create the Array
        int[] arr = { 10, 20, 15, 55, 11, 22, 35 };
        
        Arrays.sort(arr);
        System.out.println("Array : " + Arrays.toString(arr));
        int key = 22;
        System.out.println(key + " found at index : " + Arrays.binarySearch(arr, key));
    }
}