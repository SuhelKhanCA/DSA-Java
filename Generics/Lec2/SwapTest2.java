package Generics.Lec2;

// Example 2.4: Generic method for Double swap operation

class SwapTest2<T> {

    public void swap(T x, T y) {

        T temp;

        temp = x;

        x = y;

        y = temp;

    }

    public static void main(String args[]) {
        SwapTest2 tst2 = new SwapTest2<>();

        Double x = new Double(99.0);

        Double y = new Double(66.0);

        System.out.println("x = " + x + "y = " + y);

        tst2.swap(x, y);

        System.out.println("x = " + x + "y = " + y);

    }

}
