package no_10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] input = new char[5][];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 5; i++) {
			input[i] = br.readLine().toCharArray();
			for(int j = 0; j < input[i].length; j++) {
			}
		}
		for(int j = 0; j < 15; j++) {
			for(int i = 0; i < 5; i++) {
				if(j < input[i].length) {
					sb.append(input[i][j]);
				}
			}
		}
		System.out.println(sb.toString());
		
	}
}
