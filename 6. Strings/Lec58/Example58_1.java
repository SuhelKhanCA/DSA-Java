import java.lang.*; // This import is unnecessary

class StringBufferDemo {

    public static void main(String args[]) {
        StringBuffer strOb1 = new StringBuffer("First String"); // Correction needed
        StringBuffer strOb2 = new StringBuffer("Second String"); // Correction needed
        StringBuffer strOb3 = new StringBuffer(strOb1.toString() + " and " + strOb2.toString()); // Correction needed
        
        System.out.println(strOb1);
        System.out.println(strOb2);
        System.out.println(strOb3);
        
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(strOb3);
        StringBuffer aString = new StringBuffer("An example of string is " + sb2); // Correction needed
    }
}
