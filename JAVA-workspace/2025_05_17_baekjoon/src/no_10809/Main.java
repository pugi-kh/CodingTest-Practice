package no_10809;
// 한 문자마다 a부터 z까지 포함한다면 처음 등장하는 위치, 포함하지 않는다면 -1 출력
// 출력은 각 알파벳마다 한번씩 26번

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		String S; // 소문자로 이루어진 문자열
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		S = br.readLine();
		char[] sArray = S.toCharArray();
		
		for(char a = 'a'; a <= 'z'; a++) {
			int i = 0; // a와 sArray의 요소가 같은 부분의 위치 
			for(char s : sArray) {
				if(s == a) break; // 첫번째 요소를 찾으면 반환
				i++; // 마지막까지 찾지 못했을 때와, 마지막에 찾았을 때를 구분하기 위해
			}

			if(i > sArray.length -1) i = -1; // i가 sArray의 범위를 벗어나면 -1
			bw.append(String.valueOf(i)).append(' ');
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
