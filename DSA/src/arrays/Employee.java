package arrays;

public class Employee {

	String name;
	int empId;
	int deptId;
	int managerNo;
	String hireDate;
	double sal;
	double comn;
	String job;
	

	public Employee(String name, int empId, int deptId, int managerNo, String hireDate, double sal, double comn,
			String job) {
		super();
		this.name = name;
		this.empId = empId;
		this.deptId = deptId;
		this.managerNo = managerNo;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comn = comn;
		this.job = job;
	}


	@Override
	public String toString() {
		return "[name=" + name + ", empId=" + empId + ", deptId=" + deptId + ", managerNo=" + managerNo
				+ ", hireDate=" + hireDate + ", sal=" + sal + ", comn=" + comn + ", job=" + job + "]";
	}
	
	
}
