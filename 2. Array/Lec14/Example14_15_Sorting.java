import java.util.Arrays;
import java.util.Comparator;

class Student {
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Overriding toString() for Student class
    @Override
    public String toString() {
        return rollno + " " + name + " " + address;
    }
}

class SortByRoll implements Comparator<Student> {
    // Used for sorting in ascending order of roll number
    @Override
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

public class Example14_15_Sorting {
    public static void main(String[] args) {
        Student[] arr = {
            new Student(111, "bbbb", "London"),
            new Student(131, "aaaa", "NYC"),
            new Student(121, "cccc", "Jaipur")
        };

        System.out.println("Unsorted:");
        for (Student student : arr) {
            System.out.println(student);
        }

        Arrays.sort(arr, 1, 2, new SortByRoll());

        System.out.println("\nSorted by rollno:");
        for (Student student : arr) {
            System.out.println(student);
        }
    }
}
