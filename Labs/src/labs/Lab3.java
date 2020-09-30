package labs;

public class Lab3 {

	public static void main(String[] args) {
		
		System.out.println(charRemove("Averange"));
		System.out.println( dupRemove("letters"));
		vowelConsonantCounter("mississippi");
		System.out.println(nonRepeatFirst("morning"));
		
		
		
		
	}
	// Write a method to remove a given character from a string. 
	//E.g. remove all 'a' from Averange should return vernge
	public static String charRemove(String a) {
		a = a.toLowerCase();
		String removeLetter = a.replaceAll("a", "");
		return removeLetter;
		
	}
	
	//Write a method to remove duplicate characters from a string
	public static String dupRemove(String word) {
		String result = "";
		for(int i = 0; i < word.length(); i++) {
			char outerLetter = word.charAt(i);
			for(int j =0; j< word.length();j++) {
				char innerLetter = word.charAt(j);
				if(i!=j) {
					if(outerLetter == innerLetter) {
						break;
					}
				}
				if(j==(word.length()-1)) {
					result = result + outerLetter;
				}
			}
		}
		return result;
		
	}
	
	//Write a program to count the number of vowels and consonants in a string. 
	//E.g. if the input is Java the result should be 2 vowels and 2 consonants .
	
	public static String vowelConsonantCounter(String word) {
		int numVowels = 0;
		int numConsonants = 0;
		char ch;
		for (int i = 0;i<word.length();i++) {
			ch = word.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				numVowels++;	
			}
			else if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u') {
				numConsonants++;
			}
			
		}
		System.out.println("Number of Vowels: "+numVowels);
		System.out.println("Number of Consonats: "+numConsonants);
		
		
		return word;
	}
	
	//Write a program to display first non repeated character of a string then the repeating characters. 
	//E.g. input morning should display morignn.
	
	public static String nonRepeatFirst(String word) {
		String newWord = "";
		String newWord2 = "";
		for(int i=0;i<word.length();i++) {
			
			char innerLetter = word.charAt(i);
			
			for(int j = 0;j<word.length();j++) {
				
				char outerLetter = word.charAt(j);
				
				if(i!=j) {
					
					if(innerLetter == outerLetter) {
						
						newWord2 = newWord2 + outerLetter;
						
						break;
					}
				}
				if(j==(word.length())-1) {
					newWord = newWord + innerLetter;
					
					
				}
				
			}
			
		}   
			
		
		
		return newWord + newWord2;
		
	}
	
	



}
