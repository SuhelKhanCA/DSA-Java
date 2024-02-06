package Six6MonthsOfCode.Day17;

import java.util.Vector;

public class VectorHashCode {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        
        v.add(1);
        v.add(2);
        v.add("Oracle");
        v.add("Java");
        v.add(4, 3);

        // hashCode representation of vectors
        System.out.println("HasCode: " + v.hashCode());
    }
}
