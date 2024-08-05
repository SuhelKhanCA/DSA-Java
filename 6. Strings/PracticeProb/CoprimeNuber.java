import java.util.Scanner;

public class CoprimeNuber {
    // to calculate GCD
    public static int gcd(int m, int n){
        if(n > m) return gcd(n, m);
        if(m == n) return m;
        if(m == 0) return n;
        if(n == 0) return m;
        if(m ==1 || n == 1) return 1;
        return gcd(n, m%n);
    }
    // checking if the gcd of twonumber is 1
    public static boolean gcdOne(int a, int b){
        int gcd = gcd(a, b);
        if (gcd == 1) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        // iterate between these num
        System.out.print("Co-prime of 12 are: ");
        for (int i = 1; i <= num; i++) {
            if (gcdOne(num, i)) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}
