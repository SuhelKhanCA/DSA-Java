import java.util.StringTokenizer;

class StringParsingDemo1 {

    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("Joy with Java", " ");
        
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
