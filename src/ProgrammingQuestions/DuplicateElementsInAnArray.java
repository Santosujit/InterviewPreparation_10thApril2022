package ProgrammingQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInAnArray {

	public static void main(String[] args) {

		System.out.println("Using for loop - worst approach");

//		first compare java with all other, then javascript with all other like this

		String names[] = { "java", "javascript", "python", "C", "Ruby", "java" };// here in this array java is duplicate
																					// element
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate element is: " + names[i]);
				}
			}
		}

		System.out.println("**********");

//		Using HashSet: Java collection: It stores unique values

		Set<String> language = new HashSet<String>();
//		Create a HashSet and add each element of the names array to the HashSet
//		HashSet only allows unique value
//		If the value is added successfully to the Set It returns true

		for (String e : names) {
			if (language.add(e) == false) {
				System.out.println("Duplicate element is: " + e);
			}
		}

		System.out.println("******************");
//		Using HashMap
//		Using a for each loop 1st I will go to each and every element of the array
//		then I will add the elements in the Hashmap
//		Hasmap key will be the langauge, and the value will be how many times the language is their in the array
//		So I designed a HashMap like key and value
//		Key being the language in the array
//		value being how many times the language appears in the array

		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String e : names) {
			Integer count = storeMap.get(e);//Now there is nothing in the storeMap
			if (count == null) {
				storeMap.put(e, 1);
			} else {
				storeMap.put(e, ++count);
			}
		}
//		Now iterate the HashMap using entrySet
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();//HasHmap converted into Set which is like an Array
		for(Entry<String, Integer> e: entrySet) {
			if(e.getValue()>1) {
				System.out.println("Duplicate Element is: "+e.getKey());
			}
			
		}

	}

}
