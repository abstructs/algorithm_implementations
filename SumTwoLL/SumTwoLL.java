package SumTwoLL;

import SumTwoLL.LinkedList;

public class SumTwoLL {

	
	public static void main(String args[]) {
		// 2.5 Solve sum two lists from Chapter 2 Crack The Coding Interview
		
		LinkedList a = new LinkedList();
		LinkedList b = new LinkedList();
		
		a = LinkedList.append(a, 7).append(a, 1).append(a,  6).append(a, 5).next;
		b = LinkedList.append(b, 5).append(b, 9).append(b,  2).next;
		
		System.out.println("A:");
		LinkedList.print(a);
		
		System.out.println("B:");
		LinkedList.print(b);
		
		LinkedList summed = SumTwoLL.sum(a, b);
		
		System.out.println("Summed:");
		LinkedList.print(summed);
		
		
		
	}
	
	public static int addNumsWithRem(LinkedList a, LinkedList b) {
		if(a == null) return b.data;
		if(b == null) return a.data;
		return a.data + b.data;
	}
	
	
	public static LinkedList sum(LinkedList a, LinkedList b) {
		int carry = 0;
		LinkedList summed = new LinkedList();
		LinkedList refSum = summed;
		
		while(a != null || b != null) {
			int n = addNumsWithRem(a, b);
			refSum.next = new LinkedList();
			
			refSum.data = n % 10 + carry;
			
			if(n >= 10) {
				carry = 1;
			} else {
				carry = 0;
			}
			
			if(a != null) {
				a = a.next;
			}
			if(b != null) {
				b = b.next;
			}
			
//			a = a.next;
//			b = b.next;
			
			refSum = refSum.next;
		}
		
		return summed;
	}
}
