class  CondOpExample
{
	public static void main(String[] args) 
	{
		int a= 7;
		int b = 9;
		int c = 4;
		int large = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(large);
		int min = (a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		System.out.println(min);
	}
}
