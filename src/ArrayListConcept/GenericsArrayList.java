package ArrayListConcept;

import java.util.ArrayList;

public class GenericsArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> marksList = new ArrayList<Integer>();
//		you can store only integer in this ArrayList
		marksList.add(100);

		ArrayList<Double> arD = new ArrayList<Double>();
		arD.add(12.33);

		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Ruchi");
		
		

	}

}
