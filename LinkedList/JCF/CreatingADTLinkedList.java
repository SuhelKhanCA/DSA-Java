package JCF;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

class Student{
    String name;
    double marks;
    // constructors
    Student(String name, double marks){
        this.name = name;
        this.marks = marks;
    }
    void printData(){ // to print the Student objects
        System.out.print("Name: " + this.name);
        System.out.println(" Marks: " + this.marks);
    }
}
public class CreatingADTLinkedList {
    public static void main(String[] args) {
        // create an array of objects
        Student[] sArray = new Student[5]; // to store 5 student objects

        // create the array sArray
        sArray[0] = new Student("Ram", 85.2);
        sArray[1] = new Student("Faraz", 99.36);
        sArray[2] = new Student("Ramu", 85.2);
        sArray[3] = new Student("Faheel", 81.36);
        sArray[4] = new Student("Ram", 95.2);
        
        // creating a linked-list with the sArray collection
        LinkedList<Student> ls = new LinkedList<Student>(Arrays.asList(sArray));

        Student temp;
        // printing the list using an iterator
        Iterator<Student> itr = ls.iterator();
        while (itr.hasNext()) {
            temp = itr.next();
            temp.printData(); // print the current record
        }
    }
}
