package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {

//		No duplicate values allowed in HashSet
//		null values are allowed
//		It doesn't mentain any order

		Set<String> hs = new HashSet<String>();
		hs.add("Testing");
		hs.add("Alpha");
		hs.add("Beta");
		hs.add(null);
		System.out.println(hs);

		System.out.println(hs.contains("Testing"));
		System.out.println("--------------");

		for (String e : hs) {
			System.out.println(e);
		}

		System.out.println(hs);
		hs.remove("Beta");
		System.out.println(hs);

		System.out.println("--------------");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] { 1, 3, 4, 5, 6, 8, 9, 10 }));

		Set<Integer> second = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] { 2,7,4,1 }));

//		get the union of both the sets

		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);// It will automatically remove the duplicates as in set no duplicates
		System.out.println("--------------");
		Set<Integer> interSection = new HashSet<Integer>(first);
		interSection.retainAll(second);
		System.out.println(interSection);//why it is not proper investigate
		
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff);//why it is not proper investigate

	}

}
