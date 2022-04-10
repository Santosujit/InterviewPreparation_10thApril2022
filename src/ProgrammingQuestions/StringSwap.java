package ProgrammingQuestions;

public class StringSwap {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";

		System.out.println("Before swapping: " + a + "  " + b);

//		Swap the Strings without using third variable

		a = a + b;// HelloWorld
		b = a.substring(0, a.length() - b.length());// Hello
		a = a.substring(b.length());
		System.out.println("After swapping: " + a + "  " + b);

	}

}
