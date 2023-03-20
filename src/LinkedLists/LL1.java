package LinkedLists;

class Node {
    Node next, prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}

public class LL1 {
	
	/*
	below function is used to insert nodes in the linked list
	public static Node insert(Node head, int val) {
	        if(head == null) {
	            return new Node(val);
	        } else {
	            Node cur;
	            cur = insert(head.next, val);
	            head.next = cur;
	            return head;
	        }
	    }

	*/
	public static Node Merge (Node head1, Node head2){
	    Node head = null, tail = null;
	    
	    while(head1 != null && head2 != null) {
	    	Node node;
	    	if(head1.val < head2.val) {
	    		node = new Node(head1.val);
	    		head1 = head1.next;
	    	} else {
	    		node = new Node(head2.val);
	    		head2 = head2.next;
	    	}
	    	
	    	if(head == null) { // no node in result LL
	    		head = tail = node;
	    	} else { // nodes are already present
	    		tail.next = node;
	    		tail = node;
	    	}
	    }
	    while(head1 != null) {
	    	Node node = new Node(head1.val);
    		head1 = head1.next;
    		tail.next = node;
    		tail = node;
	    }
	    
	    while(head2 != null) {
	    	Node node = new Node(head2.val);
    		head2 = head2.next;
    		tail.next = node;
    		tail = node;
	    }
	    return head;
	}
}
