package ProgrammingQuestions;

public class GreatestAmongThreeNumbers {

	public static void main(String[] args) {

//		Find the greatest among three numbers
//		use And operator &&

		int x = 100;
		int y = 200;
		int z = 900;

		System.out.println("1st way...");

		if (x >= y && x >= z) {
			System.out.println("x is the greatest number");
		} else if (y >= z) {
			System.out.println("y is the greatest number");// here we are not comparing y with x as it is already done
															// in the previous if loop
		} else {
			System.out.println("z is the greatest number");
		}

		System.out.println("2nd way...");

	}

}
