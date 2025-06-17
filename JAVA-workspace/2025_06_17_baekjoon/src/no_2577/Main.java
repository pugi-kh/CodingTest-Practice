package no_2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int abc = BrToInt(br) * BrToInt(br) * BrToInt(br);
		
		StringBuilder stb = new StringBuilder();
		stb.append(abc);
		
		char[] cl = stb.toString().toCharArray();
		
		int[] n = new int[10];
		for(char c : cl) {
			n[c&15]++;
		}
		
		stb = new StringBuilder();
		for(int i = 0; i < n.length; i++) {
			stb.append(n[i]).append("\n");
		}
		
		System.out.println(stb);
	}
	static int BrToInt(BufferedReader br) throws IOException {
		return Integer.parseInt(br.readLine());
	}
}
