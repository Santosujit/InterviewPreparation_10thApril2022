package ArrayListConcept;

//you can add two ArrayList using addAll method
//you can clone one ArrayList using clone method
//contains method return true if element is present inside ArrayList
//indexOf function returns positive integer is ArrayList contains the element
//To create an Array list either use add functiojn or Arrays.asList
//to add two arraylist use addAll method



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("Ruby");
		ar1.add("Javascript");

		ArrayList<String> ar2 = new ArrayList<String>();

		ar2.add("Testing");
		ar2.add("DevOps");

//		ar1.addAll(ar2);// combine ar1 with ar2
//		System.out.println(ar1);
//
//		ar1.addAll(2, ar2);// add ar2 elements from the 2nd index of ar1
//		System.out.println(ar1);
//
//		ar1.clear();
//		System.out.println(ar1);// It will clear the ArrayList

		ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();// ar1.clone() returns a Object Array, we want
		System.out.println(cloneList);// ArrayList, so typecast it

		System.out.println(ar1);
		System.out.println(ar1.contains("Python"));// Contains function return a boolean if Python is present in the
													// ArrayList then
		// true is returned
		System.out.println(ar1.contains("C++"));// as C== is not present in the ar1 ArrayList

		System.out.println(ar1.indexOf("Python") > 0);// indexOf function returns an integer, If it is greater then zero
														// then returns true
														// meaning the element is present
		System.out.println(ar1.indexOf("C++") > 0);

		ArrayList<String> list1 = new ArrayList<String>(
				Arrays.asList("Naveen", "Ruchi", "Santosh", "Naveen", "W", "Naveen"));
		System.out.println(list1.lastIndexOf("Naveen"));
		System.out.println(list1.lastIndexOf("Test"));// Test is not present in the ArrayList so -1 is returned

		System.out.println(list1);// Element at index 1 will be removed
		list1.remove(1);
		System.out.println(list1);

		list1.remove("W");// you can remove a value directly too, here W 'll be removed
		System.out.println(list1);

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		numbers.removeIf(num -> num % 2 == 0);// removeIf method is asking for predicate or a condition
//		remove the numbers which are divisible by zero

		System.out.println(numbers);

		ArrayList<String> namesList = new ArrayList<String>(
				Arrays.asList("Tom", "Naveen", "Ruchi", "Santosh", "Peter", "W", "Tom"));
		System.out.println(namesList);

		namesList.retainAll(Collections.singleton("Tom"));// retainAll method is saying give me a collection
															// use singleton method, retain those elements passed
		System.out.println(namesList);

		ArrayList<Integer> numbers1 = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
//		How to create a sub list, Sub list will be stored in another List
		ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(2, 6));// from 2nd index to 6th index
																					// exclusing 6th index
		System.out.println(subList);

		ArrayList<String> newList = new ArrayList<String>(
				Arrays.asList("Tom", "Naveen", "Ruchi", "Tom", "Peter", "W", "Richa"));

//		ArrayList to Array Conversion
		
		Object arr[] = newList.toArray();
		System.out.println(Arrays.toString(arr));

		for (Object o : arr) {
			System.out.println((String) o);
		}

	}

}
