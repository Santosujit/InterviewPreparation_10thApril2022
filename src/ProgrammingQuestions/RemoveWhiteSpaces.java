package ProgrammingQuestions;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str = " Naveen and Santosh ";
		System.out.println(str);
//		String str1 = str.trim();
//		System.out.println(str1);
		String str2 = str.replace(" ", "");
		System.out.println(str2);

	}

}
