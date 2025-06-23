package Abstraction.ObjectClass;

public abstract class Employee {

	String name;
	String empID;
	double salary;
	int age;
	String position;
	
	
	public Employee() {
		super();
	}

	
	public abstract void displayEmployee();
	
	public abstract void updateName(String name);
	public abstract void updateSalary(double sal);
	public abstract void updatePosition(String newPos);
	
	
	

	
	
}
