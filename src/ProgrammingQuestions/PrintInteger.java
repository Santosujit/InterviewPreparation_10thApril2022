package ProgrammingQuestions;

//Java Program to print a Number entered by User
//Scanner class is used to read the data from the command line

//we have to use Scanner class

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Number: ");

		int num = reader.nextInt();
		System.out.println("You entered " + num);

	}

}
