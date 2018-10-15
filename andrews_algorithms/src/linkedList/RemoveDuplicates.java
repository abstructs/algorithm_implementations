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
		
		RemoveDuplicates.removeDuplicates(a).print();
		
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
}
