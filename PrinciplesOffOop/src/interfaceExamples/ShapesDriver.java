package interfaceExamples;

public class ShapesDriver {

	public static void main(String[] args) {
		
		Shapes s1 = new ShapesImp();
		
		s1.areaOfCicle(10);
		s1.areaOfSquare(15);
		s1.perimeterOfCIrle(10);
		s1.perimeterOfSquare(15);
	}
}
