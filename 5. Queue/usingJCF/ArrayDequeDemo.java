import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.push("A");
        adq.push("B");
        adq.push("C");
        System.out.println(adq);
        System.out.println("Popping the stack: ");

        while (adq.peek() != null) {
            System.out.println(adq.pop());
        }
        System.out.println();
    }
}
