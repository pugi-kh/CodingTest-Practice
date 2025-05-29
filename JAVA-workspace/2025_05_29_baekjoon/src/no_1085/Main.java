package no_1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
//		int dist1 = w - x > x ? x : w - x;
//		int dist2 = h - y > y ? y : h - y;
//		
//		System.out.println(dist1 > dist2 ? dist2 : dist1);
		int dist1 = Math.min(w - x, x);
		int dist2 = Math.min(h - y, y);
		
		System.out.println(Math.min(dist1, dist2));
	}
}
