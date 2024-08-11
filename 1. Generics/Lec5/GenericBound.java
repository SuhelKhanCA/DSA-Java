// package Generics.Lec5;

// Example 5.2 : Upper bound of argument in generic class definition

class GenericBound<T extends Number> {

     T[] array; // an array of type T

     // Pass the constructor a reference to an array of type T.

     GenericBound(T[] t) {

          array = t;

     }

     double average() { // Return type double in all cases

          double sum = 0.0;

          for (int i = 0; i < array.length; i++)

               sum += array[i].doubleValue(); // Now, it is okay

          return sum / array.length;

     }

}

class GenericBoundDemo {

     public static void main(String args[]) {

          Integer intArray[] = { 1, 2, 3, 4, 5 };

          GenericBound<Integer> intData = new GenericBound<Integer>(intArray);

          double avgInt = intData.average();

          System.out.println("Average is " + avgInt);

          Double doubleArray[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };

          GenericBound<Double> doubleData = new GenericBound<Double>(doubleArray);

          double avgDouble = doubleData.average();

          System.out.println("Average is " + avgDouble);

          String strArray[] = { "1", "2", "3", "4", "5" };

          // GenericBound <String> strData = new GenericBound<String>(strArray); // Bound
          // mismatch

          /*
           * 
           * double avgStr = strData.average(); // ERROR!
           * 
           * System.out.println("Average is " + avgStr);
           */

     }

}
