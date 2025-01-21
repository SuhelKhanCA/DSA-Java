import java.util.ArrayList;
import java.util.Spliterator;

public class Example608 {
    public static void main(String[] args) {
        ArrayList<Double> aList = new ArrayList();

        aList.add(1.0);
        aList.add(2.0);
        aList.add(3.0);
        aList.add(4.0);
        aList.add(5.0);
        
        // use tryAdvance()
        System.out.print("Contents of aList: ");
        
        // creating spliterator
        Spliterator<Double> splitr = aList.spliterator();
        while (splitr.tryAdvance((n) -> System.out.print(n)));

        System.out.println();

        // create new list containing square root
        ArrayList<Double> sqrs = new ArrayList<>();
        // Refresh the cursor
        splitr = aList.spliterator();
        while (splitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
        
        System.out.print("Contents of sqrts : ");
        splitr = sqrs.spliterator();
        splitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
