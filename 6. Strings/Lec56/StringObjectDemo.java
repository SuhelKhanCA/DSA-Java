// Example 56.3: Creating string objects
class StringDemo {
    public static void main(String args[]) {
        String s1 = "NPTEL";
        System.out.println("Length: " + s1.length());
        System.out.println(s1);

        String s2 = new String("NPTEL");
        System.out.println(s2 + " is of length: " + s2.length());

        String s3 = new String(s1 + s2);
        System.out.println(s3);
    }
}
