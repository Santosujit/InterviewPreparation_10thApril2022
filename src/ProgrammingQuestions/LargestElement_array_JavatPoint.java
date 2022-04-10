package ProgrammingQuestions;

//Program to print the largest element in an array

//In this program, we need to find out the largest element present in the array and display it. 
//This can be accomplished by looping through the array from start to end by comparing max with all the elements of an array. 
//If any of element is greater than max, then store a value of the element in max. Initially, max will hold the value of the first element. 
//At the end of the loop, max represents the largest element in the array.

public class LargestElement_array_JavatPoint {

	public static void main(String[] args) {

		// Initialize array
		int[] arr = new int[] { 25, 11, 7, 75, 56 };
		// Initialize max with first element of array.
		int max = arr[0];
		// Loop through the array
		for (int i = 0; i < arr.length; i++) {
			// Compare elements of array with max
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest element present in given array: " + max);
	}

}
