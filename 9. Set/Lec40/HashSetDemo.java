import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        // create a hashset
        HashSet<String> hs = new HashSet<>();
        // Set<String> hs = new HAshSet<>(); // this is also fine

        // add elements to the set
        hs.add("Sarim");
        hs.add("Shibli");
        hs.add("Khushnood");
        hs.add("Suhel");
        System.out.println(hs);
    }
}