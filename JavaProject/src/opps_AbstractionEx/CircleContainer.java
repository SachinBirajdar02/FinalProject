package opps_AbstractionEx;

public class CircleContainer extends Container{

	
	public double calculateAreaOfBase(double length) {
		
		double area= Math.PI* length/2 * length/2;
		System.out.println("Area of circle " + area );
		
		return length;
	
	}
	
	
}
