package Abstraction.ObjectClass;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee e1 = new EmployeeImp("Ganesh", "emp2025", 55000, 25, "Backend Developer");
		Employee e2 = new EmployeeImp("Ganesh", "emp2025", 55000, 25, "Backend Developer");
		
		//e1.displayEmployee();
		e1.updateName("Rohit");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("----------------------------------------------------");
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}
}
