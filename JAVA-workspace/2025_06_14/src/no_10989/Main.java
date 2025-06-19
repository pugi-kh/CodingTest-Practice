package no_10989;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int n = read();
		int[] toSort = new int[n];
		for(int i = 0; i < n; i++) {
			toSort[i] = read();
		}
		Arrays.sort(toSort);
		StringBuilder stb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			stb.append(toSort[i]).append("\n");
		}
		System.out.println(stb);
	}

	static int read() {
		int c, n = 0;
		try {
			while((c = System.in.read()) <= 32);
			n = c & 15;
			while((c = System.in.read()) > 32) {
				n = (n << 3) + (n << 1) + (c & 15);
			}
		} catch (Exception e){}
		return n;
	}
}
