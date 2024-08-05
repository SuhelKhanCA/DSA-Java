// Java program to Sort a String Alphabetically
// Using toCharArray() method
// With using the sort() method

// Importing Arrays class from java.util package
import java.util.Arrays;

// Main class
public class GFG {
	// Method 1
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

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{
		// Custom string as input
		String inputString = "geeks for geeks";
        
		String stArr[] = inputString.split("\\ ");

		// Print and display commands
        for (int i = 0; i < stArr.length; i++) {
            String outputString = sortString(stArr[i]);
        }

		for (int i = 0; i < stArr.length; i++) {
            System.out.print(stArr[i] + " ");
        }
	}
}
