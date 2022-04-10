package ProgrammingQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String infra[] = { "Amazon", "GCP", "Azure", "Amazon", "Alibaba", "SauceLabs", "Azure", "GCP" };

//		you can solve this with four methods
//		brute force
//		HashSet
//		HashMap<K,V>
//		Streams

		System.out.println("********Brute Force Mechanism********");

		for (int i = 0; i < infra.length; i++) {
			for (int j = i + 1; j < infra.length; j++) {
				if (infra[i].equals(infra[j])) {
					System.out.println(infra[i]);
				}
			}
		}

		System.out.println("********HashSet********");
//		The property of HasSet is It can not store duplicate elements

		Set<String> data = new HashSet<String>();// Set is an Interface and HashSet is a class

		for (String e : infra) {// we are iterating infra array, e represents each element of that array of
								// String type
			if (data.add(e) == false)// if added succesfully, it will givve true. If duplicate is found and not added
										// successfully, then it will give you false
				System.out.println(e);
		}

		System.out.println("*******HashMap*********");
//		Didn't understand it. Try it later
		
		System.out.println("*******Streams*********");
//		Didn't understand it. Try it later
		
		

	}

}
