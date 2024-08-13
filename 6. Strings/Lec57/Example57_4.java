// Example 57.4: compareToIgnoreCase()
// int compareToIgnoreCase(String s) Compares two strings lexicographically without case matching.
public class StringCompareCaseDemo {
    public static void main(String[] args) {
        String text1 = "DATA STRUCTURE WITH JAVA";
        String text2 = "DATA STRUCTURE WITH C++";
        String text3 = "DATA STRUCTURE WITH JAVA";
        String text4 = "data structure with c++";
        String text5 = "data structure with java";
        int output1 = text1.compareToIgnoreCase(text2);
        int output2 = text1.compareToIgnoreCase(text3);
        int output3 = text1.compareToIgnoreCase(text4);
        int output4 = text1.compareToIgnoreCase(text5);
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
    }
}
