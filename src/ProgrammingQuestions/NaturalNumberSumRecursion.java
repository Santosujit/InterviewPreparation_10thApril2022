package ProgrammingQuestions;

//Find the sum of natural numbers using recursion
//Recursion means one method calling the same method
//So we have to create a method 1st

public class NaturalNumberSumRecursion {

	public static void main(String[] args) {
		int num = 6;
		int sum = addNum(num);
		System.out.println("Sum is: "+sum);
		

	}
	
	public static int addNum(int num) {
		if(num != 0) {
			return num+addNum(num-1);
		}
		else {
			return num;
		}
	}

}
