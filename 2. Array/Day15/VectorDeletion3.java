package Six6MonthsOfCode.Day15;

import java.util.Iterator;
import java.util.Vector;

public class VectorDeletion3 { // Deletion of common elements from vector
    public static void main(String[] args) {
        Vector vec = new Vector(7);
        Vector vecRetain = new Vector<>(4);

        // adding elements int the first vector
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(7);
        vec.add(8);

        // this elements will be retain
        vecRetain.add(5);
        vecRetain.add(3);
        vecRetain.add(2);
        System.out.println("vector vecRetain: "+ vecRetain);
        System.out.println("Calling retainAll()");
        vec.retainAll(vecRetain);

        // printing elements
        System.out.println("Elements after removal: ");
        System.out.println("Vector now  : " + vec);

        Iterator itr  = vec.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
    }
}
