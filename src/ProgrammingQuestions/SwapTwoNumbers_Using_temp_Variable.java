package ProgrammingQuestions;

public class SwapTwoNumbers_Using_temp_Variable {

	public static void main(String[] args) {
		
//		Swap two numbers with using temporary variable.
		
		int a = 10;
		int b = 20;
		System.out.println("Before swapping:-");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		System.out.println("After swapping:-");
		
		int temp;
		temp = a;
		a = b;//a=20
		b = temp;//b=10
		System.out.println("a= "+a);
		System.out.println("b= "+b);

	}

}
