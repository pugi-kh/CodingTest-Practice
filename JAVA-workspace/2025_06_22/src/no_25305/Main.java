package no_25305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int applicantCount = Integer.parseInt(st.nextToken());
		int winnerCount = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] scores = new int[applicantCount];
		for(int i = 0; i < applicantCount; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(scores);
		
		System.out.println(scores[applicantCount - winnerCount]);
	}
}
