package opps_AbstractionEx;

public abstract class Container {
	

public  void calculateVolume(double length , double height){
		double volume = calculateAreaOfBase(length)*height;
		System.out.println("Volume " + volume);
	}


	public abstract double calculateAreaOfBase(double length);
	
	
	
	
}
