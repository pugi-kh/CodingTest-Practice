package no_3052;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		HashSet<Integer> mod = new HashSet<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input;
		
		try {
			for(int i = 0; i < 10; i++) {
				input = Integer.parseInt(br.readLine().trim());
				mod.add(input % 42);
			}
			System.out.println(mod.size());
		}catch (Exception e) {}
		
	}
}
