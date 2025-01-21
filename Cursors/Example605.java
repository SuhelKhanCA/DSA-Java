import java.util.ArrayList;

public class Example605 {
    public static void main(String[] args) {
        // create an array list for integers
        ArrayList<Integer> vals = new ArrayList<>();
        // add values to the array list
        vals.add(12);
        vals.add(54);
        vals.add(16);
        vals.add(17);
        vals.add(20);

        // use for loop to display the values
        System.out.print("Contents of vals: ");
        for (int v : vals) {
            System.out.print(v + " ");
        }
        System.out.println();

        // Sum
        int sum = 0;
        for (int v : vals) {
            sum += v;
        }
        System.out.println("Sum of values :" + sum);
    }
}