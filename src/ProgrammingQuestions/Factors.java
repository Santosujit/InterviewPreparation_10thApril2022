package ProgrammingQuestions;

//Find the factors of a number
//60 -> 1,2,3,4,56,10,15,20,30,60
//I will divide that number from 1 to 60, if its divisible then thats a factor

public class Factors {

	public static void main(String[] args) {

		int num = 60;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
