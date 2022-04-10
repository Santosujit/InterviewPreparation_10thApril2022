package ProgrammingQuestions;

//Fine the prime numbers between 20 and 50

public class PrimeNumbersInARange {

	public static void main(String[] args) {
		
		int low = 20;
		int high = 50;
		
		boolean flag = false;
		
		while(low < high) {
			for(int i = 2; i <= low; i++) {
				if((low % 2) == 0) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.println(low + " ");
			}
			
			low++;
		}

	}

}
