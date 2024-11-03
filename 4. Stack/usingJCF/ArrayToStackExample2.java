import java.util.Stack;

public class ArrayToStackExample2 {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        Stack<Integer> stack = new Stack<>();
        for (int a : array) {
            stack.push(a);
        }
        System.out.println("The stack : " + stack);
        stack.push(100);
        System.out.println("Is 100 present: " + stack.search(100));
        System.out.println("Is 6 present: " + stack.search(6));
    }
}