package ProgrammingQuestions;

//Java Program to find Smallest Number in an Array
//Sort the Array in Ascending order, and return the 1st element
//How to sort an Array using for loop

public class SmallestInArrayExample_JavatPoint {

	public static void main(String[] args) {

		int a[] = { 1, 2, 5, 6, 3, 2 };
		int temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] > a[j]) {
					//swap
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		System.out.println("The smallest Number in the array is: "+a[0]);

	}

}
