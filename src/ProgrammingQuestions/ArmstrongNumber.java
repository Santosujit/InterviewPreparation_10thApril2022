package ProgrammingQuestions;

//Check whether the number is Armstromg number or not

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		double result = 0;
		int actualNum = num;

		while (num != 0) {
			int remainder = num % 10;
			result = result + Math.pow(remainder, 3);
			num = num / 10;
		}

		if (result == actualNum) {
			System.out.println("It's an Armstrong Number");
		} else {
			System.out.println("It's not an Armstrong Number");
		}

	}

}
