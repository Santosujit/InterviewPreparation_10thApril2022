package ProgrammingQuestions;

import java.util.Arrays;

public class SmallestAndLargestNumberInArray {

	public static void main(String[] args) {
		int numbers[] = { -10, 20, -88, 102929 };

//		make the 1st number largest and smallest
//		compare the 2nd number with the 1st number
//		If the 2nd number greater than 1st number, make the 2nd number largest
//		If the 2nd number is less than 1st number then make the 2nd number smallest
//		Now increase the i value in the for loop and keep on comparing

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		System.out.println("Given Array is: " + Arrays.toString(numbers));
		System.out.println("The largest number is: " + largest);
		System.out.println("The smallest number is: " + smallest);

	}

}
