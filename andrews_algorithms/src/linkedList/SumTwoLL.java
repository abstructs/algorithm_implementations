package linkedList;

import linkedList.LinkedList;

public class SumTwoLL {

	
	public static void main(String args[]) {
		// 2.5 Solve sum two lists from Chapter 2 Crack The Coding Interview
		
		LinkedList<Integer> a = new LinkedList<Integer>();
		LinkedList<Integer> b = new LinkedList<Integer>();
		
		a.append(7);
		a.append(1);
		a.append(6);
		a.append(5);
		
		b.append(5);
		b.append(9);
		b.append(2);
		
		System.out.println("A:");
		a.print();
		
		System.out.println("B:");
		b.print();
		
		LinkedList<Integer> summed = SumTwoLL.sum(a, b);
		
		System.out.println("Summed:");
		summed.print();
	}
	
	public static int addNumsWithRem(LinkedList<Integer> a, LinkedList<Integer> b) {
		if(a == null) return b.getData();
		if(b == null) return a.getData();
		return a.getData() + b.getData();
	}
	
	
	public static LinkedList<Integer> sum(LinkedList<Integer> a, LinkedList<Integer> b) {
		int carry = 0;
		LinkedList<Integer> summed = new LinkedList<Integer>();
		LinkedList<Integer> refSum = summed;
		
		while(a != null || b != null) {
			int n = addNumsWithRem(a, b);
			
			
			refSum.setData(n % 10 + carry);
			
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
			
			if(a != null || b != null) {
				refSum.next = new LinkedList<Integer>();	
			}
			
			refSum = refSum.next;
		}
		
		return summed;
	}
}
