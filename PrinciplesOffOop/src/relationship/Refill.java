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
	


	public void getRefill() {
		System.out.println(color);
		System.out.println(type);
		System.out.println(size);
		System.out.println("Refill Created ");
	}
}
