package no_21921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken());
		int period = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] visitorSum = new int[len + 1];
		
		int sum, max = 0, maxCount = 0;
		
		for(int i = 1; i < len + 1; i++) {
			int temp = Integer.parseInt(st.nextToken());
			visitorSum[i] = visitorSum[i-1] + temp;
		}
		for(int i = period; i < len + 1; i++) {
			sum = visitorSum[i] - visitorSum[i - period];
			if(sum > max) {
				max = sum;
				maxCount = 1;
			}else if(sum == max) {
				maxCount++;
			}
		}
		
		if(max == 0) System.out.println("SAD");
		else {
			System.out.println(max);
			System.out.println(maxCount);
		}
	}
}
