package count;


import java.util.Scanner;


public class Count {
	public static void main(String args[]) {
		
	
	System.out.println("Enter the String");
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();

	int digit=0;
	int alphabet=0;
	int specialChar=0;
	int whiteSpace=0;
	
	
	for(int i=0;i<a.length();i++) {
		char ch=a.charAt(i);
		
		if(Character.isAlphabetic(ch)){
			alphabet++;}
		
			else if(Character.isDigit(ch)) {
				digit++;
			}
			else if(Character.isWhitespace(ch)) {
				whiteSpace++;
		}else {
			specialChar++;
			
		}
	}		
	System.out.println("No of Alphabets "+alphabet);
	System.out.println("No of Digits "+digit);
	System.out.println("No of Whitespace "+specialChar);
	System.out.println("No of Special character "+whiteSpace);
	
	
	}

	
	
	}
	

				
				
				
				
				
				
				
				
				
				
				
		
				
				
				
				
				
				
				
				
				
