package collection.LinkedList;

public class Node {

	Object val;
	Node prevRef;
	Node nxtref;
	
//	private Node() {
//	}
	public Node(Object val) {
		super();
		this.val = val;
	}
	public Node next() {
		return nxtref;
	}
	public Node previous() {
		return prevRef;
	}
	
}
