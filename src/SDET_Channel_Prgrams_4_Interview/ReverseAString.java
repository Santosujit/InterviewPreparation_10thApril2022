package SDET_Channel_Prgrams_4_Interview;

public class ReverseAString {

	public static void main(String[] args) {
		
		String str = "ABCD";
		String rev = "";
		int len = str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("The reversed string is "+rev);
	}

}
