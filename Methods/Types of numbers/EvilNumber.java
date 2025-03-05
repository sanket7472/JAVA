import java.util.Scanner;
class EvilNumber {
	public static void main(String[] args) {
		System.out.print("Enter number : ");
		int num = new Scanner(System.in).nextInt();
		if (isEvil(num)) {
			System.out.print(num + " is an Evil number");
		}
		else
			System.out.print(num + " is not an Evil number");
	}
	public static boolean isEvil(int num)
	{
		String bin = Integer.toBinaryString(num);		
		int cnt = 0;

		for (int i = 0;i<bin.length() ;i++ )
		{
			if (bin.charAt(i)=='1')
			{
				cnt++;
			}

		}
		if (cnt%2==0)
		{
			return true;
		}
		return false;
	}
}