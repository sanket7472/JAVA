package OOP;

public class AreaOfCircle {

	static double pi = 22.0/7.0;

	double r ;
	public AreaOfCircle(double r) {
		
		super();
		this.r = r;
	}
	
	public void areaofCircle() {
		
		System.out.println("Area of circle : "+ (pi*r*r));
	}
	
	
}
