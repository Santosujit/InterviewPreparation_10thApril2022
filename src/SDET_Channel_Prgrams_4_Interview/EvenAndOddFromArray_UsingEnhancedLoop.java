package SDET_Channel_Prgrams_4_Interview;

public class EvenAndOddFromArray_UsingEnhancedLoop {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		System.out.println("Even numbers are: ");
		for(int e:a) {
			if(e%2==0)
				System.out.println(e);
		}
		
		System.out.println("Odd numbers are: ");
		for(int e:a) {
			if(e%2!=0)
				System.out.println(e);
		}

	}

}
