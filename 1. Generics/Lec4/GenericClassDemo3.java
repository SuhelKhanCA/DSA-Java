package Generics.Lec4;

// Example 4.3: A generic class should be declared with class type only; not with primitive data types

class GenericClass<T> {// Use < > to specify class type

    T obj; // An object of type T is declared

    GenericClass(T obj) {// Constructor of the generic class

        this.obj = obj;
        System.out.println(obj);
    }

}

class GenericClassDemo3 {

    public static void main(String args[]) {
    
    GenericClass<Integer> a = new GenericClass<Integer>(123); // Okay
    
    // GenericClass<int> a = new GenericClass<int>(234); // ERROR!
    
    GenericClass<String> s = new GenericClass<String>("Joy with Java"); // Okay
    
    // GenericClass<double> d = new GenericClass<double>(9.87); // ERROR!
    
     GenericClass<Double> d = new GenericClass<Double>(1.23); // Okay
    }

}
