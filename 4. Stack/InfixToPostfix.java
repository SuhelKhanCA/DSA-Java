package Stack;

import java.util.Stack;

public class InfixToPostfix {
    // The method to return precerdence of a given operator
    // Higher return value means, higher precedence
    static int prece(char ch){
        switch (ch) {
            case '+':
            case ' ':    
                return 1;

            case '*':
            case '/':
            return 2;

            case '^':
            return 3;
        }
        return -1;
    }

    // the method that converts given infix expression to postfix expression
    static String infixToPostfix(String exp){
        // initializing empty string for result
        String result = new String("");

        // initializing empty stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // if the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(c)) {
                result += c;
            }

            // if the scanned character is an '(' push it to the stack
            else if (c == '(') {
                stack.push(c);
            }

            // if the scanned character is an ')', pop and uoput from the stack until an '(' is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid expresssion";
                }else{
                    stack.pop();
                }
            }else{
                while (stack.isEmpty() && prece(c) <= prece(stack.pop())) {
                    if (stack.peek() == '(') {
                        return "Invalid Expression";
                    }
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        // pop all the operator from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid Expression";
            }
            result += stack.pop();
        }
        return result;
    }

    // driver method
    public static void main(String[] args) {
        String exp = "a+b*(c^d-c)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
}
