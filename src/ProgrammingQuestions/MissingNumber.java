package ProgrammingQuestions;

public class MissingNumber {

	public static void main(String[] args) {

//		suppose there is a array int a[] = {1,2,4,5}
//		In above array 1 to 5 is there in sequence but 3 is missing
//		how to find the missing number
//		first add 1 to 5 the original sequence, then add the given sequence
//		then substract

		int a[] = { 1, 2, 4, 5 };

//		first sum the given sequence

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

//		Now sum the sequence from 1 to 5

		int sum1 = 0;
		for (int j = 1; j <= 5; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);

		System.out.println("The missing number is: " + (sum1 - sum));

	}

}
