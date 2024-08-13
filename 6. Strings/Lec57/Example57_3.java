// Example 57.3: compareTo()
// int compareTo(String s) Compares two strings lexicographically.
class StringCompareDemo {
    public static void main(String[] args) {
        String text1 = "DATA STRUCTURE WITH JAVA";
        String text2 = "DATA STRUCTURE WITH C++";
        String text3 = "DATA STRUCTURE WITH JAVA";
        String text4 = "data structure with c++";
        String text5 = "data structure with java";
        int output1 = text1.compareTo(text2);
        int output2 = text1.compareTo(text3);
        int output3 = text1.compareTo(text4);
        int output4 = text1.compareTo(text5);
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
    }
}
