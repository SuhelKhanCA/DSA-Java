package Generics.Lec2;

//Example 2.3: Generic method for swap operation

class SwapTest1<T> {

    public static <T> void swap(T x, T y) {

        T temp;

        temp = x;

        x = y;

        y = temp;
        System.out.print("After Swapping : ");
        System.out.println("x = " + x + ":  y = " + y);

    }

    public static void main(String args[]) {

        SwapTest1 tst = new SwapTest1<>();

        // For Integers
        int x = 99;
        int y = 66;
        System.out.print("Before Swapping: ");
        System.out.println("x = " + x + ":  y = " + y);
        swap(x, y);

        // For Strings
        String s1 = "Suhel";
        String s2 = "Khan";
        System.out.print("Before Swapping: ");
        System.out.println("x = " + s1 + ":  y = " + s2);
        swap(s1, s2);

    }

}
