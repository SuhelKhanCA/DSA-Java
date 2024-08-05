package JCF;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListInsertionDemo {
    public static void main(String[] args) {
        LinkedList<String> ls1 = new LinkedList<String>(); // creating a linked-list of string data
        // adding elements
        ls1.add("AAA");
        ls1.add("BBB");
        ls1.addLast("CCC");
        ls1.addFirst("EEE");
        ls1.add(2, "Suhel");

        // printing the linkedLIst using an iterator object
        System.out.print("Printing using iterator obj: ");
        Iterator<String> itr = ls1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()  + " ");
        } 
        System.out.println();
        // simple printing
        System.out.println("Simple printing ====>>>" + ls1);
    }
}
