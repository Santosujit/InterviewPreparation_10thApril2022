package ArrayListConcept;

//You can iterate an arry using for loop, or using iterator or stream with forEach loop

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Naveen");
		studentList.add("Lisa");
		studentList.add("Dablu");
		studentList.add("Ruchi");

//		Iterate through for loop
		System.out.println("Iterate through for loop");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}

//		Iterate through forEach loop
		System.out.println("Iterate through forEach loop");
		for (String e : studentList) {
			System.out.println(e);
		}

//		Using JDK 8 - Streams with Lambda
		System.out.println("Iterate Using JDK 8 - Streams with Lambda");
		studentList.stream().forEach(ele -> System.out.println(ele));

//		Using Iterator
		System.out.println("Iterate using Iterator");
		Iterator<String> it = studentList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

//		studentList.iterator() is returning a Iterator<String>
//		keep running while loop until it.hasNext(), if it has a next value in the ArrayList
//		After Ruchi there is no next value, so condition is false

//		You can create an ArrayList with another ArrayList

		System.out.println("List with other Collection");

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		System.out.println(numbers);

		ArrayList<String> colleges = new ArrayList<String>(
				Arrays.asList("KiiT", "ITER", "Harvard", "MIT", "BayAreaCollege"));
		System.out.println(colleges);

		// Arrays.asList(a)

	}

}
