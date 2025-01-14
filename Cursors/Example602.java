import java.util.ArrayList;
import java.util.Iterator;

public class Example602 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        System.out.println(al);

        // The cursor at the beggining of the first element
        Iterator<Integer> itr = al.iterator();

        while (itr.hasNext()) { // Iterate over each element in 'al'
            int i = itr.next(); // Read the current element
            System.out.print(i + " ");

            if (i % 2 == 0) {
                itr.remove(); // remove the odd numbers
            }
        }
        System.out.println();
        System.out.println(al);
    }
}
