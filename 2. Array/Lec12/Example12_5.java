// Example 12.5: Printing and duplicating a 1D array

public class Example12_5 {

    // Defining a static method to print an array of integer type
    public static void print(int[] a) {
        System.out.printf("{%d", a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.printf(", %d", a[i]);
        }
        System.out.println("}");
    }

    // The following is an overloaded method to print data of any type
    public static void print(Object[] a) {
        System.out.printf("{%s", a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.printf(", %s", a[i]);
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] a = {22, 44, 66, 88};  // Create an array of integers
        print(a);

        int[] b = a.clone();  // Duplicate a[] in b[]
        print(b);

        String[] c = {"AB", "CD", "EF"};  // Create an array of strings
        print(c);

        String[] d = c.clone();  // Duplicate c[] in d[]
        print(d);

        c[1] = "XYZ";  // Change c[], but not d[]
        print(c);
        print(d);
    }
}
