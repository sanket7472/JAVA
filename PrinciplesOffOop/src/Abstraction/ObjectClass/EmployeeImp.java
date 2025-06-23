package Abstraction.ObjectClass;

public class EmployeeImp extends Employee {
	
	

	public EmployeeImp(String name, String empID, double salary, int age, String position) {
		this.name = name;
		this.empID = empID;
		this.salary = salary;
		this.age = age;
		this.position = position;
	}

	@Override
	public void displayEmployee() {
		
		System.out.println("Employee Details");
		System.out.println("Name : "+name);
		System.out.println("Employee ID : "+empID);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee Position : "+position);
		
	}

	@Override
	public void updateName(String name) {
		this.name = name;
		
	}

	@Override
	public void updateSalary(double sal) {
		
		this.salary = sal;
		
		
	}

	@Override
	public void updatePosition(String newPos) {
		
		this.position = newPos;
		
	}
	public String toString()
	{
		return "Name : " + name +", Salary : "+salary+", Employee ID : "+empID+", Position : "+position;
	}
	
	public boolean equals(Object o )
	{
		EmployeeImp s = (EmployeeImp) o;
		if (this.name == s.name && this.salary == s.salary && this.empID == s.empID 
				&& this.position == s.position ) {
			return true;
		}
		return false;
	}

}
