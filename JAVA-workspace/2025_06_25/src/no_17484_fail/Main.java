package no_17484_fail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다 틀렸으... DFS 방식으로 풀어야되는데 쉬운문제 좀 찾아보고 나중에 다시 도전
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int[][] toMoon = new int[h][w];
		
		for(int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < w; j++) {
				toMoon[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int prevMove = 9; // -1, 0, 1
		int[][] minFuel = new int[h][w];
		minFuel[0] = toMoon[0];
		
		for(int i = 1; i < h; i++) {
			for(int j = 0; j < w; j++) {
				int tempMin = (int)2e+9;
				int move = 9;
				
				for(int k = j-1; k <= j+1; k++) {
					try {
						if((k - j) == prevMove) continue;
						if(tempMin > minFuel[i-1][k] + toMoon[i][j]) {
							tempMin = minFuel[i-1][k] + toMoon[i][j];
							move = k - j;
						}
					}catch(Exception e) {
						continue;
					}
				}
				prevMove = move;
				minFuel[i][j] = tempMin;
			}
		}
		
		
//		StringBuilder stb = new StringBuilder();
//		for(int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				stb.append(toMoon[i][j]).append("\t");
//			}
//			stb.append("\n");
//		}
//		stb.append("==============================").append("\n");
//		for(int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				stb.append(minFuel[i][j]).append("\t");
//			}
//			stb.append("\n");
//		}
//		System.out.println(stb);
	}
}
