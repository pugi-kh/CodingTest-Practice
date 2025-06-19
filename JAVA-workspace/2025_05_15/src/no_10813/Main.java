package no_10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 바구니 개수
		int M = Integer.parseInt(st.nextToken()); // 반복 횟수
		
		int[] bucket = new int[N];
		for(int i = 0; i < N; i++) bucket[i] = i+1;
		
		int idx_1, idx_2, temp;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			idx_1 = Integer.parseInt(st.nextToken()) - 1;
			idx_2 = Integer.parseInt(st.nextToken()) - 1;
			
			temp = bucket[idx_1];
			bucket[idx_1] = bucket[idx_2];
			bucket[idx_2] = temp;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) sb.append(bucket[i]).append(' ');
		
		System.out.println(sb);
	}
}
