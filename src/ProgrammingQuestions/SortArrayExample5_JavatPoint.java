package ProgrammingQuestions;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayExample5_JavatPoint {
	public static void main(String[] args) {
		String[] strarray = { "Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange" };
		// sorts array[] in descending order
		Arrays.sort(strarray, Collections.reverseOrder());// if you remove Collections.reverseOrder() from here it will
															// give descending order ascending order search
		System.out.println("Array elements in descending order: " + Arrays.toString(strarray));
	}

}
