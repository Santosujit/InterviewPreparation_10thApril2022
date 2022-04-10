package ProgrammingQuestions;

//Fibonacci Series always starts with 0 then 1, and the third number is addition of last two numbers

public class FibonacciSeries {

	public static void main(String[] args) {

		int num = 10;
		int t1 = 0;
		int t2 = 1;
		for (int i = 0; i <= num; i++) {
			System.out.println(t1);
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}

	}

}
