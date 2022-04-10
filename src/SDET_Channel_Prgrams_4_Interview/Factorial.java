package SDET_Channel_Prgrams_4_Interview;

public class Factorial {

	public static void main(String[] args) {
		
//		5! = 5*4*3*2*1
		
		int fact=1;
		int num=5;
		
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("The factorial of "+num+" is "+fact);

	}

}
