package SDET_Channel_Prgrams_4_Interview;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumberGeneration {

	public static void main(String[] args) {
		
//		Use Random class
		Random rand = new Random();
//		int rand_int=rand.nextInt(1000);It will generate randon numbers between 1 to 999
//		System.out.println(rand_int);
		
//		double rand_decimal=rand.nextDouble();//It will generate decimal numbers between 0.0 to 1.0
//		System.out.println(rand_decimal);
		
//		Using Math class
		
//		System.out.println(Math.random());
		
//		Using Apache Commons Lang API
		
//		String randNumber=RandomStringUtils.randomNumeric(10);//10 digit Random number
//		System.out.println(randNumber);
//		
		String random_string=RandomStringUtils.randomAlphabetic(5);//5 character random string
		System.out.println(random_string);

	}

}
