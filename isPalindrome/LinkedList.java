package isPalindrome;

import isPalindrome.LinkedList;

public class LinkedList<T> {
	public LinkedList<T> next = null; 
	public T data;
	
	public LinkedList() {
		
	}
	
	public static LinkedList<String> toLinkedList(String str) {
		LinkedList<String> newLL = new LinkedList<String>();
		
		for(char c : str.toCharArray()) {
			newLL = newLL.append(newLL, String.valueOf(c));
		}
		
		return newLL.next;
	}
	
	public LinkedList<T> append(LinkedList<T> head, T data) {
		
		LinkedList<T> newNode = new LinkedList<T>();
		newNode.data = data;
		
		if(head == null) {
			return newNode;
		}
		
		LinkedList<T> temp = head;

		while(temp.next != null) { 
			temp = temp.next;
		}
		
		temp.next = newNode;
		
		return head;
	}
	
	public static void print(LinkedList head) {
		if(head == null) {
			return;
		} 
		else {
			System.out.print(head.data + " ");
			print(head.next);
		}
	}
}