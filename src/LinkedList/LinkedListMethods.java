package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {

//		LinkedList is a default class in Java
//		It can be used as List, Stack, Queue as it implements all these interfaces
//		This is the advantage of LinkedList over ArrayList
//	    It is dyanamic
//	    hence insertion and deletion can be easily implemented
//	    It can contain duplicate elements
//	    It is not synchronized (Not Thread Safe)
//		Manipulation is fast as compared to Arrays as we don't need any shifting in memory cells

//		Constructor
//		LinkedList()
//		LinkedList(Collection c)

		LinkedList<String> names = new LinkedList<String>();// It mains a doubly LinkedList internally
		System.out.println(names.size());// Pc = 0
		names.add("Tom");// oth index
		names.add("Naveen");// 1st
		names.add("Robby");// 2nd index
		names.add("Lisa");// 3rd index

		System.out.println(names.size());// Pc = 2
		System.out.println(names);
		System.out.println(names.get(0));
		System.out.println(names.get(1));
//		System.out.println(names.get(2));IndexOutOfBoundException

//		How to iterate

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		names.add(4, "Steve");// on 4th Index add Steve
		System.out.println(names);

		names.add(2, "Ram");// on 2nd index add Ram, the 2nd index value will be shifted
		System.out.println(names);// shifting is very easy unlike Arrays

		LinkedList<String> users = new LinkedList<String>();
		users.add("Peter");
		users.add("Trump");

		names.addAll(users);
		System.out.println(names);// Two Lists will be added

		names.addFirst("Kamala");
		System.out.println(names);// kamala will be added in the 1st position

		names.addLast("Santosh");
		System.out.println(names);// Santosh will be added in the last position

		names.remove(2);
		System.out.println(names);// you can shrink the data

		names.removeAll(users);
		System.out.println(names);// from names list remove all the elements which are coming form users list

		names.removeFirst();
		names.removeLast();
		System.out.println(names);

		names.clear();
		System.out.println(names);// It will remove all the elements

		LinkedList<String> language = new LinkedList<String>();
		System.out.println(language.size());

		language.add("Java");// oth index
		language.add("Python");// 1st
		language.add("Ruby");// 2nd index
		language.add("Javascript");// 3rd index

		System.out.println(language.size());

//		reverse the linkedlist

		Iterator<String> itr = language.descendingIterator();// It will print on the reverse order
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------");
		for (String e : language) {
			System.out.println(e);
		}

//		sort

		Collections.sort(language);
		System.out.println(language);// It will print in sorted order

	}

}
