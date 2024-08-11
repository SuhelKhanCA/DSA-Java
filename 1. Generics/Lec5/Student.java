// package Generics.Lec5;

// Example 5.4: Generic class with wildcard argument

class Student<T extends Number> {

    String name;

    T[] marks; // To store the marks obtained by a student

    // The usual constructor for the generic class Student

    Student(T[] m) {

        marks = m;

    }

    // This method to calculate the total of marks obtained by a student

    double total() {

        double sum = 0.0;
 
        for (int i = 0; i < marks.length; i++)

            sum += marks[i].doubleValue();

        return (sum);

    }

    // This method compares the marks obtained by this

    // student with another student

    boolean compareMarks(Student<?> others) {

        if (total() == others.total())

            return true;

        return false;

    }

} // End of the generic class definition
