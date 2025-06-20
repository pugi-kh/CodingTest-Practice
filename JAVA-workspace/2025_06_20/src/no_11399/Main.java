package no_11399;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int ppl = Integer.parseInt(br.readLine());
		int[] times = new int[ppl + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= ppl; i++) {
			times[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(times);
		int total = 0;
		for(int i = 1; i <= ppl; i++) {
			times[i] += times[i-1];
			total += times[i];
		}
		
		System.out.println(total);
	}
}
