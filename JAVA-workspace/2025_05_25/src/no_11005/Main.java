package no_11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int input = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		while (input > 0) {
			int mod = input % n;
			input /= n;
			
			if(mod > 9) {
				sb.insert(0, (char)(mod -10 + 'A'));
			}else {
				sb.insert(0, mod);
			}
		}
		
		System.out.println(sb);
	}
}
