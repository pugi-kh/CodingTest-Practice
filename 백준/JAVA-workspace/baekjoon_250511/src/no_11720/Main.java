package no_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		br.close();
		
		int result = 0;
		for(int i = 0; i < N; i++) {
			result += input.charAt(i) - '0';
		}
		
		System.out.println(result);
	}
}
