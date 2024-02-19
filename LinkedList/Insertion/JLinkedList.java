// package LinkedList.Insertion;
/**
 * JLinkedList
 */
public class JLinkedList<T> {
    Node head;
    class Node{
        T data;
        Node next;
        // constructor
        Node(){
            data = null;
            next = null;
        }
        Node(T data){
            this.data = data;
            next = null;
        }
    }
    JLinkedList(){ // HEADER node
        head = new Node();
    }
    /* Methods to manipulate linked-list */

    /*=========INSERTION AT FRONT========= */
    public void insetFront(T data){
        // creating a new node with the given data
        Node newNode  = new Node(data);
        newNode.next = this.head.next;
        // make the new node as the first node
        this.head.next = newNode;
    }

    /* ========= INSERTION AT END============ */
    public void insetEnd(T data){
        // create the node with the given data
        Node newNode = new Node(data);
        newNode.next = null;

        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    /* ======= INSERTION AT ANY POSITION */
    public void insertKey(T data, T key){
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
    /* ===========PRINTING THE LINKED LIST============ */
    public void printList(){
        Node currNode = this.head.next;
        System.out.print("Linked-list:");
        // traverse the linked-list
        while (currNode != null) {
            System.out.print(currNode.data + " "); // print the current node content
            currNode = currNode.next; // go to the next node
        }
        System.out.println();
    }
    /*===========Deletion at front============ */
    public T deleteFront(){
        T x = null;
        Node temp = this.head.next , prev = null; // ==>> prev NOT used
        if (temp != null) {
            x = temp.data;
            this.head.next = temp.next; // changed the head
            // Display the message
            System.out.println("Element deleted");
        }
        return x; // returned the deleted node
    }

    // public void merge(JLinkedList<Integer> list2) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'merge'");
    // }

    // public void merge() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'merge'");
    // }
}