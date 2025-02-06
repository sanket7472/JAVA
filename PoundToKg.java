import java.util.Scanner;
class PoundToKg 
{
	public static void main(String[] args) 
	{
		System.out.print(" Enter weight in Pounds : ");
		float poundWeight = new Scanner(System.in).nextFloat();
		float kgWeight = poundWeight*0.454f;
		System.out.print("Weight in KG is : "+kgWeight );
	}
}
