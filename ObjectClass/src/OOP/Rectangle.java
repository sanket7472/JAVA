package OOP;

public class Rectangle {

	double length;
	double bridth;
	public Rectangle(double length, double bridth) {
		super();
		this.length = length;
		this.bridth = bridth;
	}
	
	public void area() {
		System.out.println("Area of rectangle : "+ (length*bridth));
	}
	public void perimeter() {
		System.out.println("Perimeter of rectangle : "+ 2*(length+bridth));
	}
}
