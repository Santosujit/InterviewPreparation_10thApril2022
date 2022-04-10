package ProgrammingQuestions;

public class ReverseAStringUsingForLoop {

	public static void main(String[] args) {
		
		String str ="madam";
		int len = str.length();
		char rs[] = str.toCharArray();
		String rev = "";
		for(int i=len-1; i>=0; i--) {
			rev=rev+rs[i];
			
		}
		System.out.println(rev);

	}

}
