package OOP;

public class NonStatStateDriver 
{
	public static void main(String[] args) 
	{
		NonStatState ns1 = new NonStatState();
		ns1.type = "Formal";
		ns1.size = 9;
		ns1.price = 1000.0;

		ns1.showDetails();
	}
}
