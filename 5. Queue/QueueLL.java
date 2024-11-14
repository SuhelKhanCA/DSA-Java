import java.util.*;

public class QueueLL<T> {
    LinkedList<T> front, rear;

    public QueueL() {
        front = new LinkedList<T>();
        rear = front;
    }

    // enque
    public void enqueue(T a) {
        this.rear.addLast(a); // ll method
    }

    // deque
    public T dequeue() {
        if (!this.isEmpty()) {
            return this.front.removeFirst(); // ll method
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
            
            LinkedList<T> tmp = this.front;

            while (tmp != null) {
                System.out.println(tmp + " ");
                tmp.pop();
                tmp = this.front;
            }

        }
    }

    // main method
    public static void main(String[] args) {
        QueueLL<String> q = new QueueLL<String>();
        q.enqueue("Apple");
        q.enqueue("Banana");
        q.enqueue("Cherry");
        q.printQueue();
    }
}