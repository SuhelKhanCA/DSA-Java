
import java.util.Arrays;
import java.util.Scanner;

class SortingStringWord{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String str = inp.nextLine();

        String[] strArr = str.split(" ");
        Arrays.sort(strArr);
        for (String string : strArr) {
            System.out.print(string + " ");
        }
        inp.close();
    }
}