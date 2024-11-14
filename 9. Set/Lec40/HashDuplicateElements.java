import java.util.*;
public class HashDuplicateElements {

    public static void main(String[] args) {
        // creating a hashset
        HashSet<String> hs = new HashSet<>();
        // Adding duplicate elements
        hs.add("Sarim");
        hs.add("Khushnood");
        hs.add("Asjad");
        hs.add("Shibli");
        hs.add("Shibli");
        hs.add("Suhel");
        hs.add("Suhel");
        System.out.println(hs);
    }
}