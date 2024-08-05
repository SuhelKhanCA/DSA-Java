// Sorting every word of a sentence

import java.util.Scanner;

class ReversingEachWordString{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String str = inp.nextLine();
        StringBuilder strBld = new StringBuilder();
      
            strBld.append(str);
            strBld.reverse();
            System.out.print(strBld +  " ");

        inp.close();
    }
}