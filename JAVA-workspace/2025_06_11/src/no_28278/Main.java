package no_28278;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		StringBuilder stb = new StringBuilder();
		StackCommand cmd = new StackCommand();
		for(int i = 0; i < test; i++) {
			cmd.run(stb, br.readLine());
		}
		System.out.println(stb);
	}
}
class StackCommand {
	private Stack stack;
	
	public StackCommand() {
		stack = new Stack();
	}
	
	public void run(StringBuilder stb, String s) {
		switch (s.charAt(0)) {
		case '1':
			String[] input = s.split(" ");
			stack.push(Integer.parseInt(input[1]));
			return;
		case '2':
			stb.append(stack.pop()).append("\n");
			return;
		case '3':
			stb.append(stack.size()).append("\n");
			return;
		case '4':
			stb.append(stack.isEmpty() ? 1 : 0).append("\n");
			return;
		case '5':
			stb.append(stack.top()).append("\n");
			return;
		default:
			return;
		}
	}
}

class Stack {
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

