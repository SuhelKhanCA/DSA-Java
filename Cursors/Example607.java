import java.util.ArrayList;

class Employee {
    private int eid;
    private String name;
    private String designation;
    private double salary;

    public Employee(int eid, String name, String designation, double salary) {
        this.eid = eid;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEid() {
        return this.eid;
    }

    public String getName() {
        return this.name;
    }

    public String getDesignation() {
        return this.designation;
    }

    public double getSalary() {
        return this.salary;
    }
   
    public String toString() {
        return this.eid + "\t" + this.name + "\t" + this.designation + "\t"+ this.salary;
    }
}

public class Example607 {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<Employee>();

        emps.add(new Employee(1, "Suhel", "SDE", 500000));
        emps.add(new Employee(2, "Asjad", "Sr SDE", 600000));
        emps.add(new Employee(3, "Sarim", "Jr SDE", 400000));
        emps.add(new Employee(4, "Khan", "RA", 300000));
        emps.add(new Employee(5, "Priti", "SWE", 500000));

        System.out.println(emps);

        System.out.println("=====Printing using For each loop=====");
        for (Employee employee : emps) {
            System.out.println(employee);
        }
    }
}
