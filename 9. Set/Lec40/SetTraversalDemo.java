import java.util.HashSet; 
import java.util.Set; 
import java.util.Iterator;
class SetTraversalDemo{
    public static void main(String[] args){
        Set<String> pLangs = new HashSet<>();
        pLangs.add("C");
        pLangs.add("Java");
        pLangs.add("C++");
        pLangs.add("Python");
        pLangs.add("PHp");
        pLangs.add("JavaScript");

        // Using for each loop
        System.out.println("=========Printing using for each loop=========");
        for(String lang : pLangs){
            System.out.println(lang);
        }
        
        // using while looop and iterator()
        System.out.println("==========Printing using iterator and while loop=======");
        Iterator<String> itr = pLangs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // using for loop a
    }
}