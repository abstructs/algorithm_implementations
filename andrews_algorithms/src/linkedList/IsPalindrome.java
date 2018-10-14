package linkedList;

import linkedList.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class IsPalindrome {
	
	public IsPalindrome() {
		
	}
	
	public static void main(String args[]) {
		LinkedList<String> c = LinkedList.toLinkedList("racecarracecarracecarracecarracecar");

		IsPalindrome pal = new IsPalindrome();
		System.out.println(pal.isPal(c));
	}
	
	public Boolean isPal(LinkedList<String> head) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		int maxIdx = -1;
		while(head != null) {
			map.put(++maxIdx, head.getData());
			head = head.next;
		}
		
		for(int i = 0; i <= maxIdx; i++) {
			if(!map.get(i).equals(map.get(maxIdx - i))) {
				return false;
			}
		}
		
		return true;
	}
}
