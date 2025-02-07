import java.util.Scanner;
class BmiCal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in pounds : ");
		float weight = sc.nextFloat()*0.45359237f;

		System.out.println("Enter height in Inch : ");
		float height = sc.nextFloat()*0.0254f;

		float bmi = weight/(height*height);
		System.out.println ("BMI is " + bmi + "for Weight in pounds : " + weight + "And Height in Inches  " + height);

	}
}
