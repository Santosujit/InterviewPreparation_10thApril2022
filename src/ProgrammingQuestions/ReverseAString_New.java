package ProgrammingQuestions;

import java.util.Arrays;

public class ReverseAString_New {

//	1. Objects of String are immutable. 
//	2. String class in Java does not have reverse() method, however StringBuilder class has built in reverse() method. 
//	3. StringBuilder class do not have toCharArray() method, while String class does have toCharArray() method. 

	public static void main(String[] args) {

		String str = "madam";
		System.out.println(str);
		char reversedString[] = str.toCharArray();// convert the String into array

		// Traverse the array from end towards beginning

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			System.out.println(reversedString[i]);
		}

		String result = Arrays.toString(reversedString);
		System.out.println(result);
		if (str.equals(result)) {
			System.out.println("It's a Pallindrome");
		} else {
			System.out.println("It's not a Pallindrome");
		}

	}

}
