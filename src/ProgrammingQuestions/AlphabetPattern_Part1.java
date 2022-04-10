package ProgrammingQuestions;

public class AlphabetPattern_Part1 {

	public static void main(String[] args) {

//		Create below patter
//		There is space between each alphabet
//		

//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
//		A B C D E F 
//		A B C D E F G

//		There are 7 rwos, and 7 columns as even after F there is a space, same for all ending letters
//		ASCII value of A is 65

		int alpha = 65;

		for (int i = 0; i <= 6; i++) {

			for (int j = 0; j <= i; j++) {// as j is totally dependent upon i
				System.out.print((char) (alpha + j) + " ");
			}
			System.out.println();

		}

	}

}
