package linkedList;

import linkedList.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class RemoveDuplicates<T> {
	public static void main(String args[]) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.append(2);
		a.append(2);
		a.append(2);
		a.append(2);
		a.append(2);
		a.append(2);
		a.append(3);
		a.append(3);
		a.append(3);
		a.append(3);
		a.append(2);
		a.append(4);
		
		RemoveDuplicates.removeDuplicatesNoBuf(a).print();
		
	}
	
	public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> head) {
		LinkedList<Integer> temp = head;
		Map<Integer, Boolean> visits = new HashMap<Integer, Boolean>();
		
		while(temp != null && temp.next != null) {
			visits.put(temp.getData(), true);
			
			if(visits.containsKey(temp.next.getData())) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		
		return head;
	}
	
	public static LinkedList<Integer> removeDuplicatesNoBuf(LinkedList<Integer> head) {
		LinkedList<Integer> p1 = head;
		
		while(p1 != null) {
			LinkedList<Integer> p2 = p1;
			while(p2 != null && p2.next != null) {
				if(p1.getData().equals(p2.next.getData())) {
					p2.next = p2.next.next;					
				} else {
					p2 = p2.next;
				}
			}
			
			
			p1 = p1.next;
			
		}
		
		return head;
	}
}
