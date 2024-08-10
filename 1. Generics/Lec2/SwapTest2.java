package Generics.Lec2;

// Example 2.4: Generic method for Double swap operation

class SwapTest2<T> {

    public static <T> void swap(T x, T y) {

        T temp;

        temp = x;

        x = y;

        y = temp;

    }

    public static void main(String args[]) {
        SwapTest2 tst2 = new SwapTest2<>();

        double x = 99.0;

        double y = 66.0;

        System.out.println("x = " + x + "y = " + y);

        swap(x, y);

        System.out.println("x = " + x + "y = " + y);

    }

}
