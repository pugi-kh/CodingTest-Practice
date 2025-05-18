package no_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); // StringBuilder에 reverse 메서드가 있었음..
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); // 다른사람 답안에서 확인함
		
		System.out.println(A > B ? A:B);
	}
}
