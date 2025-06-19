package no_8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		StringBuilder stb = new StringBuilder();
		while(test-->0) {
			char[] res = br.readLine().toCharArray();
			stb.append(getScore(res)).append("\n");
		}
		System.out.println(stb);
	}
	static int getScore(char[] res) {
		int score = 0;
		int total = 0;
		for(char c : res) {
			if( c == 'O' ) {
				total += ++score;
			}else {
				score = 0;
			}
		}
		return total;
	}
}
