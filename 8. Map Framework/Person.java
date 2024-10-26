import java.util.*;

class Person{
    String fistName;
    String lastName;
    int age;

    Person(String firstName, String lastName, int age) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.age = age;
    }

    public int hashCode() {
        return 3 * fistName.hashCode() + 2 * lastName.hashCode() + 14*age.hashCode();
    }

    public static void main(String[] args) {
        Person p = new Person("Suhel", "Pathan", 20);
        System.out.println(p.hashCode());
    }
}