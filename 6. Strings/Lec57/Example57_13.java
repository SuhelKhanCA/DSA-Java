// Example 57.13: Integer to String
class IntegerToStringDemo {
    public static void main(String[] args) {
        int i = 20;
        String s = String.valueOf(i);
        System.out.println(i + 10);    // 30 because + is binary plus operator
        System.out.println(s + 20);    // 2020 because + is string concatenation operator
    }
}
