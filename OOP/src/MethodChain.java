class MethodChain 
{
	String origin;
	String type;
	int price;

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
