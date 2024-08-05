//Example 56.3: Creating string objects
class StringDemo {
    public static void main(String args[]) {

        String s1 = "N P T E L";

        System.out.println("length" + s1.length());

        System.out.println(s1);

        String s2 = new String("NPTEL");

        System.out.println(s2 + "is of" + s2.length());

        s2 = new String("NPTEL");

        String s3 = new String(s1 + s2);
        System.out.println(s3);

    }

}