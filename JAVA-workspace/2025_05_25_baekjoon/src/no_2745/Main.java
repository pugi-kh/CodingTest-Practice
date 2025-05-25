package no_2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		char[] input = st.nextToken().toCharArray();
		int N = Integer.parseInt(st.nextToken());
		int result = 0;
		
		for(char x : input) {
			int token = 0;
			
			if(x >= 'A') {
				token = (x - 'A' + 10);
			}else {
				token = x - '0';
			}
			
			result = (result * N) + token;
		}
		
		System.out.println(result);
	}
}
