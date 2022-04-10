package ProgrammingQuestions;

//Program to copy all elements of one array into another array

public class CopyArray_JavatPoint {

	public static void main(String[] args) {

		int ar1[] = new int[] { 1, 2, 3, 4, 5 };
		// Create another array arr2 with size of arr1
		int ar2[] = new int[ar1.length];

		// Copying all elements of one array into another

		for (int i = 0; i < ar1.length; i++) {
			ar2[i] = ar1[i];
		}

		// Displaying elements of array arr1
		System.out.println("Elements of original array: ");
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}

		System.out.println();

		// Displaying elements of array arr2
		System.out.println("Elements of new array: ");
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}

	}

}
