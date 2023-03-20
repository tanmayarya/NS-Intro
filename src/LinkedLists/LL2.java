package LinkedLists;

public class LL2 {
	
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
