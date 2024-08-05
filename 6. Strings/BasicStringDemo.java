//Example 56.1: Demonstration of String objects

import java.lang; // It is not necessary as it is by default imported in all programs.

class BasicStringDemo {

    public static void main(String args[]) {

        String strOb1 = "First String";

        String strOb2 = "Second String";

        String strOb3 = strOb1 + " and " + strOb2;

        System.out.println(strOb1);

        System.out.println(strOb2);

        System.out.println(strOb3);

        String myString = "Joy with Java";

        System.out.println(myString);

        System.out.println("Welcome");

        System.out.println("Welcome" + " " + myString);

        String aString = "An example of string is " + myString;
        System.out.println(aString);
    }

}