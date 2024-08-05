package Six6MonthsOfCode.Day8;

import java.util.ArrayList;

public class ArrayListToArray { // copying an arraylist to an array
    public static void main(String[] args) {
        // create an array-list
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        //add elements to the above array list 
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println("Contents of a1 : " + a1);

        // Get an array
        Integer arr[] = new Integer[a1.size()];
        arr = a1.toArray(arr);

        int sum = 0;
        // sum the array
        for (Integer integer : arr) {
            sum = sum + integer;
        }
        System.out.println("The sum is : "  + sum);
    }
}
