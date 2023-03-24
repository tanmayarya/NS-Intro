package LinkedLists;

public class LL3 {

	
	public static Node insertInSortedDLL(Node head, Node newNode) {
		if(head == null) { // empty Linked list
			return newNode;
		}
		if(newNode.val < head.val) { // insert at head 
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		else { // insert anywhere in DLL except head
			Node curr = head;
			while(curr.next != null // reach the current position of the node
					&& curr.next.val < newNode.val) {
				curr = curr.next;
			}
			newNode.next = curr.next;
			if(curr.next != null) curr.next.prev = newNode;
			newNode.prev = curr;
			curr.next = newNode;
		}
		
		return head;
	}
	
	public static Node MakeCircular(Node head) {
		if(head == null) return null;
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		return head;
	}
	
	static Node deleteEven(Node head) {
		if(head == null) return null;
		Node temp = head;
		while(temp.next != head) {
			if(temp.next.val % 2 == 0) { // even
				temp.next = temp.next.next;
			} else temp = temp.next; 
		}
		return head;
	}
}
