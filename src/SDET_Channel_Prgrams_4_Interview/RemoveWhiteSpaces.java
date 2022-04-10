package SDET_Channel_Prgrams_4_Interview;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String s=" Santosujit Mohanty will join     Infosys ";
		String s1=s.replaceAll("\\s", "");
		System.out.println(s1);
	}

}
