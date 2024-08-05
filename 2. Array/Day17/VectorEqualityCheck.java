package Six6MonthsOfCode.Day17;

import java.util.Vector;

public class VectorEqualityCheck { // checking the equality of vectors using equals() method
    public static void main(String[] args) {
        Vector v1 = new Vector<>();
        Vector v2 = new Vector<>();

        v1.add(1);
        v1.add(2);
        v1.add("Oracle");
        v1.add("Java");
        v1.add(4);

        v2.add(1);
        v2.add(2);
        v2.add("Java");
        v2.add("Oracle");
        v2.add(4);

        if (v1.equals(v2)) {
            System.out.println("Both vectors are equal.");
        } else {
            System.out.println("Both vectors are not equal.");
        }

    }
}
