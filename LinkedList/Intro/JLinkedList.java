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
    /*======================================================================================== */
    // Deletion part from here
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
    /* ==================MERGE====================== */
    // public void merge(JLinkedList<T> l2){
    //     Node l1Node  = this.head;
    //     Node l2Node = l2.head;
    //     while (l1Node.next != null) {
    //         l1Node = l1Node.next;
    //     }
    //     l1Node.next = l2Node.next;
    // }
    // public void merge(JLinkedList<T> l2){
    //     Node l1Node  = this.head;
    //     Node l2Node = l2.head;
    //     if(l1Node == null) {
    //         this.head = l2Node;
    //         return;
    //     }
    //     while (l1Node.next != null) {
    //         l1Node = l1Node.next;
    //     }
    //     l1Node.next = l2Node;
    // }
    /* =================DELETION AT END=========== */
    public T deleteEnd(){
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
    public void deleteKey(T key){
        Node temp = this.head.next, prev = null;
        while (temp != null) {
            if (temp.data == key) {
                prev.next = temp.next;
                // display the message
                System.out.println(key + " element deleted!");
                break;
            }else{
                prev = temp;
                temp = temp.next;
            }
        }
    }

}

class LinkedListInsertionDemo {
    public static void main(String[] args) {
        JLinkedList<Integer> list = new JLinkedList<Integer>();
        // list.insertionEnd(9);
        list.printList();
        list.insertFront(5);
        list.printList();
        list.insertKey(7, 5);
        list.printList();

        //new 
        list.insertFront(1);

        list.insertFront(2);

        list.insertFront(3);

        list.insertFront(4);

        list.insertFront(5);

        list.insertFront(6);

        list.insertFront(7);

        list.insertFront(8);

        // Print the LinkedList

        list.printList();

        list.deleteKey(4);

        list.printList();

        list.deleteFront();

        list.printList();

        list.deleteEnd();

        list.printList();
        //new 
        JLinkedList<Integer> list1 = new JLinkedList<Integer>();
        JLinkedList<Integer> list2 = new JLinkedList<Integer>();
        list1.insertFront(1);
        list1.insertFront(2);
        list1.insertionEnd(3);
        list1.insertionEnd(4);
        System.out.print("First Linked-list: ");
        list1.printList();

        list2.insertFront(5);
        list2.insertionEnd(6);
        System.out.print("Second Linked-list: ");
        list2.printList();
        // // merging the list
        list1.merge(list); //==>> Throwing Error
    }
}