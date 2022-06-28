package interwiveProgram;
//Natural number >1
//Which has only 2 factors 1 and itself
// 19 => 1 and 19 => prime number
// 28 =>1,2,4,7,14,28 => Not a prime number

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=2;
		int count=0;
		
		if(num>1) 
		{
			for(int i=1 ; i<=num ; i++) 
			{
				if(num%1 ==0)
					count++;
			}
			
			if(count==2){
				System.out.println("Prime Number");
			}
			else {
				System.out.println("Not A Prime Number");
			}
			
			
		}
		
		else {
			System.out.println("Number is not natural number");
		}
	}

}
