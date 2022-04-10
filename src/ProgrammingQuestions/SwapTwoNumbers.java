package ProgrammingQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;

//		1. using third variable

		int temp;
//		temp = x;
//		x = y;
//		y = temp;

//		System.out.println(x);
//		System.out.println(y);

//		2. without using third variable/using + operator
		
//		x = x + y;//15
//		y = x - y;//5
//		x = x - y;//10
//		
//		System.out.println(x);
//		System.out.println(y);
		
//		3. without using third variable/using * operator
		
		x = x*y;//50
		y = x/y;//5
		x = x/y;//10
		
		System.out.println(x);
		System.out.println(y);
		

	}

}
