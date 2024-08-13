// Example 57.6: substring()
// String substring(int i, int j) Returns the substring from character with i to j-1 indices.
class SubstringAnyDemo {
    public static void main(String[] args) {
        String text = "DATA STRUCTURE WITH JAVA";
        String data = text.substring(5, 14);
        System.out.print(data);
    }
}
