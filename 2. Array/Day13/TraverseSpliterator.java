package Six6MonthsOfCode.Day13;

import java.util.Arrays;

public class TraverseSpliterator {
    public static void main(String[] args) {
        // Get the array
        int intArr[] = {10, 20, 15, 22, 35};
        System.out.println("Integer Array: "+ Arrays.spliterator(intArr)); // O/P : Integer Array: java.util.Spliterators$IntArraySpliterator@2f92e0f4
    }
}
