package Six6MonthsOfCode.Day17;

import java.util.Vector;

public class VectorClone {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        Vector vClone = new Vector<>();

        v.add(1);
        v.add(2);
        v.add("Oracle");
        v.add("Java");
        v.add(4, 3);
        vClone = (Vector)v.clone();
        System.out.println("Cloned vector is : " + vClone);
    }
}
