package collection.LinkedList;

public class LinkedListDriver {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.addNode(10);
		l1.addNode(50);
		l1.addNode(30.55);
		l1.addNode(2);
		l1.addNode(2);
		System.out.println(l1.contains(30.55));
		l1.sort(l1);
		System.out.println(l1);
		
		
		


		
	}
}
