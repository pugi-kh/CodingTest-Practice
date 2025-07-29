package no_1764;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		/*
		 * 1. 아이디어
		 * 	듣도보도못한 사람 수 : int unknownCount를 선언하고
		 * 	듣도 못한 사람(unheard)을 Set에 입력
		 * 	보도 못한 사람(unseen)을 읽을 때, unheard에 있는지 확인
		 * 	있던 이름이라면 unknownList에 추가, unknownCount++
		 * 	unknownList를 사전순으로 정렬 List.sort(unknownList)
		 * 	stb에 정렬된 값 입력
		 * 	count를 출력하고 stringBuilder 출력
		 * 
		 * 2. 시간복잡도
		 * 	0 <= n <= 500,000
		 * 	0 <= m <= 500,000
		 * 	
		 * 	Set에 입력하는데 n번, unheard에 있는지 확인(O(1)) m번
		 * 	시간복잡도: n + m => 최대 1,000,000
		 * 
		 * 3. 자료구조
		 * 	Set<String>
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder stb = new StringBuilder();
		
		String[] firstline = br.readLine().split(" ");
		int n = Integer.parseInt(firstline[0]);
		int m = Integer.parseInt(firstline[1]);
		
		Set<String> unheard = new HashSet<String>();
		for(int i = 0; i < n; i++) {
			unheard.add(br.readLine());
		}
		
		int unknownCount = 0;
		List<String> unknown = new ArrayList<String>();
		for(int i = 0; i < m; i++) {
			String input = br.readLine();
			if(unheard.contains(input)) {
				unknown.add(input);
				unknownCount++;
			}
		}
		
		unknown.sort(Comparator.naturalOrder());
		for(String name : unknown) {
			stb.append(name).append('\n');
		}
		
		System.out.println(unknownCount);
		bw.write(stb.toString());
		bw.flush();
	}
}
