package relationship;

public class Refill {
	
	String color;
	String type;
	double size;
	
	public Refill(String color , String type, double size) {
		
		this.color = color;
		this.type = type;
		this.size = size;
		
	}
	

	public String getColor() {
		return color;
	}
	public String getType() {
		return type;
	}
	public double getSize() {
		return size;
	}
	public void getRefill() {
		System.out.println(getColor());
		System.out.println(getType());
		System.out.println(getSize());
		System.out.println("Refill Created ");
	}
}
