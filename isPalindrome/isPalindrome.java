package isPalindrome;

import isPalindrome.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class isPalindrome {
	
	public isPalindrome() {
		
	}
	
	public static void main(String args[]) {
		LinkedList<String> c = LinkedList.toLinkedList("racecarracecarracecarracecarracecar");
		isPalindrome pal = new isPalindrome();
		System.out.println(pal.isPal(c));
		
		
	}
	
	public Boolean isPal(LinkedList<String> head) {
		Map<Integer, String> map = new HashMap();
		int maxIdx = -1;
		while(head != null) {
			map.put(++maxIdx, head.data);
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
