// package LinkedList.Insertion;

// import Intro.JLinkedList;

public class InsertionDemo {
    public static void main(String[] args) {
        JLinkedList<Integer> list = new JLinkedList<>();
        list.insetEnd(56);
        list.printList();
        list.insetFront(5);
        list.printList();
        list.insertKey(98, 5);
        list.printList();
        list.insetFront(1);
        list.printList();
        list.insetEnd(100);
        list.printList();
    }
}
