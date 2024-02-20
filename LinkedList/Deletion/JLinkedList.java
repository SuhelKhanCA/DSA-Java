// package Deletion;

import Intro.JLinkedList;

public class JLinkedList<T> {
    Node head;

    class Node {
        T data;
        Node next;

        // constructor
        Node() {
            data = null;
            next = null;
        }

        Node(T data) {
            this.data = data;
            next = null;
        }
    }

    JLinkedList() { // HEADER node
        head = new Node();
    }
    /* Methods to manipulate linked-list */

    /* =========INSERTION AT FRONT========= */
    public void insetFront(T data) {
        // creating a new node with the given data
        Node newNode = new Node(data);
        newNode.next = this.head.next;
        // make the new node as the first node
        this.head.next = newNode;
    }

    /* ========= INSERTION AT END============ */
    public void insetEnd(T data) {
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

    /* ===========PRINTING THE LINKED LIST============ */
    public void printList() {
        Node currNode = this.head.next;
        System.out.print("Linked-list:");
        // traverse the linked-list
        while (currNode != null) {
            System.out.print(currNode.data + " "); // print the current node content
            currNode = currNode.next; // go to the next node
        }
        System.out.println();
    }

    /*
     * =============================================================================
     * ===========
     */
    // Deletion part from here
    /* ===========Deletion at front============ */
    public T deleteFront() {
        T x = null;
        Node temp = this.head.next, prev = null; // ==>> prev NOT used
        if (temp != null) {
            x = temp.data;
            this.head.next = temp.next; // changed the head
            // Display the message
            System.out.println("Element deleted");
        }
        return x; // returned the deleted node
    }

    /* ==================MERGE====================== */
    // public void merge(JLinkedList<T> l2){
    // Node l1Node = this.head;
    // Node l2Node = l2.head;
    // while (l1Node.next != null) {
    // l1Node = l1Node.next;
    // }
    // l1Node.next = l2Node.next;
    // }
    public void merge(JLinkedList<T> l2) {
        Node l1Node = this.head;
        Node l2Node = l2.head;
        if (l1Node == null) {
            this.head = l2Node;
            return;
        }
        while (l1Node.next != null) {
            l1Node = l1Node.next;
        }
        l1Node.next = l2Node;
    }

    /* =================DELETION AT END=========== */
    public T deleteEnd() {
        T x = null;
        Node temp = this.head.next, prev = null;
        if (temp != null) {
            while (temp != null) { // Move to the end
                prev = temp;
                temp = temp.next;
            }
            x = temp.data;
            prev.next = null;
        }
        return x;
    }

    /* ==============DELETE FROM ANY POSITION========== */
    public void deleteKey(T key) {
        Node temp = this.head.next, prev = null;
        while (temp != null) {
            if (temp.data == key) {
                prev.next = temp.next;
                // display the message
                System.out.println(key + " element deleted!");
                break;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
    }
}

class DeletionDemo2 {
    public static void main(String[] args) {
        JLinkedList<Integer> list = new JLinkedList<Integer>();

        list.insetFront(1);

        list.insetFront(2);

        list.insetFront(3);

        list.insetFront(4);

        list.insetFront(5);

        list.insetFront(6);

        list.insetFront(7);

        list.insetFront(8);

        // Print the LinkedList

        list.printList();

        // list.deleteKey(4);

        list.printList();

        list.deleteFront();

        list.printList();

        // list.deleteEnd();

        list.printList();
    }
}
