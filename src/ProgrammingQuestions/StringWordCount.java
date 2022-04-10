package ProgrammingQuestions;

public class StringWordCount {
	
//	Get the count of total words in a given capitalised String
	

	public static void main(String[] args) {
		
		String str = "NaveenAutomationLabsYoutube";//4 should be written
		
//		Logic: get every character, compare if it is capital, then if Yes then increase the count
		int count = 0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		
		System.out.println(count);
		
		

	}

}
