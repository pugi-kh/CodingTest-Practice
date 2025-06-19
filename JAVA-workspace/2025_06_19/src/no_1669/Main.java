package no_1669;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int dif = y - x;
		
		int i = 0;
		long sum = 0;
		int count = 0;
		while(true) {
			if(dif == 0) break;
			if(dif <= sum*2 - i) {
				count *=2;
				count--;
				break;
			}
			if(dif <= sum*2) {
				count *= 2;
				break;
			}
			sum += ++i;
			count++;
		}
		System.out.println(count);
	}
}
