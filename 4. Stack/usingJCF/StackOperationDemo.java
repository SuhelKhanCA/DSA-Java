import java.util.Stack;

public class StackOperationDemo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Empty Stack : " + stack.isEmpty());
        // System.out.println("Empty stack : pop operation : " + stack.pop()); // EmptyStackException
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push operation : " + stack);

        System.out.println("Pop operation: " + stack.pop());
        System.out.println("Stack after pop operation: " + stack);
        System.out.println("The element at the top: " + stack.peek());
        System.out.println("After peek operation:" + stack);
        System.out.println("Search operation: " + stack.search(10));
        System.out.println("Is Stack empty: " + stack.empty());
    }
}