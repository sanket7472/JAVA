package arrays.twoDArray;

import java.util.Arrays;

public class CommitRoleBack {

	String []db = {"Smith","King", "Raju","Scott","Turner"};
	
	String [][] savepoint = new String [10][];
	
	static int savePointIndex = 0;
	
	
	public boolean remove(String name) {
		
		int i = 0;
		while (i<db.length) {
			if (db[i].equalsIgnoreCase(name)) {
				break;
			}
			i++;
		}
		
		if (i<db.length) {
			
			String [] temp = new String [db.length-1];
			for (int j = 0; j < db.length; j++) {
				if (j<i) {
					temp[j]=db[j];
				}
				else if (j>i) {
					temp[j-1]=db[j];
				}
			}
			savepoint [savePointIndex] = db;
			savePointIndex++;
			db=temp;
			System.out.println(name + " Removed...!");
			return true;
		}
		return false;
	}
	
	public boolean addName(String name) {
		
		String [] temp = new String [db.length+1];
		for (int i = 0; i < db.length; i++) {
			temp[i]=db[i];
		}
		temp[temp.length-1]=name;
		savepoint [savePointIndex] = db;
		savePointIndex++;
		db=temp;
		System.out.println(name+" Added..!");
		return true;
		
	}
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
	public void roleBack() {
			if (savePointIndex != 0) {
				
				db = savepoint[0];
			}
			else
			{
				System.out.println("Nothing to roleback...!");
			}

}
	
	public void showDB() {
		System.out.println(Arrays.toString(db));
	}
}
