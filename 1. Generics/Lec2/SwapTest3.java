package Generics.Lec2;

//Example 2.5: Generic method for String swap operation

class SwapTest3<T> {

    public void swap(T x, T y) {

        T temp;

        temp = x;

        x = y;

        y = temp;

    }

    public static void main(String args[]) {
        SwapTest3 tst3 = new SwapTest3<>();

        String x = "99";

        String y = "66";

        System.out.println("x = " + x + "y = " + y);

        tst3.swap(x, y);

        System.out.println("x = " + x + "y = " + y);

    }

}