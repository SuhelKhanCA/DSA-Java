package JCF;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseTraverseLL {
    public static void main(String[] args) {
        LinkedList<String> ls1 = new LinkedList<>();
        ls1.add("Australia");
        ls1.add("India");
        ls1.add("South Africa");
        ls1.add("Zimbabwe");

        Iterator<String> itr1 = ls1.descendingIterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + "->");
        }
        System.out.println("END");

        LinkedList<Integer> ls2 = new LinkedList<>();
        ls2.add(5);
        ls2.add(6);
        ls2.addFirst(0);
        ls2.addLast(10);

        Iterator<Integer> itr2 = ls2.descendingIterator();
        while (itr2.hasNext()) {
            System.out.print(itr2.next() + "-> ");
        }
        System.out.println("END");
    }
}
