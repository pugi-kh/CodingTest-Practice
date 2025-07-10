package no_18870_fail;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> inputs = new ArrayList<Integer>();
		ArrayList<Integer> inOrder = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			inputs.add(num);
			if(!inOrder.contains(num)) inOrder.add(num);
		}
		inOrder.sort(Comparator.naturalOrder());
		
		StringBuilder stb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			int order = inOrder.indexOf(inputs.get(i));
			stb.append(order).append(" ");
		}
		System.out.println(stb);
	}
}
//	시간 초과
//	1 ≤ N ≤ 1,000,000
//	-10^9 ≤ Xi ≤ 10^9