package ProgrammingQuestions;

import java.util.Scanner;

//Design a Calculator through switch case

public class Calculator {

	public static void main(String[] args) {

		System.out.println("Enter two numbers: ");
		Scanner reader = new Scanner(System.in);
		double first = reader.nextDouble();
		double second = reader.nextDouble();

		System.out.println("Enter the operator: (+, -, *, /): ");

		char operator = reader.next().charAt(0);

		double result = 0;

		switch (operator) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;

		default:
			System.out.println("Pls enter correct operator");
			break;
		}

		System.out.println(result);

	}

}
