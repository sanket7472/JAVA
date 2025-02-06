import java.util.Scanner;
class TempConvert 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Degree Celsius : ");
		double tempInDegree = sc.nextDouble();
		double tempInFer = ((9/5d)*tempInDegree) + 32;
		System.out.println("Temperature in feranite is : " + tempInFer + "F");
	}
}
