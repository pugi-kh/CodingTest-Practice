package no_3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] list_x = new int[3];
		int[] list_y = new int[3];
		
		for(int i = 0; i < 3; i++) {
			String[] input =  br.readLine().split(" ");
			list_x[i] = Integer.parseInt(input[0]);
			list_y[i] = Integer.parseInt(input[1]);
		}
		Arrays.sort(list_x);
		Arrays.sort(list_y);
		
		int x = list_x[0] == list_x[1] ? list_x[2] : list_x[0];
		int y = list_y[0] == list_y[1] ? list_y[2] : list_y[0];
		
		System.out.printf("%d %d", x, y);
	}
}
