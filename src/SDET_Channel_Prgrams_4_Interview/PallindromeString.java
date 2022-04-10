package SDET_Channel_Prgrams_4_Interview;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String: ");
		String str = sc.next();
		String orig_str = str;
		
		StringBuffer sb = new StringBuffer(str);
		StringBuffer sb1 = sb.reverse();
		String rev_str=sb1.toString();
		
		if(orig_str.equals(rev_str)) {
			System.out.println("It's a Pallindrome");
		}
		else {
			System.out.println("It's not a Pallindrome");
		}

	}

}
