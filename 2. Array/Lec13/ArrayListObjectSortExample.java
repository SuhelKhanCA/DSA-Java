// Example 13.10: Sorting an ArrayList collection with user-defined objects

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ArrayListObjectSortExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sachin", 47));
        people.add(new Person("Chris", 34));
        people.add(new Person("Rajeev", 25));
        people.add(new Person("David", 31));

        System.out.println("Person List : " + people);

        // Sort People by their Age
        people.sort((person1, person2) -> person1.getAge() - person2.getAge());

        // A more concise way of sorting
        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("Sorted Person List by Age : " + people);

        // Sort by Name using Collections.sort() with a Comparator
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted Person List by Name : " + people);
    }
}
