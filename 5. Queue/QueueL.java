import jLinkedList.*;
public class QueueL<T> {
    JLinkedList<T> front, rear;

    public QueueL() {
        front = new JLinkedList<T>();
        rear = front;
    }

    // enque
    public void enqueue(T a) {
        this.rear.insertEnd(a); // ll method
    }

    // deque
    public T dequeue() {
        if (!this.isEmpty()) {
            return this.front.deleteFront(); // ll method
        } else {
            System.out.println("Queue underflow");
            return null;
        }
    }

    // isEmpty
    public boolean isEmpty() {
        return this.front.isEmpty();
    }

    // print queue
    void printQueue() {
        if (this.front.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements: ");
            this.front.printList();
        }
    }

    // main method
    public static void main(String[] args) {
        QueueL<String> q = new QueueL<String>();
        q.enqueue("Apple");
        q.enqueue("Banana");
        q.enqueue("Cherry");
        q.printQueue();
    }
}
