package no_14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// HashSet을 사용하는 방법이 있음
// 문자열을 그대로 비교하는 방식에 비해 훨씬 빠름
public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Set<String> s = new HashSet<String>();
		
		for(int i = 0; i < n; i++) s.add(br.readLine());
		
		int count = 0;
		for(int i = 0; i < m; i++) {
			if(s.contains(br.readLine())) count++;
		}
		
		System.out.println(count);
	}
}
