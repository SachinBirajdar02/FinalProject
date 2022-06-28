package interwiveProgram;

public class ReversString {

	public static void main(String[] args) {
		
		String str="ABCDEFGHIJ";
      	String rev="";
		
//		int len=str.length();
//		
//		for(int i=len-1; i>=0 ; i--) {
//			
//			rev=rev+str.charAt(i);
//		}
//		System.out.println("Revers String :" + rev);
		
//      2. Using character array
		char a[]=str.toCharArray();
		int len=a.length;
		for(int i=len-1 ; i>=0 ; i--) {
		rev=rev+a[i];	
		}
		System.out.println("Revers String :" + rev);
		
//      3. Using StringBuffer class		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());

		
	}

}
