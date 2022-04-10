package ProgrammingQuestions;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "The rains have started here";
		String str1 = "The rains Have started here";// here it is capital H
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));// 1st occurrence of s
		System.out.println(str.indexOf('s', str.indexOf('s') + 1));// 2nd occurrence of s
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("hello"));//If a String is not present It returns -1
		
//		string comparision
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
//		substring
		System.out.println(str.substring(0));
		System.out.println(str.substring(0, 9));//It will exclude 9, the ending index
		
//		trim
		String s = "  Hello World  ";
		System.out.println(s.trim());//It will trim the ending and beginning spaces, not the between spaces
		System.out.println(s.replace(" ", ""));//It will remove the between spaces too
		
		String date = "20-07-2982";
		System.out.println(date.replace("-", "/"));
		
//		split
		
		String test = "Hello_World_Test_Selenium";
		String testVal[] = test.split("_");
		for(String e:testVal) {
			System.out.println(e);
		}
		
		//concat
		
		String s2 = "care";
		String s3 = "s";
		System.out.println(s2.concat(s3));
		
//		contains
		
		System.out.println(s2.contains("hello"));
		

	}

}
