import java.util.EnumSet;
import java.util.Iterator;

enum Color {
    RED, BLUE, GREEN, BLACK, WHITE, VIOLET, ORANGE, INDIGO
}

public class EnumSetDemo {

    public static void main(String[] args) {
        // Creating sets
        EnumSet<Color> set1, set2, set3, set4, set5, set6;

        // Adding elements
        set1 = EnumSet.of(Color.RED, Color.BLUE, Color.GREEN);
        set2 = EnumSet.complementOf(set1);
        set3 = EnumSet.allOf(Color.class);
        set4 = EnumSet.range(Color.BLACK, Color.VIOLET);
        set5 = EnumSet.copyOf(set2);
        set6 = EnumSet.noneOf(Color.class);

        // Printing sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Set 3: " + set3);
        System.out.println("Set 4: " + set4);
        System.out.println("Set4 contains RED? " + set4.contains(Color.RED));

        // Traversing Set 5 using forEach
        System.out.println("Set 5 elements:");
        set5.forEach(System.out::println);

        // Traversing Set 6 using Iterator
        System.out.println("Set 6 elements:");
        Iterator<Color> iter = set6.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
