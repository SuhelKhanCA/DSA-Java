package JCF;

import java.util.LinkedList;

public class DeletionFromLL {
    public static void main(String[] args) {
        // creating a linked list
        LinkedList<String> ls2 = new LinkedList<>();
        ls2.add("A");
        ls2.add("E");
        ls2.add("I");
        ls2.add("O");
        ls2.add("U");

        System.out.println("List of vowels: "+ ls2);
        System.out.println("After adding H:");
        ls2.add("H");
        System.out.println("List : " + ls2);
        ls2.remove("H"); // removing specific element
        System.out.println("After removing H: " + ls2);
        ls2.remove(0); // removing by index
        System.out.println("List: " + ls2);

        // creating another linked list
        LinkedList<String> ls = new LinkedList<>();
        ls.add("M");
        ls.add("N");
        ls2.addAll(ls); // apending at the last of the list ls2
        System.out.println("After adding all: " + ls2);
        ls2.removeFirst(); // removing the fist element
        System.out.println("After removing first :" + ls2);

        // removing from the last
        ls2.removeLast();
        ls2.add("O");
        ls2.add("O");
        System.out.println("List:" + ls2);
        ls2.removeFirstOccurrence("O"); // removing the last occurences
        System.out.println("List:" + ls2);
        System.out.println("After removing last: " + ls2);
        ls2.retainAll(ls); // retaining intersection
        System.out.println("after retaining all:" + ls2);
        ls2.clear(); // deleting all the element at once
        System.out.println("List ls2:" + ls2);
    }
}
