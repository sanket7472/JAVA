package Abstraction;



public class InterestCalcImp extends InterestCalc{

	@Override
	public void simpleInt(float principleAmt, float roi, float years) {
		float interestAmt = (principleAmt * roi* years)/100 ;
		
		System.out.println("Your interest to "+ principleAmt +" for "+years + " years is  : "+interestAmt);
		
	}

	@Override
	public void compoundInd(float principleAmt, float roi, float years) {
		
		float amt = 1+ ((roi/1)/100);
		     
		amt = pow(2,amt); 
		
		amt *= principleAmt;
		
		System.out.println("Your compound interest to "+ principleAmt +" for "+years + " years is  : "+(amt-principleAmt));
		
	}

}
