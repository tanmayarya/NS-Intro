package LinkedLists;

public class ReverseLL {
	
	static Node left;
	
	
	public static void ReverseDI(Node head) {
		int size = size(head);
		int ri = size - 1;
		Node left = head, right;
		while(ri >= size/2) {
			right = getNode(head, ri);
			swap(left, right);
			left = left.next;
			ri--;
		}
	}
	
	public static void ReverseDR(Node right, int ri, int size) {
		if(right == null) return;
		
		ReverseDR(right.next, ri + 1, size);
		if(ri >= size/2) {
			swap(left, right);
			left = left.next;
		}
	}
	
	public static void ReversePI(Node head) {
		Node prev = null, curr = head;
		while(curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
	}
	
	public static void ReversePR(Node head) {
		if(head.next == null) return;
		
		ReversePR(head.next);
		head.next.next = head;
		head.next = null;
	}
	
	
	public static void swap(Node a, Node b) {
		int temp = a.val;
		a.val = b.val; 
		b.val = temp;
	}
	
	public static Node getNode(Node head, int idx) {
		for(int i = 0; i < idx; i++) {
			head = head.next;
		}
		return head;
	}
	
	public static int size(Node head) {
		int size = 0;
		while(head != null) {
			head = head.next;
			size++;
		}
		return size;
	}
	
	public static void print(Node head) {
		while(head != null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		
		Node n = new Node(1);
		Node temp = n;
		for(int i = 2; i <= 5; i++) {
			temp.next = new Node(i);
			temp = temp.next;
		}
		print(n);
		
//		ReverseDI(n);
		left = n;
//		ReverseDR(n, 0, size(n));
//		print(n);
		Node lastNode = getNode(n, size(n) - 1);
//		ReversePI(n);
		ReversePR(n);
//		print(n);
		print(lastNode);
		

	}
}
