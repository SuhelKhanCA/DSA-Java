import java.util.Scanner;

public class HighestPrimeNumber {
    // for checking prime
    public static boolean isPrime(int a){
        boolean flag = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                 flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two positive integers: ");

        int x = in.nextInt();
        int y = in.nextInt();
        int min = 0;
        int max = 0;
        if (x  > y) {
            max = x;
            min = y;
        }else{
            max = y;
            min = x;
        }
        int maxPrime =0;
        // iterate between these num
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                maxPrime = i;
            }
        }
        System.out.println(maxPrime);
    }
}
