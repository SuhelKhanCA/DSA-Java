public class QueueA<T> {
    T[] data;
    int front, rear;
    int length;

    QueueA(T[] a) {
        data = a;
        front = 0;
        rear = -1;
        length = a.length;
    }

    // enque or insert method
    void enque(T a) {
        if (rear >= length - 1) {
            System.out.println("Queue is full - overflow");
            return;
        } else {
            // data[++rear] = a;
            rear++;
            data[rear] = a;
        }
    }

    // deque or removing 
    T deque() {
        T x = null;
        if (this.isEmpty()) {
            System.out.println("Queue is empty - underflow");
            return x;
        } else {
            x = data[front];
            front++;
            return x;
        }
    }
    
    // isEmpty()
    boolean isEmpty() {
        return front > rear;
    }

    // printQueue
    void printQueue() {
        if (!this.isEmpty()) {
            for (int i = front; i <= rear; i++) {
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    }

    // main method
    public static void main(String[] args) {
        Integer arr[] = new Integer[3];
        QueueA<Integer> q = new QueueA<Integer>(arr);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        System.out.println(q.front);
        System.out.println(q.rear);
       
        System.out.println("Print Queue");
        q.printQueue();
        q.deque();
        System.out.println();
        System.out.println("Print Queue after deque operation");
        q.printQueue();

        System.out.println("Is Queue empty : " + q.isEmpty());

        System.out.println();

        System.out.println(q.front);
        System.out.println(q.rear);
    }
}
