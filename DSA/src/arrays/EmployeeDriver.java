package arrays;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		EmployeeDB ref = new EmployeeDB("Scott", "tiger");
		
		ref.login("Scott", "tiger");
		
		ref.addEmployee("Sam",  01, 20, -1, "10/10/12", 25000, 0, "Developer");
		ref.addEmployee("Smith", 7369, 20, 7902, "17/12/1980", 800, 0, "Clerk");
		ref.addEmployee("Allen", 7499, 30, 7698, "20/02/1981", 1600, 300, "Salesman");
		ref.addEmployee("Ward", 7521, 30, 7698, "22/02/1981", 1250, 500, "Salesman");
		ref.addEmployee("Jones", 7566, 20, 7839, "02/04/1981", 2975, 0, "Manager");
//		ref.addEmployee("Martin", 7654, 30, 7698, "28/09/1981", 1250, 1400, "Salesman");
//		ref.addEmployee("Blake", 7698, 30, 7839, "01/05/1981", 2850, 0, "Manager");
//		ref.addEmployee("Clark", 7782, 10, 7839, "09/06/1981", 2450, 0, "Manager");
//		ref.addEmployee("Scott", 7788, 20, 7566, "19/04/1987", 3000, 0, "Analyst");
//		ref.addEmployee("King ", 7839, 10, -1, "17/11/1981", 5000, 0, "President");
//		ref.addEmployee("Turner", 744, 30, 7698, "08/09/1981", 1500, 0, "Salesman");
//		ref.addEmployee("Admas", 7876, 20, 7788, "23/05/1981", 1100, 0, "Clerk");
//		ref.addEmployee("James", 7900, 30, 7698, "03/12/1981", 950, 0, "Clerk");
//		ref.addEmployee("Ford", 7902, 20, 7566, "03/12/1981", 3000, 0, "Analyst");
//		ref.addEmployee("Miller", 7934, 10, 7785, "23/01/1982", 1300, 0, "Clerk");
		
		
		//ref.showDB();
		ref.addEmployee("Jones", 7566, 20, 7839, "02/04/1981", 2975, 0, "Manager");
		System.out.println();
		System.out.println();
		System.out.println();
		//ref.removeByEmpId(7521);
		//ref.showDB();
		ref.addEmployee("Miller", 7934, 10, 7785, "23/01/1982", 1300, 0, "Clerk");
		ref.showDB();
		System.out.println();
		System.out.println();
		System.out.println();
	
		//ref.removeByName("Ward");
	//	ref.commit();
		//ref.roleBack(1);
		ref.removeByEmpId(7521);
		ref.showDB();
		System.out.println();
		System.out.println();
		System.out.println();
		ref.commit();
		ref.roleBack(1);
		ref.showDB();
		
		//ref.searchByJob("Salesman");
		
		//ref.searchByManager("blake");
		
		//ref.searchSalary(1000, '<');

		//ref.searchByCommission();
		
		//ref.employWithoutMng();
		
		//ref.maxSal();
		
		//ref.secMaxSal();
	}
}

