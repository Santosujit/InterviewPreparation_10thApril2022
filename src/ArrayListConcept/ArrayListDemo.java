package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

//		ArrayList is a default class implementing List Interface
//		Dyanamic array

		int i[] = new int[4];// only 4 values can be stores

//		i[4] = 100;ArrayIndexOutofBoundException
//		i[-1] = 200;

//		ArrayList is a class
//		
//		default

		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);// oth position
		ar.add("Santosh");// 1st position
		ar.add('A');// 2nd position
		ar.add(true);// 3rd position
		System.out.println(ar);// 4th position

//		ArrayList stores data based on indexing
//		Its an order based collection
//		Random access is allowed

//		ar.get(index)

		System.out.println(ar.get(0));
		System.out.println(ar.get(2));

		System.out.println(ar.size());// 4

//		For Array, and ArrayList the lowest index is zeroth index
//		For Array, and ArrayList the highest index is length-1
//		In hashmap Null values are always stores in zeroth index as hascode of null values are zero

		ar.add(500);
		ar.add(700);
		System.out.println(ar.size());// 6, as we added two more elements, dynamic

	}

}
