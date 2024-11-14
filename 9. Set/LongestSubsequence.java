import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class LongestSubsequence {
    static int maxSeq(Integer[] a) {
        Set<Integer> st = new HashSet<>(Arrays.asList(a));
        int longestLen = 0;

        for (Integer num : st) {
            if (!st.contains(num - 1)) { // Start counting only from the beginning of a sequence
                int len = 1;
                while (st.contains(num + len)) {
                    len++;
                }
                longestLen = Math.max(longestLen, len);
            }
        }

        return longestLen;
    }

    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 15, 16, 17, 10, 30 };
        System.out.println(maxSeq(arr)); // Output: 4, because the longest sequence is [1, 2, 3, 4]
    }
}

/*
 * import java.util.HashSet;
 * import java.util.Set;
 * 
 * public class LongestSubSequence {
 * static int maxSeq(int[] a) {
 * Set<Integer> st = new HashSet<>();
 * 
 * // Manually add each element from the array to the HashSet
 * for (int num : a) {
 * st.add(num);
 * }
 * 
 * int longestLen = 0;
 * 
 * for (int num : st) {
 * // Only start counting from numbers that are the beginning of a sequence
 * if (!st.contains(num - 1)) {
 * int len = 1;
 * while (st.contains(num + len)) {
 * len++;
 * }
 * longestLen = Math.max(longestLen, len);
 * }
 * }
 * 
 * return longestLen;
 * }
 * 
 * public static void main(String[] args) {
 * int[] arr = {1, 2, 3, 4, 15, 16, 17, 10, 30};
 * System.out.println(maxSeq(arr)); // Output: 4, since the longest sequence is
 * [1, 2, 3, 4]
 * }
 * }
 * 
 * 
 */
