package LinkedLists;

public class LL2 {
	
	class Queue
	{
	 private Node front, rear; 
	 private int currentSize;
	 
	class Node {
	    Node next;
	    int val;

	    Node(int val) {
	        this.val = val;
	        next = null;
	       
	    }
	}
	    
	 public Queue()
	 {
	 front = null;
	 rear = null;
	 currentSize = 0;
	 }
	 
	 
	 public void dequeue() {
	    if(currentSize == 0) return;
	    front = front.next;
	    currentSize--;
	 }
	 public void enqueue(int data) {
	     Node n = new Node(data);
	 
	    if(currentSize == 0) {
	        front = rear = n;
	    }
	    else{
	    rear.next = n;
	    rear = n;
	    }
	    currentSize++;
	 }
	 public void displayfront() {
	     if(currentSize == 0) {
	         System.out.println(0);
	         return;
	     }
	  System.out.println(front.val);   
	 }
	}
	
	public static Node deleteElement(Node head,int k) {
		 // calculate size of LL
		    int size = 0;
		    Node temp = head;
		    while(temp!=null) {
		        size++;
		        temp = temp.next;
		    }
		    if(size == 1) return null;

		// reach node that we want to delete
		    int kFromStart = size - k + 1;
		    temp = head;
		    for(int i = 1; i < kFromStart; i++) {
		        temp = temp.next;
		    }
		    if(temp.prev != null) temp.prev.next = temp.next;
		    else head = head.next;

		    if(temp.next != null) {
		        temp.next.prev = temp.prev;
		    }
		    return head;
		}

}
