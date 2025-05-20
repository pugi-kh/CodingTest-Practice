package no_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		HashSet<Character> inputUpperSet = new HashSet<Character>();
		
		for(int i = 0; i < input.length; i++) {
			char x = input[i];
			if(x >= 'a') input[i] = (char) (x - 'a' + 'A');
			inputUpperSet.add(input[i]);
		}
		
		Iterator<Character> inputSetIter = inputUpperSet.iterator();
		char[][] charCount = new char[inputUpperSet.size() +1][2]; //여유공간 확보
		
		for(int i = 0; i < inputUpperSet.size(); i++) {
			int count = 0;
			char y = inputSetIter.next();
			for(char x : input) if(x == y) count++;
			
			charCount[i][0] = y;
			charCount[i][1] = (char)count;
		}
		
		Arrays.sort(charCount, (o1, o2)->{
			return o2[1] - o1[1];
		});
		
		char result = '\0';
		if(inputUpperSet.size() > 1) {
			result = charCount[0][1] == charCount[1][1] ? '?' : charCount[0][0];			
		}else if(inputUpperSet.size() == 1) {
			result = charCount[0][0];
		}
		System.out.println(result);
		
	}
}
