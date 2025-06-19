package no_3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] list_x = new int[3];
		int[] list_y = new int[3];
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			list_x[i] = Integer.parseInt(st.nextToken());
			list_y[i] = Integer.parseInt(st.nextToken());
		}
		
		int x = list_x[0] ^ list_x[1] ^ list_x[2];
		int y = list_y[0] ^ list_y[1] ^ list_y[2];
		
		System.out.printf("%d %d", x, y);
	}
}
