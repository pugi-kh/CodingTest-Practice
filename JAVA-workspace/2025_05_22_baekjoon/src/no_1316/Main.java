package no_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(isGroupWord(br.readLine())) count++;
		}
		
		System.out.println(count);
		
	}
	
	static boolean isGroupWord(String str) {
		char[] charArr = str.toCharArray();
		int charLen = 1;
		for(int i = 0; i < str.length()-1; i++) {
			if(charArr[i] == charArr[i+1]) {
				charArr[i] = '*';
			}
			if(charArr[i] != '*') charLen++;
		}
		
		HashSet<Character> charSet = new HashSet<Character>();
		for(int i = 0; i < str.length(); i++) {
			charSet.add(str.charAt(i));
		}
		
		boolean result = false;
		if(charLen == charSet.size()) {
			result = true;
		};
		
		return result;
	}
}
