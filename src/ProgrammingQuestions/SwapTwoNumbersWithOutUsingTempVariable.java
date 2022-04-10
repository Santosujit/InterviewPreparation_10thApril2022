package ProgrammingQuestions;

public class SwapTwoNumbersWithOutUsingTempVariable {

	public static void main(String[] args) {

//		Swap two numbers without using temporary variable.

		int a = 10;
		int b = 20;
		System.out.println("Before swapping:-");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

		System.out.println("After swapping:-");

		a = a - b;// a=-10
		b = a + b;// b=10
		a = b - a;// 20

		System.out.println("a= " + a);
		System.out.println("b= " + b);

	}

}
