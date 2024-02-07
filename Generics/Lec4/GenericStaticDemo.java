package Generics.Lec4;

// Example 4.1: A generic method in a generic class can be declared as static

class GenericStaticDemo<T> {

    // Defining a static generic method to print any data type

   static <T> void gPrint(T t) {

        System.out.println(t);

    }

    public static void main(String[] args) {
        
        gPrint(101);// Calling generic method with Integer argument

        gPrint("Joy with Java"); // Calling generic method with String argument

        gPrint(3.1412343);// Calling generic method with double argument

    }

}
