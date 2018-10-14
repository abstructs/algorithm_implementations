package kthToLast;

import kthToLast.LinkedList;
import java.util.Map;

import java.util.HashMap;;

public class kthToLast {
	public static void main(String[] args) {
		
		LinkedList a = new LinkedList();
		
		a = LinkedList.append(a, 2).append(a, 3).append(a,  4).append(a, 5).next;
		
		System.out.println("A:");
		LinkedList.print(a);
		
		Integer kthToL = kthToLast.kthToLast(a,  2);
		
		System.out.println("kthToLast:");
		System.out.println(kthToL);
		
		
	}
	
	public static Integer kthToLast(LinkedList head, Integer k) {
		Map<Integer, Integer> map = makeMap(head);
		
		return map.get(k);
	}
	
	public static Map<Integer, Integer> makeMap(LinkedList head) {
		if(head == null) {
			return new HashMap<Integer, Integer>();
		}
		if(head.next == null) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(1, head.data);
			map.put(0, 1);
			return map;
		}
		
		Map<Integer, Integer> map = makeMap(head.next);
		map.put(map.get(0) + 1, head.data);
		map.put(0, map.get(0) + 1);
		return map;
		
	}
}
