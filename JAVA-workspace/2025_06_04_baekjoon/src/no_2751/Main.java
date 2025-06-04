package no_2751;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int n = read();
		int[] list = new int[n];
		for(int i = 0; i < n; i++) {
			list[i] = read();
		}
		Arrays.sort(list);
		for(int x : list) {
			sb.append(x).append("\n");
		}
		System.out.println(sb);
	}
	
	static int read() {
		int c, n = 0;
		boolean plus = true;
		try {
			while((c = System.in.read()) <= 32);
			if(c == 45) { 
				plus = false;
				c = System.in.read();
			}
			n = c & 15;

			while((c = System.in.read()) > 32) {
				n = (n << 3) + (n << 1) + (c & 15);
			}
		} catch (Exception e){}
		return plus ? n : -n;
	}
}
