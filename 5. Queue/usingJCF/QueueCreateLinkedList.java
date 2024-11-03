import java.util.LinkedList;
import java.util.Queue;

public class QueueCreateLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 1; i < 10; i++) {
            queue.add(i);
        }

        System.out.println("Queue contains : " + queue);
    }
}
