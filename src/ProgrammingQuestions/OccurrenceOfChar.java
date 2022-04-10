package ProgrammingQuestions;

public class OccurrenceOfChar {

//	Count the occurrences of a given character in a String

	public static void main(String[] args) {

		String str = "I Love you Java";

//		getCharOccurrence(str,'a');
		getCharCount(str, 'a');

	}

//	1st method

	public static void getCharOccurrence(String str, char value) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch == value) {
				count++;
			}
		}
		System.out.println(value + ":" + count);

	}

//	2nd way

	public static void getCharCount(String str, char value) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == value) {
				count++;
			}
		}
		System.out.println(value + ":" + count);
	}

//	Using Stream Do it later

}
