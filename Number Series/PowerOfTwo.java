class PowerOfTwo 
{
	public static void main(String[] args) 
	{
		int num = 2;
		System.out.print(num +" ");
		for (int i=0, p=2;i<5 ;i++, p*=2 )
		{
			int pow=1;
			for (int j = 1;j<=p ;j++ )
				pow *= 2;
			System.out.print((pow +num)+ " ");
			num += pow;
			/*
			2^1---->2
			2^2 + 2^1---->6
			2^4 +2^2 + 2^1-----> 22
			2^8+ 2^4 +2^2 + 2^1----->278

			*/

		}

	}
}
