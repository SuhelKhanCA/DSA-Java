package Generics.Lec4;
// Example 4.4: A generic class with multiple type parameters

class GenericClass<T, V> {// Use < > to specify class type

    T obj1;// An object of type T is declared

    V obj2;// An object of type V is declared

    // Constructor of the generic class

    GenericClass(T obj1, V obj2) {

        this.obj1 = obj1;

        this.obj2 = obj2;

    }

}
