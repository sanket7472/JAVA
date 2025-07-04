package inheritance;

public class AeroplaneDriverSuper {


	public static void main(String[] args) {
		
		SukhoiSuper s1 = new SukhoiSuper("Air India", 210000, 4, 10, 10000, 5000 , 4 , 4, 4, 50000, "Fighter Plane", 
				"Petrol" , "Sukhoi-250", "Missiles", "India", "Air Space Security");
		
		s1.displayAeroplane();
		System.out.println("------------------------");
		s1.displayFighterPlaneSuper();
		System.out.println("------------------------");
		s1.displaySukhoiSuper();
	}
}
