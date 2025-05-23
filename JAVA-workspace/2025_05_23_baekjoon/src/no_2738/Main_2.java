package no_2738;

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
		
		int[][] res = new int[N][M];
		
		for(int i = 0; i < N * 2; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				if( i < N ) {
					res[i][j] += Integer.parseInt(st.nextToken());
				}else {
					res[i-N][j] += Integer.parseInt(st.nextToken());
					sb.append(res[i-N][j]).append(' ');
				}
			}
			if( i >= N )sb.append('\n');
		}
		
		System.out.println(sb);
	}
}
