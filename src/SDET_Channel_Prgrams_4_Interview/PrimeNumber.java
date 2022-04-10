package SDET_Channel_Prgrams_4_Interview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
//		Prime Number is a natural number (>1) which has only two factors
//		Prime Number is only divisible by itself and 1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number for Prime Number check: ");
		int num = sc.nextInt();
		int count=0;
		
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println(num+" is a prime number");
			}
			else {
				System.out.println(num+" is not a prime number");
			}
		}
		else {
			System.out.println(num+" is not a prime number");
		}

	}

}
