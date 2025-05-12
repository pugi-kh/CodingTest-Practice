package no_8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(
				new BufferedReader(new InputStreamReader(System.in)).readLine());
		
		int num = Integer.parseInt(st.nextToken());
		
//		int result = 0;
//		for(int i = 1; i <= num; i++) {
//			result += i;
//		}
		
		int result = (num*(num+1))/2; //공식 사용으로 시간복잡도 O(n) -> O(1)로 개선
		
		PrintWriter pw = new PrintWriter(System.out);
		pw.println(result);
		pw.flush();
	}
}
