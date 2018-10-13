package SumTwoLL;

public class LinkedList {
	public LinkedList next = null; 
	public int data;
	
	public LinkedList() {
		
	}
	
	public static LinkedList append(LinkedList head, int data) {
		
		LinkedList newNode = new LinkedList();
		newNode.data = data;
		
		if(head == null) {
			return newNode;
		}
		
		LinkedList temp = head;

		while(temp.next != null) { 
			temp = temp.next;
		}
		
		temp.next = newNode;
		
		return head;
	}
	
	public static void print(LinkedList head) {
		if(head == null) {
			return;
		} 
		else {
			System.out.println(head.data + "\n");
			print(head.next);
		}
	}
}