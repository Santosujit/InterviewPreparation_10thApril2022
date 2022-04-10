package SDET_Channel_Prgrams_4_Interview;

public class FibonacciSeries {

	public static void main(String[] args) {
		
//		0 1 1 2 3 5 8 13 This is a fibonacci series
//		first two numbers are 0 1
//		every number is the sum of preceding two numbers
		
		int n1=0,n2=1,sum=0;
		System.out.print("The fibonacci numbers are: "+n1+" "+n2);
		
		for(int i=0;i<10;i++) {
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}

	}

}
