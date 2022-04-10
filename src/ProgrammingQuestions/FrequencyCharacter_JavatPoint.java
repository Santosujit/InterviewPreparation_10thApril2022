package ProgrammingQuestions;

//Java Program to find the frequency of characters

//To accomplish this task, we will maintain an array called freq with same size of the length of the string. 
//Freq will be used to maintain the count of each character present in the string. 
//Now, iterate through the string to compare each character with rest of the string. 
//Increment the count of corresponding element in freq. 
//Finally, iterate through freq to display the frequencies of characters.

public class FrequencyCharacter_JavatPoint {

	public static void main(String[] args) {

		String str = "picture perfect";   
//		one for loop is required to iterate the String from i=0
//		another inner for loop is needed to iterate from j=i+1
//		the inner for loop will compare each and every elements of the array with the 0th element of the array
//		frequency array will store the frequency of each element
		
		char mainArray[] = str.toCharArray();	
		
		 int freq[] = new int[str.length()];
		
		for(int i=0;i<mainArray.length;i++) {
			freq[i] = 1;
			for(int j=i+1;j<mainArray.length;j++) {
				if(mainArray[i]==mainArray[j]) {
					freq[i]++;
					mainArray[j] = '0';    
				}
			}
			
			//Displays the each character and their corresponding frequency    
	        System.out.println("Characters and their corresponding frequencies");    
	        for(i = 0; i <freq.length; i++) {    
	            if(mainArray[i] != ' ' && mainArray[i] != '0')    
	                System.out.println(mainArray[i] + "-" + freq[i]);    
	        }    
		}


	}

}
