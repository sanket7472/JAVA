package inheritance;

public class AeroplaneDriver {

	public static void main(String[] args) {
		
		Sukhoi s1 = new Sukhoi("Air India", 210000, 4, 10, 10000, 5000 , 4 , 4, 4, 50000, "Fighter Plane", 
				"Petrol" , "Sukhoi-250", "Missiles", "India", "Air Space Security");
		
		s1.displayAeroplane();
		System.out.println("------------------------");
		s1.displayFighterPlane();
		System.out.println("------------------------");
		s1.displaySukhoi();
	}
}
