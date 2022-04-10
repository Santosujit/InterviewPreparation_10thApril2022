package ProgrammingQuestions;

//Average of all the elements of an Array
//sum of all elements of the array divided by the length of the array

public class ArrayAverage {

	public static void main(String[] args) {
		
		int num[] = {1,2,3};		
		int sum = 0;
		
		for(int i=0;i<num.length;i++) {
			sum = sum+num[i];
		}
		System.out.println("Average is: "+(sum/num.length));
	}

}
