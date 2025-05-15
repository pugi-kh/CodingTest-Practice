package no_10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] bucket = new int[N+1]; // 다른 답안에서 이부분이 가독성을 확 올려줬음
		for(int i = 1; i <= N; i++) bucket[i] = i;
		
		int x, y, temp;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			while (x < y) { //이부분도 for문 안써서 깔끔해보였음
				temp = bucket[x];
				bucket[x] = bucket[y];
				bucket[y] = temp;
				
				x++; y--;
			}
		}
		
		for(int i = 1; i <= N; i++) sb.append(bucket[i]).append(' ');
		System.out.println(sb);
		br.close();
	}
}
