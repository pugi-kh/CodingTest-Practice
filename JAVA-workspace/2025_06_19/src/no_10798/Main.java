package no_10798;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] input = new char[5][];
		int maxLen = 0;
		for(int i = 0; i < 5; i++) {
			input[i] = br.readLine().toCharArray();
			int len = input[i].length;
			if(len > maxLen) maxLen = len;
		}
		StringBuilder stb = new StringBuilder();
		for(int idx = 0; idx < maxLen; idx++) {
			for(int i = 0; i < 5; i++) {
				if(input[i].length > idx) {
					stb.append(input[i][idx]);
				}
			}
		}
		System.out.println(stb);
	}
}
