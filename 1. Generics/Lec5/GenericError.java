package Generics.Lec5;
// Example 5.1: Why bounding of types in generic class definition?

class GenericError<T> {

     T[] array; // An array of type T

     // Pass the constructor a reference to an array of type T.

     GenericError(T[] t) {

          array = t;

     }

     double average() { // Return type double in all cases

          double sum = 0.0;

          for (int i = 0; i < array.length; i++)

               sum += array[i].doubleValue(); // Here is compiler error!

          return sum / array.length;

     }

}
