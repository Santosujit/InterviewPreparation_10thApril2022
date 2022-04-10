package ProgrammingQuestions;

//Java program to find the duplicate characters in a string

public class DuplicateCharacter_JavatPoint {

	public static void main(String[] args) {

		String str = "Great Responsibility";
		int count = 1;
		char dupliChar[] = str.toCharArray();// convert the String to an Array

		for (int i = 0; i < dupliChar.length; i++) {// Traverse the array
			for (int j = i + 1; j < dupliChar.length; j++) {// Compare the 1st element with all other elements
				if (dupliChar[i] == dupliChar[j] && dupliChar[i] != ' ') {
					count++;
					dupliChar[j] = '0';
				}
			}
			if (count > 1 && dupliChar[i] != '0')
				System.out.println(dupliChar[i]);
		}

	}

}
