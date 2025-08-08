package interfaceExamples;

public class ShapesImp implements Shapes {

	@Override
	public void areaOfCicle(int rad) {
	
		double area = pi * (rad*rad);
		
		System.out.println("Area of Circle : "+area);
		
	}

	@Override
	public void perimeterOfCIrle(int rad) {
	
		double peri = 2*pi*rad;
		System.out.println("Perimeter of Circle : "+peri);
		
	}

	@Override
	public void areaOfSquare(int side) {
		
		double area = side * side;
		
		System.out.println("Area of Square : "+area);
		
	}

	@Override
	public void perimeterOfSquare(int side) {
		
		System.out.println("Perimeter of Square : "+(4*side));
		
	}

}
