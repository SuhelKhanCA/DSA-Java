// Example 56.2: String as command line arguments
class CommandLineDemo {
    public static void main(String args[]) {
        System.out.println("Number of arguments: " + args.length);
        
        if (args.length == 0) return;
        
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
