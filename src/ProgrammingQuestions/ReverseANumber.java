package ProgrammingQuestions;

public class ReverseANumber {

	public static void main(String[] args) {
		
		System.out.println("Using while loop");

		int num = 1234;
		int rev = 0;

		while (num != 0) {
			int n = num % 10;// 4//3//2//1
			rev = rev * 10 + n;// 4//4321
			num = num / 10;// 12//1
		}

		System.out.println("Reversed Number is: " + rev);
		
		System.out.println("Using StringBuffer class");
		
		int num1 = 12345;
		String s1 = String.valueOf(num1);
		StringBuffer sb = new StringBuffer(s1);
		StringBuffer sb1 = sb.reverse();
		System.out.println(sb1.toString());
		


	}

}
