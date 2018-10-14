package linkedList;

//import isPalindrome.LinkedList;

public class LinkedList<T> {
	public LinkedList<T> next = null; 
	private T data;
	private Boolean isEmpty = true;
	
	public LinkedList() {}
	
	public void setData(T data) {
		this.isEmpty = false;
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
	public static LinkedList<String> toLinkedList(String str) {
		LinkedList<String> newLL = new LinkedList<String>();
		
		for(char c : str.toCharArray()) {
			newLL.append(String.valueOf(c));
		}
		
		return newLL;
	}
	
	public void append(T data) {
		
		LinkedList<T> newNode = new LinkedList<T>();
		newNode.data = data;
		
		if(this.isEmpty) {
			this.isEmpty = false;
			this.data = data;
			return;
		}
		
		LinkedList<T> temp = this;

		while(temp.next != null) { 
			temp = temp.next;
		}
		
		temp.next = newNode;
	}
	
	public void print() {
		LinkedList<T> temp = this;
		
		if(this.isEmpty) {
			return;
		}
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
		System.out.println();
		
	}
}