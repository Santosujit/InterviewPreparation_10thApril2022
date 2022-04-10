package ProgrammingQuestions;

public class SortDsc_JavatPoint {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 5, 2, 8, 7, 1 };
		int temp = 0;

		// Displaying elements of original array
		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Sort the array in descending order
//		1st element is compared with 2nd element, if 1st element is lesser then swap the elements
//		If the 1st element is greater than 2nd element then keep it
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println();

		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in descending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
