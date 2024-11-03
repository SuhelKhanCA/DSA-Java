import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCreateExample1 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Date");
        queue.add("Elderberry");
        System.out.println(queue);

        // remove
        System.out.println("poll() : "+queue.poll()); // pop
        System.out.println("Removing using remove() : " + queue.remove("Banana"));
        // size
        System.out.println(queue.size()); // 4

        // contains
        System.out.println(queue.contains("Cherry")); // true

        // clear
        queue.clear();
    }
}
