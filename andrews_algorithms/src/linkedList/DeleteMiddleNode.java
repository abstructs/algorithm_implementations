package linkedList;

import linkedList.LinkedList;

public class DeleteMiddleNode {
	public static void main(String args[]) {
		
		LinkedList<Integer> a = new LinkedList<Integer>();
		LinkedList<Integer> b = new LinkedList<Integer>();
		LinkedList<Integer> c = new LinkedList<Integer>();
		
		a.append(2);
		a.append(3);
		a.append(4);
		
		b.append(0);
		b.append(1);
		b.append(2);
		b.append(3);
		b.append(4);
		b.append(5);
		
		c.append(2);
		c.append(3);
		
		System.out.println("A: ");
		DeleteMiddleNode.deleteMiddle(a).print();
		
		System.out.println("B: ");
		DeleteMiddleNode.deleteMiddle(b).print();
		
		System.out.println("C: ");
		DeleteMiddleNode.deleteMiddle(c).print();
		
		
		
	}
	
	public static LinkedList<Integer> deleteMiddle(LinkedList<Integer> head) {
		LinkedList<Integer> p1 = head;
		LinkedList<Integer> p2 = p1;
		
		if(head == null || head.next == null) {
			return null;
		}
		
		while(p2 != null && p2.next != null) {
			p2 = p2.next.next;
			if(p2 != null && p2.next != null) {
				p1 = p1.next;
			}
		}
		
		p1.next = p1.next.next;
		
		return head;
	}
}
