package ProgrammingQuestions;

import java.util.stream.IntStream;

public class PrintWithoutLoop {

//	Print 1 to 100 without using loop concept
//	you can do by recursive function and Java stream

	public static void printNoLoop(int num) {
		if (num <= 100)
			System.out.println(num);
		num++;
		printNoLoop(num);
	}

	public static void printNoLoop1(int stNum, int endNum) {
		if (stNum <= endNum)
			System.out.println(stNum);
		stNum++;
		printNoLoop1(stNum, endNum);
	}

	public static void main(String[] args) {
		// printNoLoop(1);
		// printNoLoop1(1,100);

		IntStream.range(1, 101).forEach(e -> System.out.println(e));
//		we used a Integer Stream, used a foreach method

	}

}
