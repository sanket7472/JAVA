class FrequencyNumber 
{
	public static void main(String[] args) 
	{
		
		int num =4535464;
		for (int i =0 ;i<=9 ;i++ )
		{
			int cnt=0;
			for (int j=num;j>0 ;j/=10 )
			{
				int rem = j%10;
				if (rem==i)
				{
					cnt++;
				}
			}
			if (cnt!=0)
			{
				System.out.println(i +" : "+cnt+"    ");
				
			}
		}
		
	}
}
