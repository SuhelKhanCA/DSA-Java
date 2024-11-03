import java.util.*;
import java.util.Queue;

public class ArrayToQueue {
    public static void main(String[] args) {
        String[] city = { "Delhi", "Noida", "Jaipur", "Ghzbd" };

        Queue<String> queue = new LinkedList<>();
        Collections.addAll(queue, city);

        System.out.println(queue);
    }
}
