package Abstraction;

public class AreaImp extends AreaOfShape {

	@Override
	public void areaOfCircle(double r) {
		
		System.out.println(3.14*r*r);
		
	}

	@Override
	public void areaOfRectangle(double l, double b) {
		
		System.out.println(l*b);
		
	}

	@Override
	public void areaOfSquare(double l) {
		
		System.out.println(l*l);
		
	}

	@Override
	public void areaOfParallelogram(double l, double h) {
		
		System.out.println(l*h);
		
	}

	@Override
	public void areaOfRhombus(double b, double h) {
		
		System.out.println(b*h);
		
	}

}
