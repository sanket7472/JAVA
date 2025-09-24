package collection.tree;

import java.util.TreeSet;

public class MarkerDriver {

	public static void main(String[] args) {
		
		TreeSet<Marker> s1 = new TreeSet<Marker>();
		s1.add( new Marker("Blue", 30));
		s1.add( new Marker("Green", 25));
		s1.add( new Marker("Orange", 22));
		s1.add( new Marker("Black", 29));
		s1.add( new Marker("Navy", 30));
		s1.add( new Marker("Yellow", 15));
		
		for(Marker ele:s1) {
		System.out.println(ele);
		}
	}
}
