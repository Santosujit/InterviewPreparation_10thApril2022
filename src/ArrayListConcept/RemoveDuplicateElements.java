package ArrayListConcept;

//One thing to noted is that, if original order of elements in ArrayList is important for you,
//as List maintains insertion order, you should use LinkedHashSet because HashSet doesn't provide any ordering guarantee.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 2, 3, 1, 4, 5, 6, 1, 7, 8, 9, 7));
		
//		Remove duplicates elements from the above ArrayList
//		1. LinkedHashSet		
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>(numbers);//hs will store non duplicate elements
		                           
		ArrayList<Integer> numbersWithoutDuplicates = new ArrayList<Integer> (hs);//you need this array list to store 
		System.out.println(numbersWithoutDuplicates);
		
//		2.JDK 1.8 - Stream
		
		
		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 2, 3, 1, 4, 5, 6, 1, 7, 8, 9, 7));
		List<Integer> marksListUnique = marks.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);
		
		

	}

}
