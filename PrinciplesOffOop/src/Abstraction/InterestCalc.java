package Abstraction;

public abstract class InterestCalc {

	
	public InterestCalc() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void simpleInt(float principleAmt, float roi, float years);
	public abstract void compoundInd(float principleAmt, float roi, float years);
	
	public float pow(int pow ,float num){
		if (pow==0) {
			return 1;
		}
		return num*(pow(pow-1 ,num));
	}
}
