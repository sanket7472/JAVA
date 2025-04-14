package Encapsulation;

public class MobileDriver {
	
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("Samsung", "S 25", 150000, 8, 128);
		
		System.out.println(m1.getBrand());
		System.out.println(m1.getRom());
		
		m1.setRom("Samsung", "S 25", 128);
		System.out.println(m1.getRom());
		
		//m1.s.getServiceProvider(); /// java.lang.NullPointerException
		
		// here we not inserted any sim in mobile object m1 thats why we get  NullPointerException
		
		
		m1.insertSim("Jio", "5G", "Prepaid", 987654321l);
		m1.s.getSimDetails();
		
	}
}
