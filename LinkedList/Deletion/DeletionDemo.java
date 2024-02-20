// package Deletion;

public class DeletionDemo {
    public static void main(String[] args) {
        JLinkedList<Integer> list = new JLinkedList<Integer>();
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
        
        // deleting the first element
        // list.deleteFront();
        // int delElement = list.deleteFront();
        // System.out.println("Deleted element: " + delElement);
        System.out.print("List after deletion:");
        list.printList();
    }
}
