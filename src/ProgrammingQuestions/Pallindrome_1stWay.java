package ProgrammingQuestions;

public class Pallindrome_1stWay {
	
//	Approach: Take two pointers i pointing to the start of the string (i=0) and j pointing to the end of the string(i=len-1). 
//	Keep incrementing i and decrementing j while i < j 
//	and at every step check whether the characters at these pointers are same or not. 
//	If not then the string is not a palindrome else it is.	
//	Inside a for loop or while loop you can have if loop

	public static void main(String[] args) {

		String str = "madam";
		int i = 0;
		int j = str.length()-1;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				System.out.println("It is not a Pallindrome");
				i++;
				j--;
			}
			else {
				System.out.println("It is a Pallindrome");
				break;
			}
		}
		

	}

}
