package ProgrammingQuestions;

import java.io.InputStream;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

//		check a number entered by user is even or odd

		Scanner reader = new Scanner(System.in);// scanner is class used to read data from keyboard or input stream
		System.out.println("Entera number: ");
		int num = reader.nextInt();

		if (num % 2 == 0) {
			System.out.println("The entered number is even");
		} else {
			System.out.println("The entered number is odd");
		}
	}

}
