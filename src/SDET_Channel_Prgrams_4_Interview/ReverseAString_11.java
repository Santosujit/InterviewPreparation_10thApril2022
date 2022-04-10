package SDET_Channel_Prgrams_4_Interview;

public class ReverseAString_11 {

	public static void main(String[] args) {
		
		String str="welcome to java";
		String[] words=str.split("\\s");//array containing welcome to java 
		
		for(String e:words) {//1st time it will fetch welcome, w will contain welcome 1st time
			String reversedWord="";
			StringBuilder sb= new StringBuilder(e);
			sb.reverse();
			reversedWord=reversedWord+sb.toString()+" ";
			System.out.print(reversedWord);
			
		}
		

	}

}
