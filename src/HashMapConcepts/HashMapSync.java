package HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {

//		Bydefault Java HashMap is not synchronized
//		HashTable is from JDK1.2 a legacy collection
//		HashMap introduced in JDK1.5
//		SynchronizedMap - Lock is applied on the entire object
//		ConcurrentHashMap - There are 16 segments
//		Lock is applied at the segment level not at the entire object level for write operation
//		For Read operation, multiple threads can work on a single segment, no lock applied
//		So ConcurrentHashMap is better, highly recommended to use

//		Convert HashMap into SynchronizedHashMap

		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("Naveen", "Jaipur");
		map1.put("Santosh", "Bhubaneswar");
		map1.put("Ruchi", "Gurgaon");

//		Convert HashMap into SynchronizedHashMap

//		Use Collections.synchronizedMap(m)

		Map<String, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);
		
//		ConcurrentHashMap: It doesn't throw any concurrentmodification exception
		
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
		concurrentMap.put("Jhulu", "Mom");
		concurrentMap.put("Ashok", "Dad");
		concurrentMap.put("Gopal", "Nephew");
		System.out.println(concurrentMap.get("Jhulu"));
		
		

	}

}
