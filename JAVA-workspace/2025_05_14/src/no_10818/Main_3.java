package no_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		String[] tokens = br.readLine().trim().split(" ");
		
		int min = Integer.parseInt(tokens[0]);
		int max = Integer.parseInt(tokens[0]);
		int token;
		for(int i = 0; i<tokens.length; i++) {
			token = Integer.parseInt(tokens[i]);
			if(min > token) min = token;
			else if(max < token) max = token;
		}
		
		System.out.println(min + " " + max);
		
	}
}

