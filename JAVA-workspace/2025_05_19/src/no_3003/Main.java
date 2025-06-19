package no_3003;

/*
 * 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		int[] total = {1, 1, 2, 2, 2, 8};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 6; i++) {
			total[i] -= Integer.parseInt(st.nextToken());
			sb.append(String.valueOf(total[i])).append(' ');
		}
		
		
		
		System.out.println(sb);
	}
}
