import java.util.ArrayList;
import java.util.Scanner;
public class CompositeNumSum {
    public static boolean isComposite(int a){
        boolean flag = false;
        int count =0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                count ++;
            }
        }
        if (count > 1) {
            flag = true;
        }
        return flag;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        
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
        
        // iterate between these num
        for (int i = min + 1; i < max; i++) {
            if (isComposite(i)) {
                list.add(i);
            }
        }
        System.out.println(list);

        // calculating sum
        int sum =0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("The sum of all the composite numbers between " + x + " and " + y + " is: " + sum);

        in.close();
    }
}
