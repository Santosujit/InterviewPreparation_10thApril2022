package ProgrammingQuestions;

//Find the factorial of the number using recursion
//Recursion is calling the same function again and again
//so we have to 1st create a function

public class FactorialRecursive {

	public static void main(String[] args) {

		int multiplication = multiplyNum(5);
		System.out.println(multiplication);

	}

	public static int multiplyNum(int num) {
		if (num >= 1) {
			return num * multiplyNum(num - 1);
		} else {
			return 1;
		}
	}
}
