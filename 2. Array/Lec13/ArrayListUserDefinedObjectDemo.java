// Example 13.3: Creating an ArrayList object with user defined objects

import java.util.ArrayList;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printData() {
        System.out.println(name + " " + age);
    }
}

public class ArrayListUserDefinedObjectDemo {
    public static void main(String[] args) {
        ArrayList<Person> pList = new ArrayList<>(5);
        pList.add(new Person("Ram", 25));
        pList.add(new Person("Sita", 22));
        pList.add(new Person("John", 34));
        pList.add(new Person("Rahim", 29));
        pList.add(new Person("Lilly", 24));

        // No issue to accommodate, list grows dynamically
        pList.forEach(Person::printData);
    }
}
