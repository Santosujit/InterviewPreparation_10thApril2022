package ProgrammingQuestions;

public class PalindromeNumber {

//	Create generic method outside the main method, and call them inside the main method
//	Pallindrome is a number which is same if reversed
//	So first we have to reverse the number then compared the reversed number with the original one

	public static void isPalindromeNumber(int num) {
		System.out.println("Given number is : " + num);

		int rev = 0;
		int actualNum = num;

//		This while loop will reverse the 121

		while (num != 0) {
			int n = num % 10; // get the remainder
			rev = rev * 10 + n;
			num = num / 10;

		}

		if (actualNum == rev) {
			System.out.println("It's a Palindrome Number");
		} else {
			System.out.println("It's not a Palindrome Number");
		}
	}

	public static void main(String[] args) {

		isPalindromeNumber(10);
		isPalindromeNumber(0);
		isPalindromeNumber(1);
		isPalindromeNumber(121);

	}

}
