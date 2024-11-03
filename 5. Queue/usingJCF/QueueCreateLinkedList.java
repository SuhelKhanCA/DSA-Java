import java.util.LinkedList;
import java.util.Queue;

public class QueueCreateLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 1; i < 10; i++) {
            queue.add(i);
        }

        System.out.println("Queue contains : " + queue);
        
        int x = queue.remove(); // remove the head
        System.out.println("The deleted element is: " + x);

        System.out.println("\nNow queue contains: " + queue);
        
        int head = queue.peek(); // remove the head
        System.out.println("Head of the quueue is: " + head);

        System.out.println("Size of queue : " + queue.size());
    }
}
