package encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee kiran = new Employee();
		
		kiran.setSalary(1000000);
		kiran.bonus = 20000;
		kiran.calculateTotalPay();

	}

}
