import java.util.Scanner;
class CircleArea 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		final float pi = 22/7f;
		System.out.println("Please put the value of radus(cm) : ");
			float r = sc.nextFloat();

		float formulaForArea = pi*(r*r);
		System.out.println("The area of circle is :"+ formulaForArea + "  cm^2");
		float formulaForPerimeter = 2*pi*r;
		System.out.println("The Perimeter of circle is :"+ formulaForPerimeter + "  cm");

	}
}
