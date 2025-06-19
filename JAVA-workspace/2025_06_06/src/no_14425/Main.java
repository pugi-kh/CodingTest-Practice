package no_14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int sLen = Integer.parseInt(input[0]);
		String[] s = new String[sLen];
		int testLen = Integer.parseInt(input[1]);
		
		for(int i = 0; i < sLen; i++) {
			s[i] = br.readLine();
		}
		int count = 0;
		for(int i = 0; i < testLen; i++) {
			if(Arrays.asList(s).contains(br.readLine())) count++;
		}
		
		System.out.println(count);
	}
}
