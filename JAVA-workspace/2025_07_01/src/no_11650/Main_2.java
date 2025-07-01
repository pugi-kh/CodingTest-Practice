package no_11650;

import java.io.IOException;
import java.util.Arrays;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		int n = read();
		int[][] node = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			node[i][0] = read();
			node[i][1] = read();
		}
		
		Arrays.sort(node, (a, b) -> (a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1])) );
		
		StringBuilder stb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			stb.append(node[i][0]).append(" ").append(node[i][1]).append("\n");
		}
		System.out.println(stb);
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
