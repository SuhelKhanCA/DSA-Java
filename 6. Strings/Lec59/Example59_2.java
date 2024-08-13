import java.util.StringTokenizer;

class STDemo {

    static String in = "title=Java: Data Structures;" +
                       "author=DS;" + 
                       "publisher=NPTEL;" + 
                       "copyright=2020";

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(in, "=;");

        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
/*
Improved code:
public static void main(String[] args) {
    String in = "title=Java: Data Structures;" +
                "author=DS;" +
                "publisher=NPTEL;" +
                "copyright=2020";

    String[] pairs = in.split(";");
    for (String pair : pairs) {
        String[] keyValue = pair.split("=", 2);
        if (keyValue.length == 2) {
            System.out.println(keyValue[0] + "\t" + keyValue[1]);
        }
    }
}


 */