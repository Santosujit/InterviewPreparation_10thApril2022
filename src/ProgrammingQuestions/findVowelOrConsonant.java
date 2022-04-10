package ProgrammingQuestions;

import java.util.Scanner;

public class findVowelOrConsonant {

	public static void main(String[] args) {

//		find a character entered is vowel or consonant

		char ch = 'e';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("It is a Vowel");
		} else {
			System.out.println("It is a Consonant");
		}

//		using switch case

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It is a Vowel");

			break;
		default:
			System.out.println("It is a Consonant");
			break;
		}

	}

}
