import java.util.Stack;
public class ArrayToStackExample1 {
    public static void main(String[] args) {
        String[] expArray = { "a", "+", "b", "*", "c", "-", "5" };
        Stack<String> stack = new Stack<String>();
        // loading the stack 
        for (String s : expArray) {
            stack.push(s);
        }
        System.out.println(stack);
    }
}
