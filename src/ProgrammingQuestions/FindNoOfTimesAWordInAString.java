package ProgrammingQuestions;

import java.util.HashMap;
import java.util.Map;

//Java Program to Find the Occurrence of Words in a String using HashMap

public class FindNoOfTimesAWordInAString {
	public static void main(String[] args) {

		String str = "Alice is girl and Bob is boy";

		Map<String, Integer> hashMap = new HashMap<>();

		String[] words = str.split(" ");

		for (String word : words) {
			// containsKey(key) will return a boolean value
			// i.e. true if it contains the key and false if
			// it doesn't.
			if (hashMap.containsKey(word))
				hashMap.put(word, hashMap.get(word) + 1);

			else
				hashMap.put(word, 1);
		}

		System.out.println(hashMap);
	}

}

//OR------------

//public static void main(String[] args) {
//    // TODO Auto-generated method stub
//    String str = "This this is is done by Saket Saket";
//    String[] split = str.split(" ");
//     
//            HashMap<String,Integer> map = new HashMap<String,Integer>();
//    for (int i=0; i<split.length; i++) {
//        if (map.containsKey(split[i])) {
//            int count = map.get(split[i]);
//            map.put(split[i], count+1);
//        }
//        else {
//            map.put(split[i], 1);
//        }
//    }
//    System.out.println(map);
//}
