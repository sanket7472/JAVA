package collection.LinkedList;

public class LinkedList {

	private Node head;
	private Node bhagwan;
	private int size;
//	private Node currRef;
	public LinkedList() {
		super();
	}
	public Node iterate()
	{
		return head;
	}
	public Node reverseIterate() {
		return bhagwan;
	}
	public boolean addNode(Object val) {
		if (head==null) {
			head = new Node(val);
			size++;
			bhagwan = head;
		}else {
			Node temp = new Node(val);
			bhagwan.nxtref = temp;
			temp.prevRef = bhagwan;
			bhagwan=temp;
			size++;
		}
		
		return true;
	}
	public boolean clear() {
		head = null;
		bhagwan = null;
		size=0;
		return true;
	}
	public boolean removeNode(Object val) {
	    Node node = iterate();
	    boolean ele = false;
	    while (node != null) {
	        if (node.val.equals(val)) {
	        	if (node.val == head.val) {
	                head = node.nxtref;
	                if (head != null) {
	                    head.prevRef = null;
	                }
	                size--;
	            } else {
	            	node.prevRef.nxtref = node.nxtref;
	                if (node.nxtref != null) {
	                	node.nxtref.prevRef = node.prevRef;
	                }
	                size--;
	            }
	            break;
	        }
	        node = node.nxtref;
	    }
	    return ele;
	}
	public boolean removeLast() {
		if (bhagwan!=null) {
			bhagwan=bhagwan.previous();
			bhagwan.nxtref=null;
			size--;
			return true;
		}
		return false;
	}
	public boolean contains(Object val) {
		return containsVal(val)!=null;
	}
	public Node containsVal(Object val) {
		Node head = iterate();
		while (head!=null) {
			if (head.val.equals(val)) {
				return head;
			}
			head = head.next();
		}
		return null;
	}
	public boolean containsAll(LinkedList l) {
		Node head = l.iterate();
		while (head!=null) {
			if (!(contains(head.val))) {
				return false;
			}
			head = head.next();
		}
		return true;
	}
	public boolean addFirst(Object val) {
		Node temp = new Node(val);
		if (head!=null) {
			temp.nxtref=head;
			head.prevRef = temp;
			head = temp;
		}else {
			temp = head;
			bhagwan = head;
		}
		size++;
		return true;
	}
	public boolean addLast(Object val) {
		return addNode(val);
	}
	public boolean addAll(LinkedList l) {
		Node head = l.iterate();
		while (head!=null) {
			addNode(head.val);
			head = head.next();
		}
		return true;
	}
	public boolean reatainAll(LinkedList l) {
		LinkedList temp = new LinkedList();
		Node head = l.iterate();
		
		while (head!=null) {
			
			Node ref = containsVal(head.val);
			
			if (ref!=null) {
				
				temp.addNode(ref.val);
			}
			head = head.next();
		}
		this.head = temp.head;
		this.bhagwan = temp.bhagwan;
		return true;
	}
	public void sort(LinkedList l) {
		Node head = l.iterate();
		Node bhagwan = l.reverseIterate();
		while(!head.equals(bhagwan)) {
				Node head2 = l.iterate();
			while(head2!=null&&head2.nxtref!=null) {
					Integer i1 = (Integer) head2.val;
					Integer i2 = (Integer) head2.nxtref.val;
					if (i1>i2) {
						head2.val = i2;
						head2.nxtref.val=i1;
					}
				head2 = head2.next();
			}
		 head = head.next();
		}
	}
	public String toString() {
		if (head!=null) {
			Node head = iterate();
			StringBuilder sb = new StringBuilder();
			sb = sb.append("[");
			while (head!=null) {
				sb = sb.append(" "+head.val).append(",");
				head = head.next();
			}
			sb = sb.deleteCharAt(sb.length()-1).deleteCharAt(1).append("]");
			return new String(sb);
		}
		return "[]";
	}

	
}
