package ProgrammingQuestions;

public class Pallindrome_2ndWay {

//	A palindrome number is a number that is same after reverse. 
//	For example 545, 151, 121, 34543, 343, 171, 48984 are the palindrome numbers. 
//	It can also be a string like LOL, MADAM etc.
//	
//	Logic:
//		Get the number to check for palindrome
//		Hold the number in temporary variable
//		Reverse the number
//		Compare the temporary number with reversed number
//		If both numbers are same, print "palindrome number"
//		Else print "not palindrome number"

	public static void main(String[] args) {

		String str = "madam";
		StringBuffer sb = new StringBuffer(str);
		StringBuffer fs = sb.reverse();
		String reversedString = fs.toString();
		if (str.equals(reversedString)) {
			System.out.println("It's a Pallindrome");
		} else {
			System.out.println("It's not a Pallindrome");
		}

	}

}
