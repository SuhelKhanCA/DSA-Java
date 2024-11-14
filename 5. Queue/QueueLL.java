import java.util.LinkedList;

public class QueueLL<T> {
    LinkedList<T> list;

    public QueueLL() {
        list = new LinkedList<>();
    }

    // Enqueue
    public void enqueue(T a) {
        list.addLast(a); // LinkedList method to add at the end
    }

    // Dequeue
    public T dequeue() {
        if (!this.isEmpty()) {
            return list.removeFirst(); // LinkedList method to remove from the front
        } else {
            System.out.println("Queue underflow");
            return null;
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Print queue
    void printQueue() {
        if (list.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");
            for (T element : list) {
                System.out.println(element + " ");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        QueueLL<String> q = new QueueLL<>();
        q.enqueue("Apple");
        q.enqueue("Banana");
        q.enqueue("Cherry");
        q.printQueue();
    }
}
