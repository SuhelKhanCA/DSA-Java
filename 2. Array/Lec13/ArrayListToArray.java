// Example 13.13: Bulk copy of an ArrayList collection to an array

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Contents of al: " + al);

        // Convert ArrayList to array
        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;
        for (int i : ia) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
}
