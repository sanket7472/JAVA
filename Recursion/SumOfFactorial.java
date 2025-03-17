class SumOfFactorial 
{
	//  this code return sim of factorials of all digits from number
	public static void main(String[] args) 
	{
		System.out.println(sum(145 , 0));
	}
	public static int sum(int num , int sum )
	{
		// normal method
		/*
		if (num == 0)
		{
			return sum ;
		}
		sum += fact(num%10);
		return sum(num/10 , sum);
		*/
		// optimize method
		return num == 0 ? sum : sum(num/10 , (sum += fact(num%10)));
	}
	public static int fact(int num)
	{
		return num==1 ? 1 : num * fact(num-1);
	}
}
