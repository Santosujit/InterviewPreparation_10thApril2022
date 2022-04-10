package ProgrammingQuestions;

public class Practice {

	public static void main(String[] args) {
		
		String str = "Alice is girl and Bob is boy";
		  
//        Map<String, Integer> hashMap = new HashMap<>();
  
        String[] words = str.split(" ");
        for(String e: words) {
        	System.out.println(e);
        }

	}

}
