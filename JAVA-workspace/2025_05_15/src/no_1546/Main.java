package no_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Double> scores = new ArrayList<Double>();
		
		double score = Double.parseDouble(st.nextToken());
		double max = score;
		scores.add(score);
		
		for(int i = 0; i < N-1; i++) { // 위에 첫번째 값 입력해서 갯수 -1
			score = Double.parseDouble(st.nextToken());
			scores.add(score);
			if(score > max) max = score;
		}
		
		double total = 0;
		for(int i = 0; i < N; i++) total += scores.get(i)/max*100;
		
		System.out.println(total / N);
		
	}
}
