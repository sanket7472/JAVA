import java.util.Scanner;
class HappNumber {
	/*
		if the sum of square of digits is 1 the num is happy 
		if the sum of square of digits is 4 the num is unhappy(sad) 
		ex--->  32                      |   20
				(3*3)+(2*2)=13          |   (2*2)+ (0*0)=4
				(1*1)+(3*3)=10          |   
				" 32 is a Happy number" | " 20 is unhappy number"
	*/
	public static void main(String[] args) 
	{
		System.out.print(" Enter number : ");
		int num = new Scanner(System.in).nextInt();
		if (isHappy(num)) {
			System.out.print(num + " is a Happy number");
		}
		else 
			System.out.print(num + " is a Unhappy(sad) number");
		
	}
	public static boolean isHappy (int num)
	{
		int sum = sum_Of_Square_Of_Digits(num);
		
		
		while (sum!=1&&sum!=4) {
			sum = sum_Of_Square_Of_Digits(sum);
		}

		return sum==1 ? true : false;
		
	}
	public static int sum_Of_Square_Of_Digits(int num)
	{
		int sum = 0;
		while(num!=0)
		{
			sum += ((num%10 )*(num%10));
			num/=10;
		}
		return sum;
	}
}