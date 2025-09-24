package collection.tree;

public class Marker implements Comparable<Marker>{

	/*
	 * THIS CLASS is created to practice the comparator interface and the compareTo() 
	 * method with custom class objects
	 */
	static String brand = "CAMLIN";
	int id;
	private static int idGenerator = 111;
	{
		this.id = idGenerator++;
	}
	String color;
	double price;
	
	Marker(String color,double price){
		this.color = color;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Marker [id=" + id + ", color=" + color + ", price=" + price + "]";
	}

	

	// compare according to price
	@Override
	public int compareTo(Marker obj) {
		if(this.price>obj.price) {
			return 1;
		}
		else if(this.price<obj.price) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	
	
	
}
