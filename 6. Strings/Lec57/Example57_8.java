// Example 57.8: indexOf() method
// int indexOf(String s, int i) Returns the index within the string of the first occurrence of the specified string, starting at the specified index.
class StringIndexOfExample {
    public static void main(String[] args) {
        String text = "DATA STRUCTURE WITH JAVA";
        int output = text.indexOf("T", 4);
        System.out.print(output);
    }
}
