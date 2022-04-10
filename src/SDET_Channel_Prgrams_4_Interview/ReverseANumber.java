package SDET_Channel_Prgrams_4_Interview;

import java.util.Scanner;

public class ReverseANumber {

//	Using StringBuffer

	public static void main(String[] args) {

//		Get the number from the keyborad

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

//		Convert the number into string

		String num_string = String.valueOf(num);
		StringBuffer sb = new StringBuffer(num_string);
		StringBuffer rev = sb.reverse();
		System.out.println("The reveresed number is " + rev);

	}

}
