package multipleInheritance;

public class InstaDriver {

	public static void main(String[] args) {
		Instagram.message("Raju");
		Instagram i1 = new InstaImp2("Raju","Raju@123");
		
		i1.post("I am Happy");
		i1.comment("Anna", "Good");
		i1.like("Anna");
		i1.message("Anna", "Thnx for like");
		i1.message("Raju", "mention not");
		
	
	}
}
