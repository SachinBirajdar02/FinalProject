package opps_AbstractionEx;

public class SqureContainer extends Container{

public double calculateAreaOfBase(double length) {
		
		double area=length*length*length;
		System.out.println("Area Of Square " + area);
		
		return area;
		
		
	}
}
