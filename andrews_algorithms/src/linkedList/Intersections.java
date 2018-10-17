package linkedList;

import linkedList.LinkedList;

public class Intersections {
	
	public static void main(String args[]) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		LinkedList<Integer> b = new LinkedList<Integer>();
		a.append(1);
		a.append(2);
		a.append(3);
		a.append(4);
		
		b.append(5);
		b.append(6);
		
		LinkedList<Integer> intersectionNode = new LinkedList<Integer>();
		intersectionNode.append(7);
		
		a.append(intersectionNode);
		b.append(intersectionNode);
		
		a.append(8);
		
		System.out.println("A:");
		a.print();
		
		System.out.println("B:");
		b.print();
		
		intersects(a, b).print();
	}
	
	public static LinkedList<Integer> intersects(LinkedList<Integer> h1, LinkedList<Integer> h2) {
		int h1Length = length(h1);
		int h2Length = length(h2);
		
		LinkedList<Integer> sync1 = syncNode(h1, h1Length, h2Length);
		LinkedList<Integer> sync2 = syncNode(h2, h2Length, h1Length);
		
		while(sync1 != null || sync2 != null) {
			if(sync1 == sync2) {
				return sync1;
			}
			
			sync1 = sync1.next;
			sync2 = sync2.next;
		}
		
		return null;
	}
	
	public static int length(LinkedList<Integer> head) {
		if(head == null) {
			return 0;
		}
		
		return 1 + length(head.next);
	}
	
	public static LinkedList<Integer> syncNode(LinkedList<Integer> nodeToSync, int syncLength, int otherLength) {
		if(syncLength > otherLength) {
			for(int i = 0; i < syncLength - otherLength; i++) {
				nodeToSync = nodeToSync.next;
			}
		}
		
		return nodeToSync;
	}
}
