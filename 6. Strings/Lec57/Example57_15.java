// Example 57.15: String other format conversion
// The following program demonstrates binary, hexadecimal, and octal conversion:
class StringConversions {
    public static void main(String[] args) {
        int num = 19648;
        System.out.println(num + " in binary: " + Integer.toBinaryString(num));
        System.out.println(num + " in octal: " + Integer.toOctalString(num));
        System.out.println(num + " in hexadecimal: " + Integer.toHexString(num));
    }
}
