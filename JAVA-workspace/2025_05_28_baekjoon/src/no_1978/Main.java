package no_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int countPrime = 0;
		
		for(int i = 0; i < n; i++) {
			int input = Integer.parseInt(st.nextToken());
			boolean isPrime = false;
			
			for(int j = 2; j < input; j++) {
				if(input % j == 0) {
					isPrime = false;
					break;
				}
				isPrime = true;
			}
			
			if(isPrime || input == 2) countPrime++;
		}
		
		System.out.println(countPrime);
	}
}
