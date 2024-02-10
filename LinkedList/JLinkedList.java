// This program show how to define a singly linked-list
class JLinkedList<T>{ // EXAMPLE 18.1
    Node head; // head of list
    class Node{
        T data;
        Node next;
        // constructor
        Node(){
            data = null;
            next = null;
        }
        Node(T d){
            data = d;
            next = null;
        }
    }
    JLinkedList(){ // Linked-list HEADER node
        head = new Node();
    }
    // Methods to manipulate linked-list to be defined
}