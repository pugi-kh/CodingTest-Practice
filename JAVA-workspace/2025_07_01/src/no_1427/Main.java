package no_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().trim().toCharArray();
		Arrays.sort(input);
		StringBuilder stb = new StringBuilder();
		for(int i = input.length - 1; i >= 0; i--) {
			stb.append(input[i]);
		}
		System.out.println(stb);
	}
}
