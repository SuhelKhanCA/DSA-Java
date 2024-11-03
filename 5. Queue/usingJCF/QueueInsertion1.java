import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class QueueInsertion1 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(20);
        System.out.println(queue.add(1));   
        System.out.println(queue.add(2));   
        System.out.println(queue.add(3));
        System.out.println(queue);   
        System.out.println(queue.add(4));
        System.out.println(queue);
        
        for (int i = 80; i < 90; i++) {
            queue.add(i);
        }

        System.out.println(queue);
    }
}