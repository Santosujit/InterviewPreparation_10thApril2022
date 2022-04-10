package TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(1400, "Steve");
		map.put(11000, "Naveen");
		map.put(12000, "Robby");

		System.out.println(map);

//		{1000=Tom, 1400=Steve, 2000=Peter, 11000=Naveen, 12000=Robby} sorted

		map.forEach((k, v) -> System.out.println("Key = " + k + " value= " + v));

//		salary name TreeMap below

//				Key = 1000 value= Tom
//				Key = 1400 value= Steve
//				Key = 2000 value= Peter
//				Key = 11000 value= Naveen
//				Key = 12000 value= Robby

		System.out.println(map.lastKey());// highest key will be inserted at the last
		System.out.println(map.firstKey());// lowest key will be inserted at first
		System.out.println(map.lastEntry());
		System.out.println(map.firstEntry());

//		salary is less than 3000: find out

		Set<Integer> salarylessthan3k = map.headMap(3000).keySet();
		System.out.println(salarylessthan3k);

//		Now find out salary more than 3000

		Set<Integer> salarymorethan3k = map.tailMap(3000).keySet();
		System.out.println(salarymorethan3k);

		TreeMap<String, Integer> userMap = new TreeMap<String, Integer>();
		userMap.put("James", 100);
		userMap.put("Brad", 200);
		userMap.put("Albert", 400);
		userMap.put("Jeorge", 50);
		userMap.put("Larry", 900);
		userMap.put("Ted", 120);
		userMap.put("Paul", 300);

		System.out.println(userMap);// alphabetical sorting on the keys ascending order sorting

//		If you want descending order sorting then

		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>(Comparator.reverseOrder());

		map1.put(1000, "Tom");
		map1.put(2000, "Peter");
		map1.put(1400, "Steve");
		map1.put(11000, "Naveen");
		map1.put(12000, "Robby");

		System.out.println(map1);// 12000 is printed 1st reverse order based on keys

//		HashMap is used when we dont bother about sorting order
//		TreMap is used when we want sortig based on keys.

	}

}
