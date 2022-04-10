package SDET_Channel_Prgrams_4_Interview;

public class SumOfElementsOfArray_UsingEnhancedForLoop {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int sum=0;
		for(int e:a) {
			sum=sum+e;
		}
		System.out.println("The sum of the elements in the array is: "+sum);

	}

}
