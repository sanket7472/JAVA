package Abstraction;

public class InterestDriver {

	public static void main(String[] args) {
		
		InterestCalc i1 = new InterestCalcImp();
		
		i1.simpleInt(10000, 5, 5);
		i1.compoundInd(10000, 5, 5);
	}
}
