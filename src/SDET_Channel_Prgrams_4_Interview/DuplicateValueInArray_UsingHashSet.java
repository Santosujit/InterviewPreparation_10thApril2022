package SDET_Channel_Prgrams_4_Interview;

import java.util.HashSet;

public class DuplicateValueInArray_UsingHashSet {

	public static void main(String[] args) {
		
		String arr[] = { "java", "javascript", "python", "c", "c++", "Java" };
		
		HashSet<String> langs = new HashSet<String>();
		boolean flag=false;
		for(String e:arr) {
			if(langs.add(e)==false) {
				System.out.println("Duplicate element found: "+e);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Duplicate element not found");
		}

	}

}
