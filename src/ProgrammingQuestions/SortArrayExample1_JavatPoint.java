package ProgrammingQuestions;

import java.util.Arrays;

//Note: Like the Arrays class, the Collections class also provides the sort() method to sort the array. 
//But there is a difference between them. The sort() method of the Arrays class works for primitive type 
//while the sort() method of the Collections class works for objects Collections, such as LinkedList, ArrayList, etc.

public class SortArrayExample1_JavatPoint {
	public static void main(String[] args) {
		// defining an array of integer type
		int[] array = new int[] { 90, 23, 5, 109, 12, 22, 67, 34 };
		// invoking sort() method of the Arrays class
		Arrays.sort(array);
		//Arrays.toString(a);
		System.out.println("Elements of array sorted in ascending order: ");
		// prints array using the for loop
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
