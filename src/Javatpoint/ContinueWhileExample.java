package Javatpoint;

public class ContinueWhileExample {

	public static void main(String[] args) {
		// while loop
		int i = 1;
		while (i <= 10) {
			if (i == 5) {
				// using continue statement
				i++;
				continue;// it will skip the rest statement
			}
			System.out.println(i);// 5 is not printed here, once i reaches 5, it iterates to next
			i++;
		}
	}

}
