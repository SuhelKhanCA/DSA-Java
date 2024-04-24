public class ReversingSentence {
    public static void main(String[] args) {
        String input = "I live in aligarh. Aligarh is fine. I am AMU Student.";

        String[] sentences = input.split("\\.");

        for (int i = sentences.length - 1; i >= 0; i--) {
            System.out.print((sentences[i] + "."));
        }
    }
}
/*!SECTION - Alternate Solution
 * public class ReversingSentence {
    public static void main(String[] args) {
        String input = "I live in aligarh. Aligarh is fine. I am AMU Student.";
        
        StringTokenizer txt = new StringTokenizer(input, ".");
        String x = "";

        while(txt.hasMoreTokens()){
            x = txt.nextToken() + "." + x;
        }
        System.out.print(x);
    }
}

 */