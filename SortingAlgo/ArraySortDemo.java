import java.util.Arrays;

class ArraySortDemo{
    public static void main(String[] args) {
        // Allocate and Initialize the array
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println("========== Original Contents =======");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("========== Array after Sorting =======");
        System.out.println(Arrays.toString(arr));
    }
}