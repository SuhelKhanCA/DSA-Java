// Example 22.13: An application of stack to convert infix arithmetic expression to its postfix notation. This example considers the linked list implementation of stack.

class InfixToPostfixDemo {

    /*
     * The following program defines a function to return precedence of a given
     * operator. Higher returned value means higher precedence.
     */

    static int precedence(char ch) {

        switch (ch) {

            case '+':

            case '-':

                return 1;

            case '*':

            case '/':

                return 2;
            case '^':

                return 3;

        }

        return -1;

    }

    /*
     * The method that converts given an infix expression to its postfix equivalent
     * expression.� This method considers an expression in the form of a String
     * object.
     */
static String infixToPostfix(String exp) {

 // initializing empty String for result

 String result = new String("");



 /* Create a stack which is initially empty. We assume the linked lust implementation

of stack, defined in Lecture #18-19. */

 

 StackL<Character> stack = new StackL<>();

 for (int i = 0; i<exp.length(); ++i) {

 char c = exp.charAt(i);

 // If the scanned character is an operand, add it to output.

 if (Character.isLetterOrDigit(c)) // The method is defined in java.util.*

 result += c; // Append it to the output expression

// If the scanned character is an '(', push it to the stack.

 else if (c == '(' )

 stack.push(c);

/*� If the scanned character is an ')', pop and output from the stack� until

an '(' is encountered. */

else if (c == ')'){

 while (!stack.isEmpty() && stack.peek() != '(')

result += stack.pop();

if (!stack.isEmpty() && stack.peek() != '(')

return "Invalid Expression"; // invalid expression����������������

 else

stack.pop();

}

else // an operator is encountered 
{

 while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())){

if(stack.peek() == '(')

return "Invalid expression: Quit";

result += stack.pop();

}

 stack.push(c);

 }

 } // End of for loop, when the entire input expression is fully scanned

    // pop all the operators from the stack

    while(!stack.isEmpty())

    {

        if (stack.peek() == '(')

            return "Invalid expression";

        result += stack.pop();

    }

    return result;

 } // End of the� method

    // The main method to show a demo of conversion

 public static void main(String[] args) {

 String exp = "a+b*(c^d-e)^(f+g*h)-i";

 System.out.println(infixToPostfix(exp));

 }

} // End of the program