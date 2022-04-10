package ProgrammingQuestions;

//Program to print the smallest element in an array
//In this program, we need to find out the smallest element present in the array. 
//This can be achieved by maintaining a variable min which initially will hold the value of the first element. 
//Loop through the array by comparing the value of min with elements of the array. 
//If any of the element's value is less than min, store the value of the element in min.
//return a[0]

public class SmallestElement_array_JavatPoint {

	public static void main(String[] args) {

		// Initialize array
		int[] arr = new int[] { 25, 11, 7, 75, 56 };
		// Initialize min with first element of array.
		int min = arr[0];
		// Loop through the array
		for (int i = 0; i < arr.length; i++) {
			// Compare elements of array with min
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest element present in given array: " + min);
	}

}
