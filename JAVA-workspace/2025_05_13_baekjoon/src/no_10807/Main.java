package no_10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().trim().split(" ");
		int v = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(String token : line) {
			if(Integer.parseInt(token) == v) result++;
		}
		
		System.out.println(result);
	}
}
