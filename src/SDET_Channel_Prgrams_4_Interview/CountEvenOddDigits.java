package SDET_Channel_Prgrams_4_Interview;

public class CountEvenOddDigits {
	
//	Count the no of even and odd digits in a number

	public static void main(String[] args) {
		
		int num = 12345;
		int even_count=0;
		int odd_count=0;
		
//		To get the last digit of any number do number%10
//		To elliminate the last digit of any number do number=number/10
		
//		Get the last digit of the number, find it whether it is even or odd
//		Then elliminate that last digit
		
		while(num > 0) {
			int rem = num%10;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			
			num=num/10;
		}
		System.out.println("The number of even digits present in the number is: "+even_count);
		System.out.println("The number of odd digits present in the number is: "+odd_count);
		
		

	}

}
