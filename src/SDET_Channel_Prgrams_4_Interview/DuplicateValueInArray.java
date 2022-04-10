package SDET_Channel_Prgrams_4_Interview;

//Find the duplicate values present in the array

public class DuplicateValueInArray {

	public static void main(String[] args) {

		String arr[] = { "java", "javascript", "python", "c", "c++", "java" };
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Found duplicate value: " + arr[i]);
					flag = true;
				}

			}
		}
		if (flag == false) {
			System.out.println("No duplicate values found");
		}

	}

}
