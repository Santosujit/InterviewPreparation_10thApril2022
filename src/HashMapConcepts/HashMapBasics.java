package HashMapConcepts;

import java.util.HashMap;

//you can apply keyset on hashmap, it will return a set of string, then apply iterator
//then find the key, get the values

//you can apply entryset on a hashmap, it will return a set of entry, apply getkey() on entryset get the value

//similarly enteryset.getvalue() get the value

import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {

//		HashMap maintains no order or no indexing
//		It stores the elements in key and value pair
//		Key can not be duplicate, I mean you can have duplicate keys, but it will give you the latest values
//		Can store n number of Null values, but only one Null key
//		you can have many null keys but latest value will be given
//		HashMap is not synchronized unlike HashTable which is synchronized

		HashMap<String, String> capitalMap = new HashMap<String, String>();

		capitalMap.put("India", "Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("Odisha", "Cuttack");
		capitalMap.put("Odisha", "Bhubaneswar");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "Zurich");
		capitalMap.put("Canada", null);
		capitalMap.put("Australia", null);
		capitalMap.remove("Australia");

		System.out.println(capitalMap.get("Odisha"));// Value will be overriddedn as key is duplicate, latest value will
														// be fetched
		System.out.println(capitalMap.get("India"));// Give the key, get the value

		System.out.println(capitalMap.get("Germany"));// It will give Null as Germany is not a key in the HashMap

		System.out.println(capitalMap.get(null));// latest value of the null key will be fetched

		System.out.println(capitalMap.get("Canada"));

//		you can't traverse using for loop as there is no indexing
//		You have to use Iterator or forEach loop
//		There are two types of Iteration, iterate keys , Iterate values

//		iterator: over the keys using keySet()

//		capitalMap.keySet().iterator()

		Iterator<String> it = capitalMap.keySet().iterator();// 1st apply keySet on the HashMap, then apply iterator
		while (it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("key  " + key + "  value  " + value);

		}
		System.out.println("-----------------------");

//		iterator: over the set (pair) : by using entrySet

//		capitalMap.entrySet().iterator()

		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();// 1st apply entrySet on the hashmap,
																				// then apply iterator
		// It will return a Iterator of entry

		while (it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("keys " + entry.getKey() + " value " + entry.getValue());
		}

		System.out.println("-------------------------");
//		iterate using java8 forEach method using Lambda

		capitalMap.forEach((k, v) -> System.out.println("key = " + k + " value = " + v));// k, and v will behave like
																							// key and value

	}

}
