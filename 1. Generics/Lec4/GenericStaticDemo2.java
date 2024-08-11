// package Generics.Lec4;

// Example 4.2: A generic method or any method in a class can be declared as a static method

class GenericClass<T> { // Use < > to specify class type

    T obj; // An object of type T is declared

    GenericClass(T obj) { // Constructor of the generic class
        this.obj = obj;
    }

    public static <T> void print(T obj) { // A static method in the class
        System.out.println(obj);
    }
}

public class GenericStaticDemo2 {

    public static void main(String args[]) {
    
        GenericClass<Integer> a = new GenericClass<Integer>(10);
        GenericClass<String> s = new GenericClass<String>("Joy with Java");
        GenericClass<Double> d = new GenericClass<Double>(1.23);
    
        // Printing the data ...
        GenericClass.print(a.obj); // Printing the Integer
        GenericClass.print(s.obj); // Printing the String
        GenericClass.print(d.obj); // Printing the Double
    }
}
