package data_structure;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	private int size = 0;
	private boolean isEmpty = true;
	private List<Integer> stack;
	
	public Stack() {
		stack = new ArrayList<Integer>();
	}
	
	public void push(int num) {
		stack.add(num);
		size++;
		isEmpty = false;
	}
	
	public int pop() {
		if(this.isEmpty) return -1;
		
		int top = stack.get(size-1);
		stack.remove(size-1);
		size--;
		if(size == 0) isEmpty = true;
		return top;
	}
	
	public int top() {
		if(this.isEmpty) return -1;
		
		int top = stack.get(size-1);
		return top;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return isEmpty;
	}
}
