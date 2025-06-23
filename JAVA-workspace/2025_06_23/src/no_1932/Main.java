package no_1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int[][] nums = new int[n][];
		nums[0] = new int[1];
		nums[0][0] = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j <= i; j++) {
				if(nums[i] == null) nums[i] = new int[i+1];
				
				nums[i][j] = Integer.parseInt(st.nextToken());
				
				if(j == 0) nums[i][0] += nums[i-1][0];
				else if(j == i) nums[i][j] += nums[i-1][j-1];
				else nums[i][j] += Math.max(nums[i-1][j], nums[i-1][j-1]);
			}
		}
		
		int max = nums[n-1][0];
		for(int i = 0; i < n; i++) {
			max = max > nums[n-1][i] ? max : nums[n-1][i];
		}
		System.out.println(max);
	}
}
