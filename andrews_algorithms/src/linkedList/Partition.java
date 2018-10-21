package linkedList;

import linkedList.LinkedList;

public class Partition {
	public static void main(String args[]) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		
		a.append(3);
		a.append(5);
		a.append(8);
		a.append(5);
		a.append(10);
		a.append(2);
		a.append(1);
		
		System.out.println("A: ");
		
		
		a.print();
		
		System.out.println("Partition: ");
		Partition.partition(a, 5).print();
	}
	
	public static LinkedList<Integer> partition(LinkedList<Integer> head, int p) {
		LinkedList<Integer> t1 = head;
		LinkedList<Integer> gtHead = null;
		LinkedList<Integer> t2 = null;
		LinkedList<Integer> ltTail = null;
		LinkedList<Integer> ltHead = null;
		
		while(t1 != null) {
			if(t1.getData() >= p) {
				t2 = t1.next;
				t1.next = gtHead;
				gtHead = t1;
				t1 = t2;
				
			}
			else {
				if(ltTail == null) {
					ltTail = t1;
				}
				t2 = t1.next;
				t1.next = ltHead;
				ltHead = t1;
				t1 = t2;
			}
		}
		
		if(ltTail != null) {
			ltTail.next = gtHead;
			return ltHead;
		}
		else {
			return gtHead;
		}
	}
}
