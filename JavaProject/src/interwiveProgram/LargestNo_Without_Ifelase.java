package interwiveProgram;

public class LargestNo_Without_Ifelase {

	public static void main(String[] args) {
		
		int x=40;
		int y=20;
		int z=50;
		
		int largestNumber=x>y?x:y;
		System.out.println(largestNumber);
		
		int largest=(x>y) ? (x>z ? x:z) : (y>z ? y:z);
		System.out.println(largest);
		
		
	}

}
