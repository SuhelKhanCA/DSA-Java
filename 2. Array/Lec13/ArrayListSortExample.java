// Example 13.9: Sorting an ArrayList collection

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Preeti");
        names.add("Jay");
        names.add("Soma");

        System.out.println("Names : " + names);

        // Sort an ArrayList using its sort() method with a Comparator
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });

        System.out.println("Sorted Names : " + names);
    }
}
