package SDET_Channel_Prgrams_4_Interview;

import java.util.Scanner;

public class CountWordsInAString {

	public static void main(String[] args) {
		
//		Welcome to Java is a String
//		It has three words welcome to and java
//		The logic is extract each and every character, when you encounter a space,
//		and also after space there should be an alphabet meaning not space anymore
//		then increase the count
		
		System.out.println("Enter your String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=1;
		
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))	 {
				count++;
			}
		}
		System.out.println("The number of words is: "+count);
		
		

	}

}
