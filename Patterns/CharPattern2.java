class CharPattern2 
{
	public static void main(String[] args) 
	{
		/*
		output
		a
		a  b
		a  b  c
		a  b  c  d
		a  b  c  d  e
		*/
		int n =5;
		for (int i = 1;i<=n ;i++ )
		{
			char ch = 'a';
			for (int j = 1;j<=i ;j++ )
			{
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
