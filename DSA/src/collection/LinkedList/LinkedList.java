package collection.LinkedList;

public class LinkedList {

	private Node head;
	private Node bhagwan;
	private Node currRef;
	public LinkedList() {
		super();
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
	    currRef = head;
	    boolean ele = true;
	    while (currRef != null) {
	        if (currRef.val.equals(val)) { 
	            System.out.println("Removing: " + currRef.val);
	            ele = false;
	            if (currRef == head) {
	                head = currRef.nxtref;
	                if (head != null) {
	                    head.prevRef = null;
	                }
	            } else {
	                currRef.prevRef.nxtref = currRef.nxtref;
	                if (currRef.nxtref != null) {
	                    currRef.nxtref.prevRef = currRef.prevRef;
	                }
	            }
	            break;
	        }
	        currRef = currRef.nxtref;
	    }
	    if (ele) {
			System.out.println(val + " Not found in List");
		}
	    
	}

	
}
