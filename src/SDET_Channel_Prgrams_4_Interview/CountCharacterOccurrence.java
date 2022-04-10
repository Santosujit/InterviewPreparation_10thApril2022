package SDET_Channel_Prgrams_4_Interview;

//Find out how many times character a occurs
//Find the total length of the string
//Replace all a with nothing or blank
//find the length of the string after replacing all a
//substract to get the value

public class CountCharacterOccurrence {

	public static void main(String[] args) {
		
		String s="Java Programming Concepts OOPS";
		int before_removal=s.length();
		s=s.replace("a", "");
		int after_removal=s.length();
		int final_count=before_removal-after_removal;
		System.out.println("The number of times a occurs is: "+final_count);

	}

}
