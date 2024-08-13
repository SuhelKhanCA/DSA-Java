// Example 57.2: equalsIgnoreCase()
// Boolean equalsIgnoreCase(String s) Compares string to another string, ignoring case considerations.
public class StringEqualsCaseDemo {
    public static void main(String[] args) {
        String text1 = "DATA STRUCTURE WITH JAVA";
        String text2 = "DATA STRUCTURE WITH C++";
        String text3 = "DATA STRUCTURE WITH JAVA";
        String text4 = "data structure with c++";
        String text5 = "data structure with java";
        boolean output1 = text1.equalsIgnoreCase(text2);
        boolean output2 = text1.equalsIgnoreCase(text3);
        boolean output3 = text1.equalsIgnoreCase(text4);
        boolean output4 = text1.equalsIgnoreCase(text5);
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
    }
}
