package ProgrammingQuestions;

public class PrimeNumber {

//	Prime Number is a number which is divisible by itself and one.
//  So I will check the divisility of the number from 2 to number-1 and decide
//	The lowest prime number is 2 in positive number	. 1 is not a Prime Number
//	Negative numbers are not prime numbers

//	Create a generic method to find prime numbers
//	Then create another generic method to create prime numbers upto a certain number

//	check whether the given num is prime or not

	public static boolean isPrimeNumber(int num) {

		// 1st cover edge/corner use cases/test cases

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

//	find prime numbers upto 20 or num

	public static void getPrimeNumbers(int num) {

		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) {

		System.out.println(isPrimeNumber(2));
		System.out.println(isPrimeNumber(3));
		System.out.println(isPrimeNumber(0));
		System.out.println(isPrimeNumber(9));
		System.out.println(isPrimeNumber(17));
		System.out.println(isPrimeNumber(-3));

		getPrimeNumbers(17);

	}

}
