import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueToArray {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Date");
        queue.add("Elderberry");

        String fruits[] = queue.toArray(new String[queue.size()]);

        System.out.println(Arrays.toString(fruits));
    }
}
