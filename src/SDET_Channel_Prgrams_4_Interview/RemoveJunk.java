package SDET_Channel_Prgrams_4_Interview;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s= "#@%$^&*Santosujit Mohanty+_(*^$#";
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
