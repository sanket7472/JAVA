package arrays;


public class Camera {

	String brand;
	double price;
	int ports;
	int mp;
	boolean nightVision;
	
	
	public Camera() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Camera(String brand, double price, int ports, int mp, boolean nightVision) {
		super();
		this.brand = brand;
		this.price = price;
		this.ports = ports;
		this.mp = mp;
		this.nightVision = nightVision;
	}


	@Override
	public String toString() {
		return "Camera [brand=" + brand + ", price=" + price + ", ports=" + ports + ", mp=" + mp + ", nightVision="
				+ nightVision + "]";
	}



	
	
}
