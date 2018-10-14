package linkedList;

import linkedList.LinkedList;
import java.util.Map;

import java.util.HashMap;;

public class KthToLast {
	public static void main(String[] args) {
		
		LinkedList<Integer> a = new LinkedList<Integer>();
		
		a.append(2);
		a.append(3);
		a.append(4);
		a.append(5);
		
		a.print();
		
		System.out.println("A:");
		a.print();
		
		Integer kthToL = KthToLast.kthToLast(a,  2);
		
		System.out.println("kthToLast:");
		System.out.println(kthToL);
		
		
	}
	
	public static Integer kthToLast(LinkedList<Integer> head, Integer k) {
		Map<Integer, Integer> map = makeMap(head);
		
		return map.get(k);
	}
	
	public static Map<Integer, Integer> makeMap(LinkedList<Integer> head) {
		if(head == null) {
			return new HashMap<Integer, Integer>();
		}
		if(head.next == null) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(1, head.getData());
			map.put(0, 1);
			return map;
		}
		
		Map<Integer, Integer> map = makeMap(head.next);
		map.put(map.get(0) + 1, head.getData());
		map.put(0, map.get(0) + 1);
		return map;
		
	}
}
