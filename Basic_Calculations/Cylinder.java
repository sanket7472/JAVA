import java.util.Scanner;
class Cylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of cylinder (cm):");
		float height = sc.nextFloat();
		System.out.println("Enter radius of cylinder (cm):");
		float radius = sc.nextFloat();
		final float pi = 22/7f;
		float area = pi*(radius*radius);
		System.out.println("Area of Cylinder is :" + area + " cm^2");
		float volume = area* height;
		System.out.println("Volume of Cylinder is :" + volume + " cm^3");


	}
}
