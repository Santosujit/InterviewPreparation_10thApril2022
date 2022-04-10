package HashMapConcepts;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Nav", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Nave", 600);

		marks.put(null, 500);
//		marks.put(null, 700);//700 will replace 500
//		marks.put(null, 900);//900 will replace 700

//		hashing: hashCode : hashing:-

//		HashCode is calculated based on Key.class Then index is calculated.

	}

}
