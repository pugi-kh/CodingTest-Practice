package no_1037;
// https://www.acmicpc.net/problem/1037

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int divisor_count = Integer.parseInt(br.readLine());
		int[] divisors = new int[divisor_count];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < divisor_count; i++) {
			divisors[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(divisors);
		
		int originalNum = divisors[0] * divisors[divisor_count-1];
		System.out.println(originalNum);
	}
}
