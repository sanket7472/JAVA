package arrays.twoDArray;

public class RoleBackDriver {

	public static void main(String[] args) {
		
		CommitRoleBack c1 = new CommitRoleBack();
		
		c1.addName("Sam");
		c1.remove("king");
		c1.remove("smith");
		c1.addName("Rani");
	//	c1.roleBack(3);
		c1.roleBack();
		c1.showDB();
		
	}
}
