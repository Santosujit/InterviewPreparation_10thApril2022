package SDET_Channel_Prgrams_4_Interview;

public class CountSumOfDigits {

	public static void main(String[] args) {
		
		int num = 12345;
		int sum = 0;
		
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("The sum of the digits present in the number is: "+sum);

	}

}
