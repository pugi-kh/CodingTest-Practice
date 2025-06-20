package no_2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int test = Integer.parseInt(br.readLine());
		int change;
		// 쿼터(Quarter, $0.25), 다임(Dime, $0.10), 니켈(Nickel, $0.05), 페니(Penny, $0.01)
		int quater;
		int diam;
		int nickel;
		int penny;
		
		for(int i = 0; i < test; i++) {
			change = Integer.parseInt(br.readLine());
			
			quater = change / 25;
			diam = (change % 25) / 10;
			nickel = (change % 25 % 10) / 5;
			penny = change % 5;
			
			sb.append(quater).append(' ')
				.append(diam).append(' ')
				.append(nickel).append(' ')
				.append(penny).append('\n');
		}
		
		System.out.println(sb);
	}
}
