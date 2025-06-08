package no_2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sInput = br.readLine();
		int input = Integer.parseInt(sInput);
		int input_len = sInput.length();
		
		for(int n = input - 9*input_len; n < input; n++) {
			int r = 0;
			for(int t = n; t > 0; t /= 10) {
				r += t % 10;
			}
			
			if(n + r == input) {
				System.out.println(n);
				return;
			}
		}
		System.out.println(0);
		
	}
}
