package ProgrammingQuestions;

import java.util.Scanner;

//Check a number whether it is positive or negative

public class Positive_NagativeNumber {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		double num = reader.nextDouble();

		if (num < 0.0) {
			System.out.println(num + " is negative number");
		} else if (num > 0.0) {
			System.out.println(num + " is positive number");
		} else if (num == 0.0) {
			System.out.println(num + " is not negative por positive It's zero");
		}
	}

}
