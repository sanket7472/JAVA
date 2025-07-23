package OOP;

public class MethodChain 
{
	String origin;
	String type;
	int price;
	// implemented method chaining 
	// in this method is compulsory to return the referance of object
	// here this keyword is use to return the reference
	MethodChain()
	{}
	public MethodChain price()
	{
		System.out.println(price);
		return this ;
	}
	public MethodChain origin()
	{
		System.out.println(origin);
		return this ;
	}
	public MethodChain type()
	{
		System.out.println(type);
		return this ;
	}

	public MethodChain showDetails()
	{
		price();
		origin();
		type();
		return this ;
	}

}
