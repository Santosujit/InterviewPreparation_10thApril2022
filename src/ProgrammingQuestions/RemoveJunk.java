package ProgrammingQuestions;

//Remove all junk values (special characters,spaces) from a String

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "#$%*&@ Santosh$$##Loves$$#Ruchi#$#@@!!!";
		s = s.replaceAll("[^a-zA-z0-9]", "");// replace with nothing or blank values.
//		s.replaceAll("[^a-zA-Z0-9]", "")
		System.out.println(s);

//		[^a-zA-z0-9]  - This is the regular expression meaning not in a-zA-z0-9 range

	}

}
