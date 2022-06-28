package scannerExample;

import java.util.Scanner;

public class SwitchCaseScannerClass {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int day=scn.nextInt();
		
		System.out.println("You have enterd " + day);
		
switch(day){
		
		case 1:
		System.out.println("Sunday");
		break;
		
		case 2:
			System.out.println("Monday");
			break;
			
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			
			System.out.println("wednesday");
			break;
			
		case 5:
			System.out.println("thursday");
			break;
			
		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("Saturday");
			break;
			
			default:
				System.out.println("Invalid Entry");
				
		}

	}

}
