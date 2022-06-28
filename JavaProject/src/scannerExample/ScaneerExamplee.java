package scannerExample;

import java.util.Scanner;

public class ScaneerExamplee {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int userInput = scn.nextInt();
		System.out.println("User entered: " + userInput);
		
		
		
		
		System.out.println("Enter a string");
		scn.nextLine();
		String strInpur=scn.nextLine();
		
		
		String strInput=scn.next();
		
		
		System.out.println("Charector ; " + strInput.charAt(1));
		char charInput= scn.next().charAt(1);
		

	}

}
