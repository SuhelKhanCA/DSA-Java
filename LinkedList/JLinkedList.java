// This program show how to define a singly linked-list
public class JLinkedList<T> { // EXAMPLE 18.1
    Node head; // head of list

    class Node {
        T data;
        Node next;

        // constructor
        Node() {
            data = null;
            next = null;
        }

        Node(T d) {
            data = d;
            next = null;
        }
    }

    JLinkedList() { // Linked-list HEADER node
        head = new Node();
    }

    // Methods to manipulate linked-list to be defined
    /* Defining the method to insert at the front of list */
    public void insertFront(T data) {
        // create a new node with given data
        Node newNode = new Node(data);
        newNode.next = this.head.next;
        // make the new node as the first node
        this.head.next = newNode;
    }

    /* INSERTION AT END */
    public void insertionEnd(T data) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node temp = this.head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    /* INSERTION AT ANY POSITION */
    public void insertKey(T data, T key) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node temp = this.head;
        boolean status = false;
        while (temp != null) {
            if (temp.data == key) {
                status = true;
                break;
            }
            temp = temp.next;

        }
        if (status) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void merge(JLinkedList<T> l2) {
        Node l1Node = this.head;
        Node l2Node = l2.head;
        while (l1Node.next != null) {
            l1Node = l1Node.next;
        }
        l1Node.next = l2Node.next;
        // No need to free l2.head, Java will take care of it
    }

    /* PRINTING THE LINKED-LIST */
    public void printList() {
        Node curNode = this.head.next;
        System.out.print("LinkedList: ");
        // traverse through linked-list
        while (curNode != null) {
            // print the data at current node
            System.out.print(curNode.data + " ");
            // got to next node
            curNode = curNode.next;
        }
        System.out.println();
    }

}

class LinkedListInsertionDemo {
    public static void main(String[] args) {
        JLinkedList<Integer> list = new JLinkedList<Integer>();
        list.insertionEnd(9);
        list.printList();
        list.insertFront(5);
        list.printList();
        list.insertKey(7, 5);
        list.printList();
    }
}