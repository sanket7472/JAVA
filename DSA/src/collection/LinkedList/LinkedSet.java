package collection.LinkedList;

public class LinkedSet extends LinkedList {

	public LinkedSet() {
		super();
		// TODO Auto-generated constructor stub
	}

	// addval
	//addall
	//addfist
	//add last
//	public boolean addNode(Object val) {
//		if (!contains(val)) {
//			return super.addNode(val);
//		}
//		return false;
//	}
	public boolean addFirst(Object val) {
		if (!contains(val)) {
			return super.addFirst(val);
		}
		return false;
	}
	public boolean addLast(Object val) {
		if (!contains(val)) {
			return super.addLast(val);
		}
		return false;
	}
	public boolean addAll(LinkedList l) {
		Node head = l.iterate();
		while (head!=null) {
			if (!contains(head.val)) {
				return super.addNode(head.val);
			}
			head = head.next();
		}
		return true;
	}
}
