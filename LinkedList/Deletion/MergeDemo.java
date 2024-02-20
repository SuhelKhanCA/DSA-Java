
public class MergeDemo<T> {
    public static void main(String[] args) {
        JLinkedList<Integer> list1 = new JLinkedList<Integer>();
        JLinkedList<Integer> list2 = new JLinkedList<Integer>();
        list1.insertFront(1);
        list1.insertFront(2);
        list1.insertEnd(3);
        list1.insertEnd(4);
        System.out.print("First Linked-list: ");
        list1.printList();

        list2.insertFront(5);
        list2.insertEnd(6);
        System.out.print("Second Linked-list: ");
        list2.printList();
        // merging the list
        list1.merge(list2); //==>> Throwing Error
    }
}
