package no_2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
//		int[][] matrix = new int[9][9]; // 안써도 될듯
		
//		int max = 0; // 모든 수가 0일때 row와 col이 변하지 않았음. 무조건 한번은 실행되려면 -1로 설정.
		int max = -1; 
		int row = 0, col = 0;
		for(int i = 0; i < 9; i++) {
			 st = new StringTokenizer(br.readLine());
			for(int j = 0, k = 0; j < 9; j++) {
				k = Integer.parseInt(st.nextToken());
				if(k > max) {
					max = k;
					row = i + 1;
					col = j + 1;
				}
			}
		}
		
		System.out.println(max);
		System.out.printf("%d %d", row, col);
	}
}
