package OOP;

public class MethodChainDriver 
{
	public static void main(String[] args) 
	{
		MethodChain m1 = new MethodChain();

		m1.origin = "Ratnagiri";
		m1.type = "Hapus";
		m1.price = 2000;

		m1.price().origin().type();
	}
}
