class Swap 
{
	public static void main(String[] args) 
	/*{
		int a = 10;
		int b = 20;
		System.out.println("BEFORE SWAP");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		int temp = a;
		a=b;
		b=temp;
		System.out.println("AFTER SWAP");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}*/
	{
		int a=2;
		int b=4;
		System.out.println("BEFORE SWAP");
		System.out.println("A = " + a);
		System.out.println("B = " + b);

		a=a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("AFTER SWAP");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}
}
