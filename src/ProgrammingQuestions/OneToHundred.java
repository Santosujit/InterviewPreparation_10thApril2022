package ProgrammingQuestions;

public class OneToHundred {

	public static void main(String[] args) {

//		Output of 1 to 100 without using numbers in your code

		int one = 'A' / 'A';
		String s1 = ".........."; // Ten Dots

		for (int i = one; i <= (s1.length() * s1.length()); i++) {
			System.out.println(i);
		}

		System.out.println("*************");

//		a=97 - b=98, c=99, d=100

		for (int i = one; i <= 'd'; i = i + one) {
			System.out.println(i);
		}
	}

}
