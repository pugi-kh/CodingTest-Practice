package no_1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nth = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int sum = 1;
		while(nth > sum) {
			nth -= sum;
			sum++;
		}
		sum++;
		
		if(sum % 2 == 0) {
			sb.append(sum - nth).append('/').append(nth);
		}else {
			sb.append(nth).append('/').append(sum - nth);
		}
		System.out.println(sb);
	}
}
