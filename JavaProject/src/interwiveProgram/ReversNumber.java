package interwiveProgram;

import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
//		int num=123456;
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		
		System.out.println("Reverse Nimber " + rev);
		
		
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev2=sb1.reverse();
		
		System.out.println("Revers number  " + rev2);

	}

}
