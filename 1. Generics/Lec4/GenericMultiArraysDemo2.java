// package Generics.Lec4;

// Example 4.7: Generic class with method overloading

// Define the user defined Student class
class Student {
    String name; // Name of the students
    int marks[]; // Stores the marks in three subjects

    // Constructor for the class Student
    Student(String s, int m[]) {
        name = s;
        marks = m;
    }

    //Defining a method to print student's record
    void printStudent() {
        System.out.println("Name : " + name);
        System.out.println("Scores : " + marks[0] + " , " + marks[1] + " , " + marks[2]);
    }
} // End of the class Student

// Defining a generic array with two type parameters
class GenericMultiArrays<T, S> {
    // Declaring an array, which should store any type T of data
    T a[]; // Define that the array a[ ] can store one type of data
    S b[]; // Define that the array b[ ] can store another type of data

    GenericMultiArrays(T[] x, S[] y) { // Define a constructor
        a = x;
        b = y;
    }

    T getDataT(int i) {// To return the element stored in i-th place in the array
        return a[i];
    }

    S getDataS(int i) { // To return the element stored in i-th place in the array
        return b[i];
    }

    // Overloaded methods in the generic class
    void printDataT(T[] t) { // A generic method to print the elements in array t
        for (int i = 0; i < t.length; i++)
            System.out.print(t[i] + ", "); // Print the i-th element in t
        System.out.println(); // Print a new line
    }

    void printDataS(S[] s){ //An overloaded generic method to print elements in s
        for(int i = 0; i < s.length; i ++)
            ((Student) s[i]).printStudent(); // Print the i-th student in s
        System.out.println(); // Print a new line
    }

    // Few additional methods
    void reverseArrayT(T[] t) { // Generic method to reverse the order of elements in t
        int front = 0, rear = t.length - 1;
        T temp;
        while (front < rear) {
            temp = t[rear];
            t[rear] = t[front];
            t[front] = temp;
            front++;
            rear--;
        }
    }

    void reverseArrayS(S[] s){//Generic method to reverse the order of elements in s
        int front = 0, rear = s.length-1; 
        S temp;
        while( front < rear) {
            temp = s[rear];
            s[rear] = s[front];
            s[front] = temp;
            front++; 
            rear--;
        }
    }
} // End of the definition of class GenericMultiArrays

// Driver class is programmed below
class GenericMultiArraysDemo2{
    public static void main(String[] args) {
        //Creating an array of String data
        String[] t = {"A", "B", "C"}; // It is an array of String data

        //Creating an array of Students's data
        Student[] s = new Student[3]; // It is an array of Student data
        s[0] = new Student("Ram", new int[]{86, 66, 96});
        s[1] = new Student("Rahim", new int[]{88, 99, 77});
        s[2] = new Student("John", new int[]{75, 85, 95});

        // Store the data into generic arrays
        GenericMultiArrays<String, Student> arrayData = new GenericMultiArrays<String, Student>(t, s);

        // Printing the data ...
        arrayData.printDataT(t); // Printing the array of strings
        //Reverse ordering of data ...
        arrayData.reverseArrayT(t);

        // Printing the data ...
        arrayData.printDataS(s); // Printing the student's data
        //Reverse ordering of data ...
        arrayData.reverseArrayS(s);

        // Printing the data after reverse ordering ...
        arrayData.printDataT(t); // Printing the array of strings
        arrayData.printDataS(s); // Printing the array of students
    }
}

// Interface Implementation

/*
 * package Generics.Lec4;

// Example 4.7: Generic class with method overloading

interface Printable {
    void printStudent();
}

// Define the user defined Student class
class Student implements Printable {
    String name; // Name of the students
    int marks[]; // Stores the marks in three subjects

    // Constructor for the class Student
    Student(String s, int m[]) {
        name = s;
        marks = m;
    }

    //Defining a method to print student's record
    public void printStudent() {
        System.out.println("Name : " + name);
        System.out.println("Scores : " + marks[0] + " , " + marks[1] + " , " + marks[2]);
    }
} // End of the class Student

// Defining a generic array with two type parameters
class GenericMultiArrays<T, S extends Printable> {
    // Declaring an array, which should store any type T of data
    T a[]; // Define that the array a[ ] can store one type of data
    S b[]; // Define that the array b[ ] can store another type of data

    GenericMultiArrays(T[] x, S[] y) { // Define a constructor
        a = x;
        b = y;
    }

    T getDataT(int i) {// To return the element stored in i-th place in the array
        return a[i];
    }

    S getDataS(int i) { // To return the element stored in i-th place in the array
        return b[i];
    }

    // Overloaded methods in the generic class
    void printData(T[] t) { // A generic method to print the elements in array t
        for (int i = 0; i < t.length; i++)
            System.out.print(t[i] + ", "); // Print the i-th element in t
        System.out.println(); // Print a new line
    }

    void printData(S[] s){ //An overloaded generic method to print elements in s
        for(int i = 0; i < s.length; i ++)
            s[i].printStudent(); // Print the i-th student in s
        System.out.println(); // Print a new line
    }

    // Few additional methods
    void reverseArrayT(T[] t) { // Generic method to reverse the order of elements in t
        int front = 0, rear = t.length - 1;
        T temp;
        while (front < rear) {
            temp = t[rear];
            t[rear] = t[front];
            t[front] = temp;
            front++;
            rear--;
        }
    }

    void reverseArrayS(S[] s){//Generic method to reverse the order of elements in s
        int front = 0, rear = s.length-1; 
        S temp;
        while( front < rear) {
            temp = s[rear];
            s[rear] = s[front];
            s[front] = temp;
            front++; 
            rear--;
        }
    }
} // End of the definition of class GenericMultiArrays

// Driver class is programmed below
class GenericMultiArraysDemo2{
    public static void main(String[] args) {
        //Creating an array of String data
        String[] t = {"A", "B", "C"}; // It is an array of String data

        //Creating an array of Students's data
        Student[] s = new Student[3]; // It is an array of Student data
        s[0] = new Student("Ram", new int[]{86, 66, 96});
        s[1] = new Student("Rahim", new int[]{88, 99, 77});
        s[2] = new Student("John", new int[]{75, 85, 95});

        // Store the data into generic arrays
        GenericMultiArrays<String, Student> arrayData = new GenericMultiArrays<String, Student>(t, s);

        // Printing the data ...
        arrayData.printData(t); // Printing the array of strings
        //Reverse ordering of data ...
        arrayData.reverseArrayT(t);

        // Printing the data ...
        arrayData.printData(s); // Printing the student's data
        //Reverse ordering of data ...
        arrayData.reverseArrayS(s);

        // Printing the data after reverse ordering ...
        arrayData.printData(t); // Printing the array of strings
        arrayData.printData(s); // Printing the array of students
    }
}

 */
