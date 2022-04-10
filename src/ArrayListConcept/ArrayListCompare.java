package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
//		Compare two Lists
//		first sort then use equals method
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("B","C","A","D","F"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","D","C","E"));
		
//		first sort
		
		Collections.sort(l1);
		System.out.println(l1);
		Collections.sort(l2);
		System.out.println(l2);
		Collections.sort(l3);
		System.out.println(l3);
		
//		Use .equlas methos to compare two Lists
		
		System.out.println(l1.equals(l2));
		System.out.println(l2.equals(l3));
		System.out.println(l3.equals(l1));
		
//		Find out the additional element in l4 which are not there in l5, l4 minus l5
		
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("B","C","A","D","F"));
		
		l4.removeAll(l5);//l4-l5
		System.out.println(l4);
		
//		Find out the missing elements in l5, missing element is E
		
//		Find out the common elements or intersection
//		A B C D are common
		
		
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("B","C","A","D","F"));
		
		l6.retainAll(l7);
		System.out.println(l6);
		

	}

}
