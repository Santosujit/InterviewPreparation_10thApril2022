package ProgrammingQuestions;

//Java Program to demonstrate the conversion of String into Integer , not integer It's Integer 
//using Integer.valueOf() method  

//String to int is achieved by Integer.parseInt(s) or Integer.valueOf(s)

public class StringToIntegerExample2 {

	public static void main(String args[]) {
		// Declaring a string
		String s = "200";
		// converting String into Integer using Integer.valueOf() method
		Integer i = Integer.valueOf(s);
		System.out.println(i);
	}
}
