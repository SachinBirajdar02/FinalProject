package interwiveProgram;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a charector");
//		
//		char c =sc.next().charAt(0);
		
		char c ='A';
		
		boolean isVowel=false;
		
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
		case 'U': isVowel=true;
		
		}
		
		if(isVowel) {
			System.out.println(c + " is a vowel");
		}
		else {
			System.out.println(c + " is a Not vowel");
		}
		

	}

}
