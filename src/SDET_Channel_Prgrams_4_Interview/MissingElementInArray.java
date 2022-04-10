package SDET_Channel_Prgrams_4_Interview;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,5,6};
//		1st calculate the sum from 1 to 6, then calculate sum of the elements in the array, subtract
		
		int sum1=0;
		for(int i=1;i<=6;i++) {
			sum1=sum1+i;
		}
		System.out.println("Sum of the range: "+sum1);
		
		int sum2=0;
		for(int i=0;i<a.length;i++) {
			sum2=sum2+a[i];
		}
		System.out.println("Sum of all the elements in the array is: "+sum2);
		System.out.println("The missing number is: "+(sum1-sum2));
		

	}

}
