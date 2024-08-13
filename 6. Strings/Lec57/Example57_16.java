// Example 57.16: Numbers as command line arguments
import java.io.IOException;

class CommandLineDemo2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Number of arguments: " + args.length);
        int sum = 0;
        if (args.length == 0) {
            return;
        }
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Sum = " + sum);
    }
}
