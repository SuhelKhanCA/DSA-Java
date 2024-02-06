package Six6MonthsOfCode.Day12;
// Example 14.15: Comparator method for sorting

// This program illustrates the use� of Comparator interface

import java.util.*;

import java.lang.*;

import java.io.*;

// A class to represent a student.

class Student {

    int rollno;

    String name, address;

    // Constructor

    public Student(int rollno, String name, String address) {

        this.rollno = rollno;

        this.name = name;

        this.address = address;

    }

    // Overriding toString() for Student class for printing

    public String toString() {

        return this.rollno + " " + this.name + " " + this.address;

    }

} // End of class Student

class Sortbyroll implements Comparator<Student> {

    // Used for sorting in ascending order of roll number

    public int compare(Student a, Student b) {

        return a.rollno - b.rollno;

    }

}

// Driver class

class Sortingobject {

    public static void main(String[] args) {

        Student[] arr = { new Student(111, "bbbb", "london"),

                new Student(131, "aaaa", "nyc"),

                new Student(121, "cccc", "jaipur") };

        System.out.println("Unsorted");

        for (int i = 0; i < arr.length; i++)

            System.out.println(arr[i]);

        Arrays.sort(arr, 1, 2, new Sortbyroll());

        System.out.println("\nSorted by rollno");

        for (int i = 0; i < arr.length; i++)

            System.out.println(arr[i]);

    }

}
