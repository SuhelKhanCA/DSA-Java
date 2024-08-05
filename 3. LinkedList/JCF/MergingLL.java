package JCF;

import java.util.LinkedList;

public class MergingLL {
    public static void main(String[] args) {
         LinkedList<String> ls1 = new LinkedList<String>(); // creating a linked-list of string data
        // adding elements
        ls1.add("AAA");
        ls1.add("BBB");
        ls1.addLast("CCC");
        ls1.addFirst("EEE");
        ls1.add(2, "Suhel");

        // another LL
        // creating an empty linked-list of class LinkedList
        LinkedList<String> l1 = new LinkedList<String>();
        // adding elements in it
        l1.add("Mumbai");
        l1.add("Chennai");
        l1.add("Kolkata");
        l1.add("Delhi");
        l1.add("Banglore");
        l1.add("Guahti");
        l1.add("Hydrabad");

        // merging these LL
        ls1.addAll(l1);
        System.out.println("Merged LL: " + ls1);

        // creating another linked-list

        LinkedList<String> l2 = new LinkedList<String>();
        l2.add("XX");
        l2.add("YY");
        l2.add("ZZZ");
        // merging at specified index
        l1.addAll(2, l2);
        System.out.println("New merged LL : " + l1);
    }
}
