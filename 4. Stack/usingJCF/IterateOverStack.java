import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;
public class IterateOverStack {
    public static void main(String[] args) {
        // iterating over stack
        Stack<String> stack = new Stack<>();
        stack.push("Plate 1");
        stack.push("Plate 2");
        stack.push("Plate 3");
        stack.push("Plate 4");

        System.out.println("==== Iterating using forEach method ====");
        stack.forEach(System.out::println); // new for me

        System.out.println("==== Iterating using lambda expression ====");
        stack.forEach(plate -> {
            System.out.println(plate);
        });

        System.out.println("==== Iterating using iterator() ====");
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=== Iterating using ListIterator ==== ");
        // it allows us to traverse backward also
        ListIterator<String> listIterator = stack.listIterator(stack.size()); // passing size as arg
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
