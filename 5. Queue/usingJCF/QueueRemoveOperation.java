import java.util.*;

public class QueueRemoveOperation {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");
        System.out.println("Queue: " + queue);
        System.out.println("Size of queue: " + queue.size());
        System.out.println("Element at front of queue: " + queue.peek());
        System.out.println("Element at front of queue: " + queue.poll());

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println("Queue now : "+ queue);
    }
}
