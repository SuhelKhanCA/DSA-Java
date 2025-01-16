import java.util.ArrayList;
import java.util.Iterator;

public class Example604 {
    public static void main(String[] args) {
        // create an array list
        ArrayList<String> al = new ArrayList<>();
        // add elements to the array list
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");

        // use iterator to display contents of arraylist
        Iterator<String> itr = al.iterator();

        while (itr.hasNext()) {
            String apl = itr.next();
            System.out.print(apl + " ");
        }
        System.out.println();

        // To modify while iterated use ListIterator
    }
}
