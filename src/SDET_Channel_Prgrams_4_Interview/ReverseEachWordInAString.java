package SDET_Channel_Prgrams_4_Interview;

//1st split the entire string
//It will become three parts like welcome to java
//store it in a character array
//apply an enhanced for loop
//1st time w will contain welcome, 2nd time to , 3rd time java
//reverse each word
//append

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		
		String str = "Welcome to Java";
		String[] words=str.split("\\s");
		String reversed_string="";
		for(String w:words) {
			String revesed_word="";
			for(int i=w.length()-1;i>=0;i--) {
				revesed_word=revesed_word+w.charAt(i);
			}
			reversed_string=reversed_string+revesed_word+" ";
			
		}
	System.out.println("The reversed string is: "+reversed_string);	

	}

}
