package ProgrammingQuestions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

//		Two Strings are called the anagram if they contain the same characters. However, 
//		the order or sequence of the characters can be different.

		String str1 = "Brag";
		String str2 = "Grab";

		// Converting both the string to lower case.
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Checking for the length of strings
		if (str1.length() != str2.length()) {
			System.out.println("Both the strings are not anagram");
		} else {
			// Converting both the arrays to character array
			char[] array1 = str1.toCharArray();
			char[] array2 = str2.toCharArray();

			// Sorting the arrays using in-built function sort ()
			Arrays.sort(array1);
			Arrays.sort(array2);

			// Comparing both the arrays using in-built function equals ()

			if (Arrays.equals(array1, array2) == true) {
				System.out.println("Both the strings are anagram");
			} else {
				System.out.println("Both the strings are not anagram");
			}
		}

	}

}
