package no_10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] bucket = new int[N];
		
		for(int i = 0; i < N; i++) bucket[i] = i+1;
		
		int sIdx, eIdx, temp;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			sIdx = Integer.parseInt(st.nextToken()) -1;
			eIdx = Integer.parseInt(st.nextToken()) -1;
			
			for(int j = 0; j <= (eIdx - sIdx) / 2; j++) {
				temp = bucket[sIdx + j];
				bucket[sIdx + j] = bucket[eIdx - j];
				bucket[eIdx - j] = temp;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) sb.append(bucket[i]).append(' ');
		System.out.println(sb);
		
	}
}
