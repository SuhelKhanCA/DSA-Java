
import java.util.Arrays;
import java.util.Scanner;

class SortingStringChar{
    // To sort a string alphabetically
	public static String sortString(String inputString)
	{
		// Converting input string to character array
		char tempArray[] = inputString.toCharArray();

		// Sorting temp array using
		Arrays.sort(tempArray);

		// Returning new sorted string
		return new String(tempArray);
	}
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        
        // Custom string as input
		String inputString = scanner.nextLine();
        
		String stArr[] = inputString.split("\\ ");

		// Print and display commands
        for (int i = 0; i < stArr.length; i++) {
            String outputString = sortString(stArr[i]);
            System.out.print(outputString  + " ");
        }

        scanner.close();
    }
}