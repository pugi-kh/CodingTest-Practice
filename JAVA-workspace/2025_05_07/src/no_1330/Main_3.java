package no_1330;
//두 수 비교하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		
		short A = Short.parseShort(st.nextToken());
		short B = Short.parseShort(st.nextToken());
		
		String result = A > B ? ">" : ( A < B ? "<" : "==" );
		
		System.out.println(result);
	}
}
