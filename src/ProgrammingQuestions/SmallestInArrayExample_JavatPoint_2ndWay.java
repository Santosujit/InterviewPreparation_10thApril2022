package ProgrammingQuestions;

import java.util.Arrays;

public class SmallestInArrayExample_JavatPoint_2ndWay {
	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		Arrays.sort(a);
		System.out.println("The smallest number in the array is: "+a[0]);
	}

}
