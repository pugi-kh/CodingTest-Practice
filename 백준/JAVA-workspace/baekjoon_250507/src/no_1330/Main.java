package no_1330;
//두 수 비교하기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			br.close();
			
			StringTokenizer st = new StringTokenizer(line);
			
			short a = Short.parseShort(st.nextToken()); 
			short b = Short.parseShort(st.nextToken());
			// a, b 의 범위가 < 10,000 이기 때문에 최대 범위가 65,535인 short 로도 수용 가능
			
			if (a > b) {
				System.out.println(">");
			} else if(a < b) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}
			
		} catch (Exception e) {e.getMessage();}
		
	}
}
