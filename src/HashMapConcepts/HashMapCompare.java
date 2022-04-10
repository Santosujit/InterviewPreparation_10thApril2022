package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(3, "C");
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "D");

//		1. on the basis of key-Value.class use equals method

		System.out.println(map1.equals(map2));// order does not matter
		System.out.println(map1.equals(map3));

//		2. Compare HashMap for the same Keys: Use keySet

		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));
//		map1.keySet() will give the keys of map1, return type is Set of integer

//		3. find out the extra key: here compare keys from map1 with map4, extra key is 4
//		combine both maps in a HashSet, and then substract keys of map1, it will give the extra keys present in map4

		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(3, "C");
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(4, "D");// 4 is the extra key

		HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());// HashSet stores unique values,now
																			// combineKeys Hashset contains map1 keys
		combineKeys.addAll(map4.keySet());// now combineKeys HashSet contains both map1 and map4 keys
		combineKeys.removeAll(map1.keySet());// now combineKeys HashSet contains only the extra keyb from map4
		System.out.println(combineKeys);

//		compare maps by values

		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");

		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(4, "A");
		map6.put(5, "B");
		map6.put(6, "C");

		HashMap<Integer, String> map7 = new HashMap<Integer, String>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");

//		using ArrayList
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));// create a ArrayList
																									// object and store
																									// map5 values, then
																									// create another
																									// ArrayList Object,
																									// and store map6
																									// values and
																									// compare
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
		
//		Using 	HastSet
		
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));


	}

}
