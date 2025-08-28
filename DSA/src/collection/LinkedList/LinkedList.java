package collection.LinkedList;

public class LinkedList {

	private Node head;
	private Node bhagwan;
	private Node currRef;
	public LinkedList() {
		super();
	}
	public Node iterate()
	{
		return head;
	}
	
	public boolean addNode(Object val) {
		if (head==null) {
			head = new Node(val);
			bhagwan = head;
		}else {
			Node temp = new Node(val);
			bhagwan.nxtref = temp;
			temp.prevRef = bhagwan;
			bhagwan=temp;
		}
		
		return true;
	}
	public void showList() {
		currRef = head;
		while(currRef!=null) {
			System.out.println(currRef.val);
			currRef = currRef.nxtref;
		}
	}
	
	public void removeNode(Object val) {
	    Node node = iterate();
	    boolean ele = true;
	    while (node != null) {
	        if (node.val.equals(val)) { 
	            System.out.println("Removing: " + node.val);
	            ele = false;
	            if (node == head) {
	                head = currRef.nxtref;
	                if (head != null) {
	                    head.prevRef = null;
	                }
	            } else {
	            	node.prevRef.nxtref = node.nxtref;
	                if (node.nxtref != null) {
	                	node.nxtref.prevRef = node.prevRef;
	                }
	            }
	            break;
	        }
	        node = node.nxtref;
	    }
	    if (ele) {
			System.out.println(val + " Not found in List");
		}
	    
	}

	
}
