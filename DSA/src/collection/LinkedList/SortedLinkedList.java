package collection.LinkedList;

public class SortedLinkedList extends LinkedList{

	
	public SortedLinkedList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean addNode(Object val) {
		if (!contains(val)) {
			super.addNode(val);
			sort(this);
			return true;
		}
		return false;
	}
	public boolean addFirst(Object val) {
		if (!contains(val)) {
			 super.addFirst(val);
			 sort(this);
				return true;
		}
		return false;
	}
	public boolean addLast(Object val) {
		if (!contains(val)) {
			super.addLast(val);
			sort(this);
			return true;
		}
		return false;
	}
	public boolean addAll(LinkedList l) {
		Node head = l.iterate();
		while (head!=null) {
			if (!contains(head.val)) {
				super.addNode(head.val);
			}
			head = head.next();
		}
		sort(this);
		return true;
	}
}
