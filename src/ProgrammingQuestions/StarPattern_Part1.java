package ProgrammingQuestions;

public class StarPattern_Part1 {

	public static void main(String[] args) {

//		Create below pattern
//		
//		*
//		**
//		***
//		****
//		*****

//		there are 5 rows in this pattern, i=0 to i=4
//	    also there are 5 columns in this pattern
//	    rows and columns are increasing
//		use two for loop

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------------------");

//		*****
//		****
//		***
//		**
//		*

//		Create above patter now
//		Here in this pattern rows is increasing downwards
//		However columns is decrsing
//		Use two for loops

		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
