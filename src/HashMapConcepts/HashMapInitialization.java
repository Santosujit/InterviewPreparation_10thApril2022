package HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapInitialization {

	public static Map<String, Integer> marksMap;

	static {
		marksMap = new HashMap<String, Integer>();
		marksMap.put("A", 100);

	}

	public static void main(String[] args) {

//		1. Using HashMap

		HashMap<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();

//		2. static way: static HashMap

		System.out.println(HashMapInitialization.marksMap.get("A"));

//		3. immutableMap with only one single entry
//		singletom map can store maximum one value

		Map<String, Integer> map3 = Collections.singletonMap("Test", 100);
		System.out.println(map3.get("Test"));
//		map3.put("abc", 200);UnsupportedOperationException
//			The singletonMap can store only single value

//		4. JDK8 - 
//		
//		Not able to understand, watch Naveen's video again

//		5. Using simpleEntry
//		Not able to understand, watch Naveen's video again

//		JDK 1.9
//		emptyMap
//		Not able to understand, watch Naveen's video again
		
//		singleton Map
//		Not able to understand, watch Naveen's video again
		
//		MultiValue Map : Max 10 pairs
//		Not able to understand, watch Naveen's video again
		
//		maps using Guava
//		Not able to understand, watch Naveen's video again
		
		
		

	}

}
