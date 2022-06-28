package interwiveProgram;

import java.util.Scanner;

public class VowelsString {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a string");
//		String str=sc.nextLine();
		
		String str="SACHIN";
		char chars[]=str.toCharArray();
		
		int count=0;
		
		for(char c : chars) {
		
		switch(c) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			
			
			
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': 
			count++;
			break;
		}
		
	}
		System.out.println(count);
 }

}
