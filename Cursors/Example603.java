import java.util.ArrayList;
import java.util.Iterator;

public class Example603 {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("C");
        books.add("C++");
        books.add("Java");
        books.add("php");

        for (String book : books) {
            System.out.println(book);
            // books.add("C#"); // adding element while iterating list : Error - Exception in thread "main" java.util.ConcurrentModificationException
        }

        System.out.println(books);

        Iterator<String> itr = books.iterator();
        while (itr.hasNext()) {
            String b = itr.next();
            System.out.print(b + " ");
            books.add("Python"); // you can't do it
            books.add("C"); // yo can't do it
        }
    }
}
