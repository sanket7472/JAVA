package collection.LinkedList;

public class LinkedSetDriver {

	public static void main(String[] args) {
		
		LinkedSet l1 = new LinkedSet();
		l1.addNode(70);
		l1.addNode(60);
		l1.addNode(50);
		l1.addNode(40);
	
		l1.sort(l1);
		System.out.println(l1);
	}
}
