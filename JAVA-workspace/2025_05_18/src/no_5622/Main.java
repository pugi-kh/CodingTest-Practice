package no_5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int totalTime = 0;
		
		char[] dial = {'A', 'D', 'G', 'J', 'M', 'P', 'T', 'W', 'Z'+1};
		
		for(int i = 0; i < input.length(); i++) { // 입력문자열에서 문자를 1개씩 불러와서 문자에 맞는 번호를 sb에 각각 추가 
			char a = input.charAt(i);
			
			for(int num = 0; num < 9; num++) {
				if(a >= dial[num]) continue;
				if(a < dial[num]) totalTime += num + 2; break;
			}
		}
		
		System.out.println(totalTime);
	}
}
