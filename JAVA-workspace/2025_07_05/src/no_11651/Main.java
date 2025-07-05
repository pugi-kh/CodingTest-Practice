package no_11651;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		int n = read();
		int[][] node = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			node[i][0] = read();
			node[i][1] = read();
		}
		
		
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
