package no_2738;

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
		
		int[][] A = makeMatrix(N, M, br);
		int[][] B = makeMatrix(N, M, br);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				sb.append(A[i][j] + B[i][j]).append(' ');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
	
	static int[][] makeMatrix(int N, int M, BufferedReader br) {
		int[][] Matrix = new int[N][M];
		
		try {
			
			for(int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < M; j++) {
					Matrix[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
		} catch (Exception e) {}
		
		return Matrix;
	}
}
