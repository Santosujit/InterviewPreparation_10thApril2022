package ProgrammingQuestions;

public class AlphabetPattern_Part2 {

	public static void main(String[] args) {
		
//		Create below pattern
//		
//		A
//		B B
//		C C C
//		D D D D
//		E E E E E 
//		F F F F F F
		
//		There are 6 rows and 6 columns
//		Rows and Columns values are increasing in both
//		j is totally dependent upon i
		
		int alpha = 65;
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)alpha+" ");
			}
			alpha++;
			System.out.println();
			
		}
	}

}
