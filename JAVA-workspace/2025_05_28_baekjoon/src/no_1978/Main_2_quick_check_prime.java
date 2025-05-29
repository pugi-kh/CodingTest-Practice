package no_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2_quick_check_prime {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int countPrime = 0;
		
		for(int i = 0; i < n; i++) {
			int input = Integer.parseInt(st.nextToken());
			boolean isPrime = true;
			
			if(input == 1) isPrime = false;
			else {
				for(int j = 2; j*j <= input; j++) {
					if(input % j == 0) {
						isPrime = false;
						break;
					}				
				}
			}
			
			if(isPrime) countPrime++;
		}
		
		System.out.println(countPrime);
	}
}
