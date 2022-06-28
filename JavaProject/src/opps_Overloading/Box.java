package opps_Overloading;

public class Box {

	void calculateArea(int length){
		System.out.println("Area " + (length*length));	
		}

		
		void calculateArea(double length){
			System.out.println("Area " + (length*length));	
			}
		
		
		void calculateArea(int length , int breadth){
			System.out.println("Area " + (length*breadth));	
			
			}
		
}
