package SDET_Channel_Prgrams_4_Interview;

public class SumOfElementsOfArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("The sum of the elements in the array is: "+sum);
	}

}
