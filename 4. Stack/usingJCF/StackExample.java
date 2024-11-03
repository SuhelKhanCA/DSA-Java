import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack<>();
        stackOfCards.push("Ace");
        stackOfCards.push("Clubs");
        stackOfCards.push("THearts");
        stackOfCards.push("Diamonds");
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");

        System.out.println("Stack => " + stackOfCards);
        System.out.println();

        String cardAtTop = stackOfCards.pop();
        System.out.println("Card at top of stack : pop() " + cardAtTop);
        System.out.println(stackOfCards);
        System.out.println();
        
        cardAtTop = stackOfCards.peek();
        System.out.println("Card at top of stack : peek() " + cardAtTop);
        System.out.println();
        System.out.println(stackOfCards);

        System.out.println("Checking stack empty: " + stackOfCards.empty());

        System.out.println("Size of stack : " + stackOfCards.size());

        int position = stackOfCards.search("Queen");

        if (position != -1) {
            System.out.println("Card \"Queen\" found at : " + position);
        } else {
            System.out.println("Card \"Queen\" not found");
        }
    }
}
