package no_11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		if(num == 1) return;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				sb.append(i).append('\n');
				num /= i;
				i = 1;
			}
		}
		
		System.out.println(sb);
	}
}
