package no_1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder stb = new StringBuilder();
		
		int testCase = Integer.parseInt(st.nextToken());
		for(int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			stb.append(Combinations_mCn(m, n)).append("\n");
		}
		System.out.println(stb);
	}
	
	static long Combinations_mCn(int m, int n) {
		long res = 1;
		for(int i = 0; i < n; i++) {
			res *= (m-i);
			res /= (i+1);
		}
		return res;
	}
}
