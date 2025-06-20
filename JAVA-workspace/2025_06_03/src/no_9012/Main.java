package no_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int left = 0;
			char[] test = br.readLine().toCharArray();
			
			for(char x : test) {
				if(x == '(') left++;
				else if(x == '\n') break;
				else left--;
				
				if(left < 0) {
					break;
				}
			}
			
			if(left == 0) {
				sb.append("YES\n");
			}else {
				sb.append("NO\n");
			}
		}
		
		System.out.println(sb);
	}
}
