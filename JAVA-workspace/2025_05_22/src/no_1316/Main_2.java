package no_1316;
// gpt도움.. 코드 더 깔끔하게 쓸 방법 없을까..
// 기존에는 연속되는 문자를 *로 치환 후 *을 삭제한 뒤 문자의 개수와
// hashset에 입력해서 중복값을 제거한 길이를 비교

// 아래 방식은 입력에 대해서 확인을 하다가 이전에 입력되었던 문자가 연속되지 않게 나온걸 확인하면
// 그 즉시 false를 return해서 내가 작성한 방식에 비해 연산이 적다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main_2 {
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
		HashSet<Character> charSet = new HashSet<Character>();
		char prev = 0;
		
		for(char x : charArr) {
			if(x != prev) {
				if(charSet.contains(x)) return false;
				charSet.add(x);
			}
			prev = x;
		}
		
		return true;
	}
}
