//Example 2.6: Swap method with Object as parameters
package Generics.Lec2;
class Person {

    String name;

    float marks;

    Person(String name, float marks) {

        this.name = name;
        this.marks = marks;

    }

}

class SwapTest4 {

    public static void swap(Object x, Object y) {

        Object t;

        t = x;

        x = y;

        y = t;

    }

    public static void main(String args[]) {

        Object p1 = new Person("Sumit", 99.9F);

        Object p2 = new Person("Rahul", 66.6F);

        System.out.println("p1 = " + p1 + "y = " + p2);

        swap(p1, p2);

        System.out.println("p1 = " + p1 + "y = " + p2);

    }

}