package LinkedLists;

class Node {
    Node next;
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
	        if(head1.val < head2.val) {
	            if(head == null) {
	                 head = new Node(head1.val);
	                 tail = head;
	            } else {
	                tail.next = new Node(head1.val);
	                tail = tail.next;
	            }
	            head1 = head1.next;
	        } else {
	                 if(head == null) {
	                 head = new Node(head2.val);
	                 tail = head;
	            } else {
	                tail.next = new Node(head2.val);
	                tail = tail.next;
	            }
	            head2 = head2.next;
	        }
	    }

	    while(head1 != null) {
	        tail.next = new Node(head1.val);
	                tail = tail.next;
	        head1 = head1.next;
	    }

	    while(head2 != null) {
	        tail.next = new Node(head2.val);
	                tail = tail.next;
	        head2 = head2.next;
	    }

	    return head;
	}
}
