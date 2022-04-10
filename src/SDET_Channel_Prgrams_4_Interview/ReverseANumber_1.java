package SDET_Channel_Prgrams_4_Interview;

import java.util.Scanner;

//Using StringBuilder

public class ReverseANumber_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = sb.append(num);
		StringBuilder rev = sb1.reverse();
		System.out.println("The reversed number is " + rev);

	}

}
