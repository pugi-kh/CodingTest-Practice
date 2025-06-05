package no_10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		Stack testStack = new Stack();
		for(int i = 0; i < testCase; i++) {
			String[] input = br.readLine().split(" ");
			testStack.run(input);
		}
	}
}
class Stack {
	private int size = 0;
	private boolean isEmpty = true;
	private List<Integer> stack;
	
	public void run(String[] input) {
		int io_num;
		switch (input[0]) {
		case "push":
			io_num = Integer.parseInt(input[1]);
			this.push(io_num);
			break;
		case "pop":
			io_num = this.pop();
			System.out.println(io_num);
			break;
		case "top":
			io_num = this.top();
			System.out.println(io_num);
			break;
		case "size":
			System.out.println(this.size());
			break;
		case "empty":
			System.out.println(this.isEmpty() ? 1 : 0);
		default:
			break;
		}
	}
	
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
		
		int res = stack.get(size-1);
		stack.remove(size-1);
		size--;
		if(size == 0) isEmpty = true;
		return res;
	}
	
	public int top() {
		if(this.isEmpty) return -1;
		
		int res = stack.get(size-1);
		return res;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return isEmpty;
	}
	
}
