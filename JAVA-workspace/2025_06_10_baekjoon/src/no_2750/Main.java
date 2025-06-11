package no_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stb = new StringBuilder();
		int test = Integer.parseInt(br.readLine());
		int[] list = new int[test];
		for(int i = 0; i < test; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(list);
		for(int i = 0; i < test; i++) {
			stb.append(list[i]).append("\n");
		}
		System.out.println(stb);
	}

}
