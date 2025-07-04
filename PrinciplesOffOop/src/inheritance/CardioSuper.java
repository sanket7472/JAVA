package inheritance;

public class CardioSuper extends Doctor {

	String organ;
	String spl;
	
	public CardioSuper() {}
	
	public CardioSuper(String name, double fees,String degree, int exp, String hospital, String organ, String spl ) {
		
		super(name, fees, degree, exp, hospital );
//		this.name = name;
//		this.fees = fees;
//		this.degree = degree;
//		this.exp = exp;
//		this.hospital = hospital;
		
		this.organ = organ;
		this.spl = spl;
	}
	
	public void displayCardioSuper() {
		
		displayDoctor();
		
		System.out.println(organ);
		System.out.println(spl);

	}
}
