package no_4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			int student = Integer.parseInt(st.nextToken());
			int[] scores = new int[student];
			
			double total = 0;
			for(int j = 0; j < student; j++) {
				scores[j] = Integer.parseInt(st.nextToken());
				total += scores[j];
			}
			
			double avgScore = total / student;
			int honorStudents = 0;
			
			for(int score : scores) {
				if(score > avgScore) honorStudents++;
			}
			
			double res = ((double)honorStudents / student) * 100;
			sb.append(String.format("%.3f", res)).append("%\n");
		}
		
		System.out.println(sb);
	}
}
