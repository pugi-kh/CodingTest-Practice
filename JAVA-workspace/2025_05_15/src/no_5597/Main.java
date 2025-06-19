package no_5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		boolean[] stu = new boolean[30];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int done;
		for(int i = 0; i < 28; i++) {
			done = Integer.parseInt(br.readLine().trim());
			stu[done-1] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 30; i++) {
			if(stu[i] == false) sb.append(i+1).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
}
