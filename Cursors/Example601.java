import java.util.Enumeration;
import java.util.Vector;

class Example601{
    public static void main(String[] args) {
        // create a vector and prints its contents
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }
        System.out.println(v);

        /* Declare am enumerator to the collection v. At the beggining, e is pointing to the index jsut before the first element in v */
        Enumeration<Integer> e = v.elements();

        while (e.hasMoreElements()) { // Enumerate each element one-by-one
            int i = e.nextElement(); // moving the cursor to the next element
            System.out.print(i + " "); // print the current element            
        }
    }
}