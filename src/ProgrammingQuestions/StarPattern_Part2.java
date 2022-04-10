package ProgrammingQuestions;

public class StarPattern_Part2 {

	public static void main(String[] args) {
//		
//		Create a pattern like below
//		---*
//		--**
//		-*
//		*
//		
//		- represents space
//		
//		so you have to write a for loop for space trainge
//		another for loop write for *

		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {// this is the for loop for space trainge
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");// this is the for loop for '*' triangle
			}

			System.out.println();

		}

//		Generate a Pyramid now

//		   *
//		  **
//		 ***
//		****
//		
//		we have already written logic for the above
//		Now just put a space before each *, you will get pyramid

//		   *
//		  * *
//		 * * *
//		* * * *

		System.out.println("Generate a Pyramid");

		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {// this is the for loop for space trainge
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(" *");// put just a space before *
			}

			System.out.println();

		}
	}

}
