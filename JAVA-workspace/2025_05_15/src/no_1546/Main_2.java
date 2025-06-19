package no_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Double> scores = new ArrayList<Double>();
		
		double score, max = 0, total = 0;
		for(int i = 0; i < N; i++) { 
			score = Double.parseDouble(st.nextToken());
			scores.add(score);
			total += score;
			if(score > max) max = score;
		}
		
		System.out.println(total / N / max * 100);
	}
}
