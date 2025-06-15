

package inheritance;

public class Orthologist extends Doctor {

	String organ;
	String spl;
	
	public Orthologist() {}
	
	public Orthologist(String name, double fees,String degree, int exp, String hospital, String organ, String spl ) {
		
		this.name = name;
		this.fees = fees;
		this.degree = degree;
		this.exp = exp;
		this.hospital = hospital;
		
		this.organ = organ;
		this.spl = spl;
	}
	
	public void displayOrthologist() {
		
		displayDoctor();
		
		System.out.println(organ);
		System.out.println(spl);

	}
}
