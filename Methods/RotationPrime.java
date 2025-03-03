import java.util.Scanner;
class RotationPrime {
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		if (isPrime(num)) 
		{
			int rot = rotate(num);
			boolean flag = true;
			if (isPrime(rot)) 
			{
				do
				{
					//System.out.println(rot);
			 	 	rot = rotate(rot);
					if (!(isPrime(rot)))
					{
						flag = false;
						break;
					}

				}	while (rot != rotate(num));
			}
			if (flag) 
			{
				System.out.print(" All the rotations for "+num+" are prime.");
			}
		}
		else{
			System.out.print("Number is Not a Prime ...!");
		}
	}
	public static boolean isPrime(int num)
	{
		int den = 2;
		for (;den<num ;den++ )
		 {
			if (num%den == 0) 
			{
				return false;
			}
		}
		return true;
	}
	public static int rotate(int num)
	{
		//int last = num%10;
		num/=10;
		//int ct = count(num);
		return (num%10)*power(count(num))+num;
	}
	public static int count(int num)
	{
		int ct = 0;
		while (num!=0){
			ct++;
			num/=10;
		}
		return ct;
	}
	public static int power(int ct)
	{
		int pow = 1;
		for (int i = 1;i<=ct ;i++ ) 
			pow *= 10;
		return pow;
	}
}