package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class HashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 100);
		compMap.put("Amazon", 80);
		compMap.put("Microsoft", 95);
		compMap.put("ZOHO", 85);
		compMap.put("Infosys", 101);
		
		Iterator<Entry<String, Integer>> it = compMap.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		Convert all the keys into one ArrayList
//		Convert the values into another ArrayList
		
		System.out.println("----------------------");
		
		List<String> compNameList = new ArrayList<String>(compMap.keySet());
		System.out.println(compNameList);
		
		List<Integer> compvalueList = new ArrayList<Integer>(compMap.values());
		System.out.println(compvalueList);
		
		

	}

}
