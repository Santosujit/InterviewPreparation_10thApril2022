package ProgrammingQuestions;

//Greatest Common Divisor: It is the highest number that completely divides two or more numbers. 

//It is abbreviated for GCD. It is also known as the Greatest Common Factor (GCF) and the Highest Common Factor (HCF). 
//
//How to Find the Greatest Common Factor:-
//Write all the factors of each number.
//Select the common factors.
//Select the greatest number, as GCF.
//It is used to simplify the fractions.
//
//Factors of 12: 1, 2, 3, 4, 6, 12
//
//Factors of 8: 1, 2, 4, 8
//
//Common Factors: 1, 2, 4
//
//Greatest Common Factor: 4

public class FindGCD_JavatPoint {

	public static void main(String[] args) {

//		find the GCD of 8, and 12

		int num1 = 8;//find the factors of 8, find the factors of 12
					 //		Find the common factors of 8, and 12, Find the greatest common factor
		int num2 = 12;
		int GCD = 0;

		// running loop form 1 to the smallest of both numbers

		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				GCD = i;
			}
		}
		System.out.println("GCD of: " + num1 + " and " + num2 + " is " + GCD);

	}

}
