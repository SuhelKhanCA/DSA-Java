import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

public class HashSetCollectionDemo {

    public static void main(String[] args) {
        // create a List collection
        List<Integer> list =  Arrays.asList(12, 32, 55, 42, 65, 65);

        // create a hashSet
        HashSet<Integer> hs = new HashSet<>(list);

        System.out.println(hs);
    }
}