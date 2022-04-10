package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

//		Synchronized List

		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("Sushree");
		namesList.add("Suchi");
		namesList.add("Pinky");

//		add/remove - Don't need explicit synchronization
//		to fetch or traverse the values from the List - explicit synchronization is needed

		synchronized (namesList) {
			Iterator<String> it = namesList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}

//			CopyOnWriteArrayList

		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Java");
		empList.add("Python");
		empList.add("Javascript");

		System.out.println("------------");

//		We dont need explicit synchronization for any operation: add/remove/traversing

		Iterator<String> it = empList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
