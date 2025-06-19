package no_2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int five = n / 5;
		int three = 0;
		
		if(n % 5 == 0) {
			System.out.println(five);
		}else {
			for(int i = 1; i < 5; i++) {
				three = i;
				five = (n - (3*i)) / 5;
				if(five < 0) {
					System.out.println(-1);
					break;
				}
				if((n - (3*i)) % 5 == 0) {
					System.out.println(five + three);
					break;
				}
			}
		}
	}
}
