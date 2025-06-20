package no_1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int lines = Integer.parseInt(st.nextToken());
		int len = Integer.parseInt(st.nextToken());
		
		char[][] input = new char[lines][len];
		for(int i = 0; i < lines; i++) {
			input[i] = br.readLine().toCharArray();
		}
		
		boolean[][] isCorrectColor = new boolean[lines][len];
		char[] color = {'W', 'B'};
		for(int line = 0; line < lines; line++) {
			for(int idx = 0; idx < len; idx++) {
				isCorrectColor[line][idx] = (input[line][idx] == color[(line + idx) % 2]);
			}
		}
		
		int minCount = 65;
		for(int line = 0; line <= lines - 8; line++) {
			for(int idx = 0; idx <= len - 8; idx++) {
				
				int redrawCount = 0;
				for(int i = 0; i < 8; i++) {
					for(int j = 0; j < 8; j++) {
						if(!isCorrectColor[line + i][idx + j]) redrawCount++;
					}
				}
				if(redrawCount > 32) redrawCount = 64 - redrawCount;
				if(redrawCount < minCount) minCount = redrawCount;
				
			}
		}
		
		System.out.println(minCount);
		
	}
}
