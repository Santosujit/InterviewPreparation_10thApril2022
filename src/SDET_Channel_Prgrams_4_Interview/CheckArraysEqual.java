package SDET_Channel_Prgrams_4_Interview;

import java.util.Arrays;

public class CheckArraysEqual {

	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {1,2,3,4,5,6};
		
		boolean status = Arrays.equals(a1, a2);
		if(status) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}

	}

}
