package no_10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append(br.readLine());
		
		String input = sb.toString();
		String reverse = sb.reverse().toString();
		
		int result = input.equals(reverse) ? 1 : 0;
		System.out.println(result);
	}
}
