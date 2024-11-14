import java.util.*;
public class LongestSubSequence {
    static int maxSeq(int[] a) {
        Set<Integer> st = new HashSet<>(a);
		int longestLen = 0;
        int len = 0;
        for (int num : st) {
            len = 1;
			if (!st.contains(num-1)) {
                while (st.contains(num + len)) {
                    len++;
                }
                longestLen = Math.max(longestLen, len);
            }
        }
        
        return longestLen;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 15, 16, 17, 10, 30 };
        System.out.println(maxSeq(arr));
    }
}