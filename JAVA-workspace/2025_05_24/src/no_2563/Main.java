package no_2563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] whitePaper = new int[100][100];
		int black = 0;
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int xPoint = Integer.parseInt(st.nextToken());
			int yPoint = Integer.parseInt(st.nextToken());
			
			for(int x = xPoint; x < xPoint+10; x++) {
				for(int y = yPoint; y < yPoint+10; y++) {
					whitePaper[x][y] = 1;
				}
			}
		}
		
		for(int x = 0; x < 100; x++) {
			for(int y = 0; y < 100; y++) {
				black += whitePaper[x][y];
			}
		}
		
		System.out.println(black);
	}
}
