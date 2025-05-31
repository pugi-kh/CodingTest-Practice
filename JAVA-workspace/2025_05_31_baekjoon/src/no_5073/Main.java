package no_5073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] t = new int[3];
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			t[0] = Integer.parseInt(st.nextToken());
			t[1] = Integer.parseInt(st.nextToken());
			t[2] = Integer.parseInt(st.nextToken());
			if(t[0] + t[1] + t[2] == 0) break;
			
			Arrays.sort(t);
			if((t[0] + t[1]) <= t[2]) {
				sb.append("Invalid\n");
			}else if(t[0] == t[1] || t[1] == t[2]) {
				if(t[0] == t[2]) sb.append("Equilateral\n");
				else sb.append("Isosceles\n");
			}else {
				sb.append("Scalene\n");
			}
		}
		System.out.println(sb);
	}
}
