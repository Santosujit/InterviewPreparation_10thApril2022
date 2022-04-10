package ProgrammingQuestions;

import java.util.Scanner;

public class AlphabetCheck {

//	Check if a character is a alphabet or not
//	alphabets are a to z or A to Z
//	Non-alphabets are $, *,#

	public static void main(String[] args) {

		char c = '$';
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println("It is a character");
		} else {
			System.out.println("It is not a character");
		}
		
		

	}

}
