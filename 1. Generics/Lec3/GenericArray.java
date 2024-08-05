package Generics.Lec3;

// Example 3.5: Defining a generic class to process arrays with any data types

class GenericArray<T> {

    // Declaring an array, which should store any type T of data
    T[] a;

    GenericArray(T[] x) { // Define a constructor
        a = x;
    }

    T getData(int i) { // To return the element stored in the i-th place in the array
        return a[i];
    }

    public void printData() { // A method to print the elements in array a
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " "); // Print the i-th element in a
        System.out.println(); // Print a new line
    }

    // Method to reverse the order of elements in array a
    void reverseArray() {
        int front = 0, rear = a.length - 1;
        T temp;
        while (front < rear) {
            temp = a[rear];
            a[rear] = a[front];
            a[front] = temp;
            front++;
            rear--;
        }
    }

    // main method
    public static void main(String[] args) {
        // Create a GenericArray for Integers
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> gaInt = new GenericArray<>(intArray);
    
        // Print the original array
        System.out.println("Original array:");
        gaInt.printData();
    
        // Reverse the array
        gaInt.reverseArray();
    
        // Print the reversed array
        System.out.println("Reversed array:");
        gaInt.printData();
    
        // Create a GenericArray for Strings
        String[] strArray = {"Java", "Python", "C++", "JavaScript", "Go"};
        GenericArray<String> gaStr = new GenericArray<>(strArray);
    
        // Print the original array
        System.out.println("Original array:");
        gaStr.printData();
    
        // Reverse the array
        gaStr.reverseArray();
    
        // Print the reversed array
        System.out.println("Reversed array:");
        gaStr.printData();
    }
    
}
