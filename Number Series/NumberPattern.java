class NumberPattern 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int num=0;
		/*for (int i = 0; i<n;i++ )
		{
			for (int j = 0;j<=i ;j++ )
			{
				System.out.print(num+1 +" ");
				num++;
			}
			System.out.println();
		}*/
		for (int i = 0;i <n ;i++ )
		{
			for (int j = i;j<0 ;i-- )
			{
				System.out.print(num+1 +" ");
				num++;
			}
		}
	}
}
