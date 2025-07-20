package no_1620;
/*
 * 1. 아이디어
 * 		for 문을 통해서 번호를 키로 포켓몬 이름을 매핑
 * 		매핑된 키와 값을 반대로 다시 이름을 키로 번호를 매핑
 * 
 *  	if 문을 통해서 입력이 숫자일 경우 숫자가 키인 맵에서 값을 출력
 *  	입력이 문자일 경우 문자가 키인 맵에서 값을 출력
 * 
 * 2. 시간복잡도
 * 		N과 M은 1 ~ 100,000
 * 		for 문을 2번 돌고 -> 200,000
 * 		if 문으로 분류 후 값 출력
 * 
 * 3. 자료구조
 * 		HashMap 2개
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int pokemonNum = Integer.parseInt(st.nextToken());
		int questionCount = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, String> IntMap = new HashMap<Integer, String>();
		HashMap<String, Integer> StrMap = new HashMap<String, Integer>();
		// 키: int, 값: String
		for(int i = 1; i <= pokemonNum; i++) {
			IntMap.put(i, br.readLine());
		}
		// 키: String, 값: int
		for(int i = 1; i <= pokemonNum; i++) {
			StrMap.put(IntMap.get(i), i);
		}
		
		StringBuilder stb = new StringBuilder();
		for(int i = 0; i < questionCount; i++) {
			String input = br.readLine();
			if(Character.isDigit(input.charAt(0))) {
				// 입력이 숫자일 경우
				int num = Integer.parseInt(input);
				stb.append(IntMap.get(num)).append("\n");
			}else {
				// 입력이 문자일 경우
				stb.append(StrMap.get(input)).append("\n");
			}
		}
		bw.write(stb.toString());
		bw.flush();
	}
}
