package no_14215;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] side = new int[3];
		for(int i = 0; i < 3; i++) {
			side[i] = readInt();
		}
		Arrays.sort(side);
		while((side[0] + side[1]) <= side[2]) {
			side[2] = (side[0] + side[1]) -1;
		}
		System.out.println(side[0] + side[1] + side[2]);
	}
	static int readInt() {
		int c, n = 0;
		try {
			while((c = System.in.read()) <= 32);
			n = c & 15;
			while((c = System.in.read()) > 32) {
				n = (n << 3) + (n << 1) + (c & 15);
			}
		}catch (Exception e) {}
		
		return n;
	}
}
