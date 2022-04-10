package ProgrammingQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseUsingArrayList {

	public static void main(String[] args) {
		
		String str = "madam";
		char ra[] = str.toCharArray();
		List<Character> rs = new ArrayList<Character>();
		for(char e : ra) {
			rs.add(e);
		}
		Collections.reverse(rs);
		Iterator<Character> it = rs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
