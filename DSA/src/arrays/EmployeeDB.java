package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class EmployeeDB {

	private String user;
	private String pass;
	
	private boolean connect;
	
	private Employee [] db = new Employee[10];
	private int index;
	private int count;
	
	Employee [][] savepoint = new Employee [10][];
	
	static int savePointIndex = 0;
	
	public EmployeeDB(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
		System.out.println("DB Created...!");
	}
	
	public void login(String user,String pass) {
		
		if (this.user.equals(user) && this.pass.equals(pass)) {
			
			connect = true;
			System.out.println("Database connected.....!");
		}
		else {
			System.out.println(" Login credentials not matched....!");
		}
		
	}
	public boolean isEmployee(String name) {
		for (int i = 0; i < count; i++) {
			
			if (db[i].name.equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean addEmployee(String name, int empId, int deptId, int managerNo, String hireDate, double sal, double comn,
			String job) {
		if (connect && count < 0.75*db.length) {
			
			savepoint [savePointIndex] = db;
			savePointIndex++;
			
			db[index]= new Employee(name, empId, deptId, managerNo, hireDate, sal, comn, job);
			index++;
			count++;
			
			//System.out.println("Added new Employee ");
			return true;
		}
		else if (connect) {
			
			Employee [] temp = new Employee[db.length*2];
			for (int i = 0; i < db.length; i++) {
				
				temp[i]=db[i];
			}
			db=temp;
			savepoint [savePointIndex] = db;
			savePointIndex++;
			
			db[index]= new Employee(name, empId, deptId, managerNo, hireDate, sal, comn, job);
			index++;
			count++;
			//System.out.println("Added new Employee ");
			return true;
			
		}
		return false;
	}
	
	public void showDB() {
		if (connect) {
			
			for (int i = 0; i < count; i++) {
		
					System.out.println(db[i]);
				
				
			}
		}
		else {
			System.out.println("Database not connected.!");
		}
	}
	
	public void searchByDept(int deptId) {
	if (connect) {
			
			for (int i = 0; i <count; i++) {
				if (db[i].deptId == deptId) {
					System.out.println(db[i]);
				}
				
			}
		}
		else {
			System.out.println("Database not connected.!");
		}
	}
	
	public void searchByJob(String job) {
	if (connect) {
			
			for (int i = 0; i <count; i++) {
				if (db[i].job.equalsIgnoreCase(job)) {
					System.out.println(db[i]);
				}
				
			}
		}
		else {
			System.out.println("Database not connected.!");
		}
	}

	public void searchByManager(String manager) {
	if (connect) {
		if (isEmployee(manager)) {
			int id = 0;
			for (int i = 0; i < count; i++) {
				if (db[i].name.equalsIgnoreCase(manager)) {
					id = db[i].empId;
					break;
				}
			}
			for (int i = 0; i < count; i++) {
				if ( db[i].managerNo == id) {
					System.out.println(db[i]);
				}
			}
		}
		}
		else {
			System.out.println("Database not connected.!");
		}
	}
	
	public void searchSalary(int sal , char ch) {
		
		switch (ch) {
		case '<': 
			for (int i = 0; i < count; i++) {
				if (db[i].sal< sal) {
					System.out.println(db[i]);
				}
			}
			break;
		case '>': 
			for (int i = 0; i < count; i++) {
				if (db[i].sal > sal) {
					System.out.println(db[i]);
				}
			}
			break;
		case '=': 
			for (int i = 0; i < count; i++) {
				if (db[i].sal == sal) {
					System.out.println(db[i]);
				}
			}
			break;

		default:
			System.out.println("Invalid relational operator ");
			break;
		}
	}
	
	public void searchByCommission() {
		for (int i = 0; i < count; i++) {
			if (db[i].comn > 0) {
				System.out.println(db[i]);
			}
		}
	}
	
	public void employWithoutMng() {
	
		for (int i = 0; i < count; i++) {
			if (db[i].managerNo<0) {
				System.out.println(db[i]);
			}
		}
	}
	
	public void maxSal() {
		int i = 0;
		double max=0;
		for (int j = 0; j < count; j++) {
			if (max<db[j].sal) {
				max = db[j].sal;
				i=j;
			}
		}
		System.out.println(db[i]);
		
	}
	public void secMaxSal() {
		int i = 0;
		double max=0;
		double secMax = 0;
		for (int j = 0; j < count; j++) {
			if (max < db[j].sal) {
				secMax = max;
				max = db[j].sal;
				i=j;
			}else if (secMax < db[j].sal && db[j].sal != max) {
				
				secMax = db[j].sal;
				i=j;
			}
		}
		System.out.println(db[i]);
		
	}
	

//	public boolean removeByAtrri(double val, String attri) {
//		
//		switch (attri) {
//		case "empId": {
//			return removeByEmpId(val);
//		}
//		case "deptId": {
//			return removeByDeptId(val);
//		}
//		case "managerNo": {
//			return removeByDeptId(val);
//		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + attri);
//		}
//	}
//	
	public boolean removeByName(String name) {
		
		int i = 0;
		while (i<count) {
			if (db[i].name.equalsIgnoreCase(name)) {
				
				break;
			}
			i++;
		}
		if (i<count) {
			Employee[] temp = new Employee [count-1];
			
			for (int j = 1; j <count; j++) {
				if (j<i) {
					temp [j-1] = db[j-1];
				}
				else if (j>i) {
					temp [j-1] = db[j];
				}
			}
			savepoint [savePointIndex] = db;
			savePointIndex++;
			db= temp;
			count = count-1;
		}
		return i<count;
		
	}
	public boolean removeByEmpId(double id) {
		//System.out.println(Arrays.toString(db));
		int i = 0;
		while (i<count) {
			if (db[i].empId == id) {
				
				break;
			}
			i++;
		}
		if (i<count) {
			Employee[] temp = new Employee [count-1];
			
			for (int j = 0; j <count; j++) {
				if (j<i) {
					temp [j] = db[j];
				}
				else if (j>i) {
					temp [j-1] = db[j];
				}
			}
			savepoint [savePointIndex] = db;
			savePointIndex++;
			db= temp;
			count = count-1;
		}
		return i<count;
		
	}

//	public boolean removeByDeptId(double id) {
//		
//		int i = 0;
//		while (i<count) {
//			if (db[i].deptId == id) {
//				
//				break;
//			}
//			i++;
//		}
//		if (i<count) {
//			Employee[] temp = new Employee [count-1];
//			
//			for (int j = 0; j <count; j++) {
//				if (j<i) {
//					temp [i] = db[i];
//				}
//				else if (j>i) {
//					temp [i] = db[i];
//				}
//			}
//			savepoint [savePointIndex] = db;
//			savePointIndex++;
//			db= temp;
//		}
//		return i<count;
//		
//	}
//
	public boolean commit() {
	Arrays.fill(savepoint, null);
	savePointIndex=0;
	return true;
	}
	
	public void roleBack(int steps) {
		
		if (steps>0 && steps<=10) {
			
			if (savePointIndex != 0) {
				
				db = savepoint[savePointIndex-steps];
			}
			else
			{
				System.out.println("No save Point available..");
			}
		}
		else {
			System.out.println("Invalid RoleBack count..!");
		}
		
	}
	
	
	
	
	
}
