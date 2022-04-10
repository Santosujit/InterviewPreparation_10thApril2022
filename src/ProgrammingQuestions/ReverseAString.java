package ProgrammingQuestions;

//Reverse a String using for loop
//Reverse a String using StringBuffer class
//Do we have reverse function in String class - No

public class ReverseAString {

	public static void main(String[] args) {

		System.out.println("Using for loop");

		String s = "Naveen";
		String rev = "";
		int len = s.length();// 6
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		System.out.println("Using StringBuffer Class");

		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());

	}

}
