package Generics.Lec2;

class DemoClass<T> {

    // Defining a generic method to print any data type
    void genericPrint(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        DemoClass aObj = new DemoClass();

        aObj.genericPrint(Integer.valueOf(101)); // Using Integer wrapper
        aObj.genericPrint("Joy with Java");
        aObj.genericPrint(Double.valueOf(3.1412343)); // Using Double wrapper
    }
}
