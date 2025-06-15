
package inheritance;

public class Neurologist extends Doctor {

	String organ;
	String spl;
	
	public Neurologist() {}
	
	public Neurologist(String name, double fees,String degree, int exp, String hospital, String organ, String spl ) {
		
		this.name = name;
		this.fees = fees;
		this.degree = degree;
		this.exp = exp;
		this.hospital = hospital;
		
		this.organ = organ;
		this.spl = spl;
	}
	
	public void displayNeurologist() {
		
		displayDoctor();
		
		System.out.println(organ);
		System.out.println(spl);

	}
}
