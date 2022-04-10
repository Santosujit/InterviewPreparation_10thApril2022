package ProgrammingQuestions;

//You have to use multiple if statements

public class LeapYearOrNot {

	public static void main(String[] args) {
		
//		Find a year whether it is a leap year or not
		
//		A century year is a year which ends with double 0 (00), so divisible by 100
//		To be leap year a century year has to be divisible by 400
//		for any normal year which is not a century year, if it is divisble by 4, then it is a leap year
//		1900 is not a leap year, but 2012 is a leap year
		
		int year = 2020;
		boolean leap = false;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {//logic to find out century year
				if(year % 400 == 0) {
					leap = true;
				}
				else {
					leap = false;
				}
			
			}
			else {
				leap = true;
			}
			
		}
		else {
			leap = false;
		}
		if(leap) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
	}

}
