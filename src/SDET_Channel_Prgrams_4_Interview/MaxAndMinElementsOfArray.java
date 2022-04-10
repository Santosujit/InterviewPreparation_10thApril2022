package SDET_Channel_Prgrams_4_Interview;

import java.util.Arrays;

public class MaxAndMinElementsOfArray {

	public static void main(String[] args) {
		
		int a[]= {10,45,90,100,400,24};
		
//		Approach1
//		Arrays.sort(a);
//		System.out.println("The largest element in the array is: "+a[a.length-1]);
//		System.out.println("The smallest element in the array is: "+a[0]);
		
//		Approach2
		
		int max=10;
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("The largest element in the array is: "+max);
		
		int min=10;
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}

		System.out.println("The smallest element in the array is: "+min);
	}

}
