package encapsulation;

public class Employee {

	private double salary;
	double bonus;
	

	public void setSalary(double salary) {
		this.salary = salary;
	
	}


	void calculateTotalPay(){
		double totalPay = salary + bonus;
		System.out.println("Total Pay = " + totalPay);
		}
}
