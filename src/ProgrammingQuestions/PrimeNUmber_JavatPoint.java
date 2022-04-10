package ProgrammingQuestions;

//Prime Number Program in Java
//Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. 
//In other words, prime numbers can't be divided by other numbers than itself or 1. 
//For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
//Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.

public class PrimeNUmber_JavatPoint {

	public static void main(String[] args) {

//		Let's check 11 is a Prime Number or Not

		int num = 41;
		int flag = 0;

		if (num == 0 || num == 1) {
			System.out.println("It's not a Prime Number");

		} else {
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					System.out.println("It's not a Prime Number");
					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.println(num + " is prime number");

			}
		}

	}

}
