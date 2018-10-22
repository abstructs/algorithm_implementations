package linkedList;

import linkedList.LinkedList;

public class LoopDetection {
	
	public static void main(String args[]) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		
		LinkedList<Integer> lastNode = new LinkedList<Integer>();
		
		a.append(1);
		
		
		
		a.append(2);
		a.append(3);
		a.append(4);
		a.append(5);
		
		
		a.append(6);
		a.append(7);
		a.append(8);
		
		lastNode.setData(9);
		
		LinkedList<Integer> circularNode = a.next.next.next.next.next.next.next;
		lastNode.next = circularNode;
		
		a.append(lastNode);
		
		System.out.println(detectLoop(a).getData());
		
	}
	
	public static LinkedList<Integer> detectLoop(LinkedList<Integer> head) {
		LinkedList<Integer> t = head;
		LinkedList<Integer> runner = head;
		Boolean loop = false;
		int count = 0;
		
		while(runner != null && runner.next != null) {
			runner = runner.next.next;
			if(t == runner) {
				loop = true;
				break;
			}
			t = t.next;
		}
		if(loop) {
			int steps = head.getLength() - count;
			for(int i = 0; i <= steps; i++) {
				t = t.next;
			}
			return t;
		}
		
		return null;
	}
}
