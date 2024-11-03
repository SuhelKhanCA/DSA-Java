import java.util.*;

public class ArrayListToStack {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Stack<Integer> stack = new Stack<>();
        stack.addAll(list);
        System.out.println(stack);
    }
}
