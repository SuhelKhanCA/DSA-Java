package LinkedList.Insertion;
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

}