import java.util.*;
public class LongestSubSequence {
    static Integer maxSeq(Integer[] a) {
        Set<Integer> st = new HashSet<>(a);
		Integer longestLen = 0;
        Integer len = 0;
        for (Integer num : st) {
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
        Integer[] arr = { 1, 2, 3, 4, 15, 16, 17, 10, 30 };
        System.out.println(maxSeq(arr));
    }
}