package ProgrammingQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {

//		s ="Naveen"; I want the output like e:2 e is repeating twice
//		N and n are different so not repeating
//		If str = java, then print a:2, so key value format, create a HashMap

		printDuplicateCharacters("Javata");
		System.out.println("---------------");
		printDuplicateCharacters("Naveen");

	}

	public static void printDuplicateCharacters(String str) {
		if (str == null) {
			System.out.println("Null String");
			return;// Here it is returning nothing or void
		}

		if (str.isEmpty()) {
			System.out.println("Empty String");
			return;// Here it is returning nothing or void
		}
		if (str.length() == 1) {
			System.out.println("Single Character String");
			return;// Here it is returning nothing or void
		}

		char words[] = str.toCharArray();// convert this String to a Character Array
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character ch : words) {
			if (charMap.containsKey(ch)) {// if the character is already present in the map
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}

//			Now Print the selected Map

			Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
			for (Map.Entry<Character, Integer> entry : entrySet) {
				if (entry.getValue() > 1) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
				}
			}

		}
	}

}
