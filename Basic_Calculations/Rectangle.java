import java.util.Scanner;
class Rectangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height of Rectangle(cm) :");
		float height = sc.nextFloat();
		System.out.println("Enter Width of Rectangle(cm) :");
		float width = sc.nextFloat();
		float area = height*width;
		System.out.println("Area of Rectangle is:" + area + "cm^2");
		float perimeter = 2*(height+width);
		System.out.println("Perimeter of Rectangle is:" + perimeter + "cm");
	}
}
