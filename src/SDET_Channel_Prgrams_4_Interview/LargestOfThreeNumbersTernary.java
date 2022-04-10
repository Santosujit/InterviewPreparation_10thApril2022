package SDET_Channel_Prgrams_4_Interview;

import java.util.Scanner;

public class LargestOfThreeNumbersTernary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int a = sc.nextInt();

		System.out.println("Enter 2nd Number: ");
		int b = sc.nextInt();

		System.out.println("Enter 3rd Number: ");
		int c = sc.nextInt();

		int largest1 = a > b ? a : b;
		int largest2 = c > largest1 ? c : largest1;
		System.out.println(largest2 + " is the largest number");

	}

}
