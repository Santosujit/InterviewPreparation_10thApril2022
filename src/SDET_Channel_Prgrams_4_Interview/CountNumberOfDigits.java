package SDET_Channel_Prgrams_4_Interview;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		int num = 123456;
//		Elliminate the last digit by dividing by 10, and increase the count variable
		int count=0;
		while(num > 0) {
			num=num/10;
			count++;
		}
		System.out.println("The number of digits is: "+count);

	}

}
