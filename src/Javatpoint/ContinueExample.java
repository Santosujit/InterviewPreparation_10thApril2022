package Javatpoint;

public class ContinueExample {
	public static void main(String[] args) {
		// for loop
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// using continue statement
				continue;// it will skip the rest statement
			}
			System.out.println(i);// 5 is not printed here that's the trick
		}
	}

}
