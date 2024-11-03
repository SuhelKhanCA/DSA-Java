// Example 25.12: Process scheduling application of queue

import java.util.LinkedList;
import java.util.Queue;

// Class definition to define a process.
class Process {
    int index;
    int time;

    Process(int i, int t) {
        time = t;
        index = i;
    }

    void print() {
        System.out.println("Job: " + this.index + " Time: " + this.time);
    }
} // End of the Process class

// A simple Queue implementation.
class QueueL<T> {
    private Queue<T> queue = new LinkedList<>();

    void enque(T item) {
        queue.add(item);
    }

    T deque() {
        return queue.poll();
    }

    boolean isEmpty() {
        return queue.isEmpty();
    }

    // Optional: to see all elements in the queue
    void printQueue() {
        for (T item : queue) {
            System.out.println(item);
        }
    }
} // End of the QueueL class

// Main class which schedules processes according to their priorities.
class QueueApplicationDemo {
    public static void main(String[] args) {
        Process arr1 = new Process(1, 5);
        Process arr2 = new Process(2, 15);
        Process arr3 = new Process(3, 10);
        Process arr4 = new Process(4, 35);
        
        QueueL<Process> fcfs = new QueueL<>();

        fcfs.enque(arr1);
        fcfs.enque(arr2);
        fcfs.enque(arr3);
        fcfs.enque(arr4);

        // Example processing of the queue
        while (!fcfs.isEmpty()) {
            Process done = fcfs.deque();
            done.print();
        }
    }
} // End of the QueueApplicationDemo class
