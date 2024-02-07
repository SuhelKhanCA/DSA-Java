package Generics.Lec3;

// Example 3.1: Program to handle an array of integers

class SpecificArrayInt {

    // Declaring an array of integer numbers

    int a[];

    // Constructor to load the array

    SpecificArrayInt(int a[]) {

        this.a = a;

    }

    // Method to print the array elements

    void printInt() {

        for (int x : a)

            System.out.print(x + "  ");

    }

    // Method to reverse the array elements

    void reverseInt() {

       int j = a.length -1;

        for (int i = 0; i < j; i++) {

            int temp;

            temp = a[i];

            a[i] = a[j];

            a[j] = temp;

            j--;

        } // End of for-loop

    } // end of method

} // end of class

class MainClassInt {

    // This class use the class SpecificArrayInt to manipulate data in it
    public static void main(String[] args) {

        SpecificArrayInt a = new SpecificArrayInt(new int[]{ 1, 2, 3, 4, 5 });

        a.printInt();
        System.out.println();
        
        a.reverseInt();

        a.printInt();
    }

}
