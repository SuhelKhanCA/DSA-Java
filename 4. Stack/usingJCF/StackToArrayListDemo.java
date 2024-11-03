import java.util.ArrayList;
import java.util.Stack;

public class StackToArrayListDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack: " + stack);
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        System.out.println("Stack: " + stack);
        System.out.println("ArrayList : " + list);
    }
}
