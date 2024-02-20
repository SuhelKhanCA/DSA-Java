package Intro;
//Example 18.7: Declaring a method to merge two lists

/* For the sake of completion, use the declaration of JLinkedList<T> here first and then add the method for merging. */

// Example 18.8: Creating a single linked list, insertion, merging and printing (driver class)

// This program shows how to define a (single) linked list
// package LinkedList.Insertion;

// import JLinkedList;
// import JLinkedList.Node;

class JLinkedList<T> {

    Node head; // head of list

    class Node {

        T data;

        Node next;

        // Constructor

        Node() {

            data = null;

            next = null;

        }

        Node(T d) {

            data = d;

            next = null;

        }

    }

    JLinkedList() { // LinkedList Header Node

        head = new Node();

    }

    // Methods to maintain the collection to be defined

    // Declaring a method to insert at FRONT

    public void insertFront(T data) {

        // Create a new node with given data

        Node newNode = new Node(data);

        newNode.next = this.head.next;

        // Make the new node as as the first node

        this.head.next = newNode;

    }

    // Declaring a method to insert at END

    public void insertEnd(T data) {

        Node newNode = new Node(data);

        newNode.next = null;

        Node temp = this.head;

        while (temp.next != null) {

            temp = temp.next;

        }

        temp.next = newNode;

    }

    // Declaring a method to insert at ANY

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

    // Declaring a method to print a list

    public void printList() {

        Node currNode = this.head.next;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList

        while (currNode != null) {

            // Print the data at current node

            System.out.print(currNode.data + " ");

            // Go to next node

            currNode = currNode.next;

        }

        System.out.println();

    }

    // Example 18.7: Declaring a method to merge two lists

    public void merge(JLinkedList<T> l2) {

        Node l1Node = this.head;

        Node l2Node = l2.head;

        while (l1Node.next != null) {

            l1Node = l1Node.next;

        }

        l1Node.next = l2Node.next;

        // free(l2.head); // Return the node to free memory

    }

    

} // End of declaration of JLiknkedList<T>

// Example 18.8: Creating a single linked list, insertion, merging and printing

// The diver class is defined below

class LinkedListMergingDemo {

    public static void main(String[] args) {

        JLinkedList<Integer> list1 = new JLinkedList<Integer>();

        JLinkedList<Integer> list2 = new JLinkedList<Integer>();

        list1.insertFront(1);

        list1.insertFront(2);

        list1.insertEnd(3);

        list1.insertEnd(4);

        list1.printList();

        list2.insertFront(5);

        list2.insertEnd(6);

        list2.printList();

        // Merge the list list1 fter list2 and return the result as list 1

        list1.merge(list2);

        System.out.println("Merged List : ");

        list1.printList();

    }

} // End of the program