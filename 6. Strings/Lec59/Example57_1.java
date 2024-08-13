import java.util.StringTokenizer;

class StringParsingDemo1 {

    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("Joy with Java", " ");
        
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
/*

Improvement:

public static void main(String[] args) {
    String str = "Joy with Java";
    String[] tokens = str.split(" ");
    
    for (String token : tokens) {
        System.out.println(token);
    }
}

 */