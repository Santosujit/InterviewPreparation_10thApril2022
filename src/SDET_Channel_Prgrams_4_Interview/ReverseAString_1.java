package SDET_Channel_Prgrams_4_Interview;

public class ReverseAString_1 {

	public static void main(String[] args) {
		
		String str = "ABCD";
		char a[] = str.toCharArray();
		String rev="";
		
		int len = a.length;
		
		for(int i=len-1;i>=0;i--) {
			rev = rev + a[i];
		}
		
		System.out.println("The reversed string is: "+rev);

	}

}
