package ProgrammingQuestions;

public class ArmStromgNumber {

//	Create a generic method outside main method to check whether a given number is ArmStrong Number or Not
//	Call this generic method inside your main method

	public static void isArmstrongNumber(int num) {

		System.out.println("Given number is: " + num);
		
//		Armstrong number is a number where the sum of the cubes of every digit of that number is the same number

//		153 is Armstrong number ==== 1*1*1  5*5*5  3*3*3
//		we will start with the last digit then come to the first digit
//		To get the last digit of any number, we take the remainder by diving with 10, using modulo operator
//		To decrese the number, we simply divide the number by 10

		int cube = 0;
		int r; // remainder
		int t;// temp variable

		t = num; // Give the number to the temp variable, and do all operations on the num,
					// lastly compare with t

		while (num > 0) {
			r = num % 10; // Get the last digit of the number
			num = num / 10;// Decrease the number by dividing it by 10
			cube = cube + (r * r * r);
		}

		if (t == cube) {
			System.out.println("It's a Armstrong Number");
		} else {
			System.out.println("It's not a Armstrong Number");
		}

	}

	public static void main(String[] args) {

		isArmstrongNumber(153);
	}

}
