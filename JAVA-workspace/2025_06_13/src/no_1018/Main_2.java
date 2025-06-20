package no_1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2 {
	static final int INF = 64;
	static int Board = 8;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int lines = Integer.parseInt(st.nextToken());
		int len = Integer.parseInt(st.nextToken());
		
		char[][] input = new char[lines][len];
		for(int i = 0; i < lines; i++) {
			input[i] = br.readLine().toCharArray();
		}
		
		char[] color = {'W', 'B'};
		int[][] redrawSum = new int[lines][len+1];
		for(int line = 0; line < lines; line++) {
			for(int idx = 1; idx < len+1; idx++) {
				if(input[line][idx-1] != color[(line + idx) % 2]) {
					redrawSum[line][idx] = redrawSum[line][idx - 1] + 1;
				}else {
					redrawSum[line][idx] = redrawSum[line][idx - 1];
				}
			}
		}
		
		int minCount = INF;
		for(int line = 0; line + Board-1 < lines; line++) {
			for(int idx = 1; idx + Board-1 < len+1; idx++) {
				int count = 0;
				for(int i = 0; i < Board; i++) {
					count += redrawSum[line+i][idx+Board-1] - redrawSum[line+i][idx-1];
				}
				count = Math.min(count, 64 - count);
				minCount = Math.min(minCount, count);
			}
		}
		
		System.out.println(minCount);
		
	}
}
