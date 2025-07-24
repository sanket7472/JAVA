package objectClassMethods;

public class HashcodeOverride {

	// this class is made to show the hashcode methode will return the unique number 
	//& same number for the the object having same attributes
	
	// design related to camera
	
	String brand;
	double price;
	int ports;
	int mp;
	boolean nightVision;
	public HashcodeOverride(String brand, double price, int ports, int mp, boolean nightVision) {
		super();
		this.brand = brand;
		this.price = price;
		this.ports = ports;
		this.mp = mp;
		this.nightVision = nightVision;
	}
	
	public String toString() {
		
		return "[ Brand :"+brand+", Price : "+price+", Ports : "+ports+", Mega Pixel : "+mp+", Night Vision : "+nightVision+"]";
	}
	
	public boolean equals(Object o) {
		if (o != null && o instanceof HashcodeOverride) {
			
			HashcodeOverride h = (HashcodeOverride) o;
			
			return this.brand == h.brand && this.price == h.price && this.ports == h.ports
					&& this.mp == h.mp && this.nightVision == h.nightVision;
		}
		return false;
	}
	
	public int hashCode() {
		return brand.hashCode() + Double.hashCode(price)+ports+mp+ Boolean.hashCode(nightVision);
	}
}
