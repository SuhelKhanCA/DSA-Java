package Generics.Lec4;
// Example 4.8: A generic class definition with compile-time error

class GenericError<T> {

    T[] array; // an array of type T

    // Pass the constructor a reference to an array of type T.

    GenericError(T[] t) {

        array = t;

    }

    double average() { // Return type double in all cases

        double sum = 0.0;

        for (int i = 0; i < array.length; i++)

            sum += array[i].doubleValue(); // Here is a compiler error!

        return sum / array.length;

    }

}
