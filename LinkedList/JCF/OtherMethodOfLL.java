package JCF;

import java.util.LinkedList;

public class OtherMethodOfLL {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("A");
        ls.add("E");
        ls.add("I");
        ls.add("O");
        ls.add("U");
        ls.add("H");
        ls.remove(0);
        ls.add("M");
        ls.add("N");
        ls.add("O");
        ls.add("O");
        System.out.println("Linked-list : " + ls);

        boolean status = ls.contains("N");
        if (status) {
            System.out.println("List contain the letter N...!");
        } else {
            System.out.println("List does not contain the letter N...!");
        }

        // finding the no of elements in the list
        int size = ls.size();
        System.out.println("No of elements in the list is: " + size);
        String elemt = ls.get(2); // get an element from the list
        System.out.println("Foun element is : " + elemt);
        ls.set(2, "The added");
        System.out.println("List is: " + ls);
    }
}
