package no_10810;
// 바구니가 N개 있음 - 각 바구니에 번호 붙어있음 - 처음엔 비어있음 - 바구니당 공 1개
// 1 ~ N 까지 번호의 공이 있음
// 공을 M번 넣을 것임
// 바구니의 범위(N)을 먼저 정하고 같은 번호의 공을 넣는다.
// 공이 이미 있을 경우 공을 빼고 새 공을 넣는다.
// 공을 넣을 바구니는 연속되어야 한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 바구니의 개수
			int M = Integer.parseInt(st.nextToken()); // 공을 넣을 횟수
			int[] bucket = new int[N];
			int s_idx, e_idx, ball_num;
			
			for(int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				
				s_idx = Integer.parseInt(st.nextToken()) -1;
				e_idx = Integer.parseInt(st.nextToken()) -1;
				ball_num = Integer.parseInt(st.nextToken());
				
				for(int j = s_idx; j <= e_idx; j++) bucket[j] = ball_num;
			}
			
			StringBuilder sb = new StringBuilder();
			for(int x : bucket) sb.append(x).append(' ');
			
			System.out.println(sb);
			
		} catch (Exception ignore) {}
		
	}
}
