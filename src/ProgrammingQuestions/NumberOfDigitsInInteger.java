package ProgrammingQuestions;

public class NumberOfDigitsInInteger {

	public static void main(String[] args) {
		
		int num = 1000;
		int count = 0;
		
		while(num != 0) {
			num = num/10;
			count++;
		}
		
		System.out.println("Number of digits is: "+count);
	}

}
