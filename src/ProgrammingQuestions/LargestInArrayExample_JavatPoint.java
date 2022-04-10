package ProgrammingQuestions;

import java.util.Arrays;

//Java Program to find Largest Number in an Array
//We can find the largest number in an array in java by sorting the array and returning the largest number. 
////return a[a.length-1]

public class LargestInArrayExample_JavatPoint {

	public static void main(String[] args) {

		int a[] = { 1, 4, 5, 67, 8 };
		Arrays.sort(a);
		System.out.println(a[a.length - 1]);

	}

}
