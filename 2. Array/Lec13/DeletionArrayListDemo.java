// Example 13.6: Deletion from an ArrayList collection

import java.util.ArrayList;
import java.util.function.Predicate;

public class DeletionArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> langs = new ArrayList<>();
        langs.add("C");
        langs.add("C++");
        langs.add("Java");
        langs.add("Python");
        langs.add("R");
        langs.add("Spark");

        System.out.println("Initial List: " + langs);

        // Removing elements from the collection
        langs.remove(5);
        System.out.println("After remove(5): " + langs);

        boolean status = langs.remove("Smalltalk");
        System.out.println("Smalltalk is removed: " + status);

        ArrayList<String> script = new ArrayList<>();
        script.add("SQL");
        script.add("Python");
        script.add("Javascript");

        langs.removeAll(script);
        System.out.println("After script removal: " + langs);

        // Remove all elements that start with "C"
        langs.removeIf(s -> s.startsWith("C"));
        System.out.println("After Removing all elements that start with \"C\": " + langs);

        // Clear all elements
        langs.clear();
        System.out.println("List is empty? " + langs.isEmpty());
    }
}
