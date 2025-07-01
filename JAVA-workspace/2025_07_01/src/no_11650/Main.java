package no_11650;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] node = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			String[] temp = br.readLine().split(" ");
			node[i][0] = Integer.parseInt(temp[0]);
			node[i][1] = Integer.parseInt(temp[1]);
		}
		
		Arrays.sort(node, (a, b) -> (a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1])) );
		
		for(int i = 0; i < n; i++) {
			System.out.println(node[i][0] + " " + node[i][1]);
		}
	}
}
