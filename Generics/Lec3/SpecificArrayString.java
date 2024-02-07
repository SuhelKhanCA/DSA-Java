package Generics.Lec3;

// Example 3.3: Program to handle an array of Strings

class SpecificArrayString {

    // Declaring an array of string values

    String c[];

    // Constructor to load the array

   SpecificArrayString(String c[]) {
    
    this.c = c;
    
   }
    // Method to print the array elements

    void printString() {

        for (String x : c)

            System.out.print(x + " ");

    }

    // Method to reverse the array elements

    void reverseString() {
    
   int j = c.length -1;
    
     for (int i=0; i<j; i++){
    
     String temp;
    
     temp = c[i];
    
     c[i] = c[j];
    
     c[j] = temp;
    
        j--;
    
    } // End of for-loop

} // end of method

} // end of class

class MainClassString {

    // This class use the class SpecificArrayInt to manipulate data in it

    public static void main(String[] args) {
        SpecificArrayString c = new SpecificArrayString(new String[] { "A", "B", "C", "D", "E" });

        c.printString();
        System.out.println();
        c.reverseString();

        c.printString();
    }

}
