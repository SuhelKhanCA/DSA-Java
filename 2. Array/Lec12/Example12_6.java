// Example 12.6: Reversing a 1D array using a recursive method

public class Example12_6 {

    private Object[] x; // x is a collection of generic type T

    // Constructor
    public Example12_6(Object... values) {
        x = values;
    }

    // A recursive method to reverse the ordering of array x
    public void reverse1D(int length) {
        if (length > 1) { // Termination condition check
            // Swap the end elements
            Object temp = x[x.length - length];
            x[x.length - length] = x[length - 1];
            x[length - 1] = temp;

            reverse1D(length - 1); // Do recursively for the next level
        }
    }

    @Override
    public String toString() {
        return java.util.Arrays.toString(x);
    }

    public static void main(String[] args) {
        Example12_6 intArray = new Example12_6(1, 2, 3, 4, 5, 6);
        intArray.reverse1D(6);  // Reversing the array
        System.out.println(intArray);  // Print the result

        Example12_6 stringArray = new Example12_6("A", "E", "I", "O", "U");
        stringArray.reverse1D(5);  // Reversing the array
        System.out.println(stringArray);  // Print the result
    }
}
