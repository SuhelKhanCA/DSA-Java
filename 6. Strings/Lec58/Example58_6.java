public class HashCodeTest {

    public static void main(String args[]) {
        System.out.println("Hashcode test of String:");
        String str = "Java";
        System.out.println(str.hashCode());
        str = str + "NPTEL";
        System.out.println(str.hashCode());
        
        System.out.println("Hashcode test of StringBuffer:");
        StringBuffer sb = new StringBuffer("Java");
        System.out.println(sb.hashCode());
        sb.append("NPTEL");
        System.out.println(sb.hashCode());
    }
}
