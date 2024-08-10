//Example 2.6: Swap method with Object as parameters
package Generics.Lec2;

class Person<T> {

    String name;

    float marks;

    Person(String name, float marks) {

        this.name = name;
        this.marks = marks;

    }

    public static void main(String args[]) {

        Object p1 = new Person("Sumit", 99.9F);

        Object p2 = new Person("Rahul", 66.6F);

        System.out.println("p1 = " + p1 + "y = " + p2);

        swap(p1, p2);

        // System.out.println("p1 = " + p1 + "y = " + p2);

    }

    public static <T> void swap(T x, T y) {

        T t;

        t = x;

        x = y;

        y = t;

        System.out.println("p1 = " + x + "p2 = " + y); // it solve prob of referencing

    }

}