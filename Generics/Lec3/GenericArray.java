package Generics.Lec3;

// Example 3.5: Defining a generic class to process arrays with any data types

class GenericArray<T> {

    // Declaring an array, which should store any type T of data

    T a[];

    GenericArray(T[] x) { // Define a constructor

        a = x;

    }

    T getData(int i) { // To return the element stored in the i-th place in the array

        return a[i];

    }

    public void printData(T b) {// A generic method to print the elements in array b

        for (int i = 0; i < b.length; i++)

            System.out.print(b.getData(i) + " "); // Print the i-th element in b

        System.out.println(); // Print a new line

    }

    // Generic method to reversed the order of elements in array b

     void reverseArray(T b) {

        int front = 0, rear = b.length - 1;

        T temp;

        while (front < rear) {

            temp = b[rear];

            b[rear] = b[front];

            b[front] = temp;

            front++;
            rear--;

        }

    }

    // main method
    public static void main(String[] args) {
       // code for main method
    }

}
