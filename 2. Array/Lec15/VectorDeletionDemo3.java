import java.util.*;

class VectorDeletionDemo3 {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>(7);
        Vector<Integer> vecRetain = new Vector<>(4);

        // use add() method to add elements in the vector
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(7);

        // This elements will be retained
        vecRetain.add(5);
        vecRetain.add(3);
        vecRetain.add(2);

        System.out.println("Calling retainAll()");
        vec.retainAll(vecRetain);

        // Let us print all the elements available in vector
        System.out.println("Numbers after removal :- ");

        Iterator<Integer> itr = vec.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
