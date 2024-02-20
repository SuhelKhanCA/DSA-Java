// package LinkedList.Insertion;

public class InsertionDemo {
    public static void main(String[] args) {
        JLinkedList<Integer> list = new JLinkedList<>();
        list.insertEnd(56);
        list.printList();
        list.insertFront(5);
        list.printList();
        list.insertKey(98, 5);
        list.printList();
        list.insertFront(1);
        list.printList();
        list.insertEnd(100);
        list.printList();
    }
}
