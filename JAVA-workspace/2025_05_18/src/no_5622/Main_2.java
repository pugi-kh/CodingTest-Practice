package no_5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray(); // 입력하는 문자
		int totalTime = 0; // 걸리는 총 시간
		
		String[] dial = {"2:ABC", "3:DEF", "4:GHI", "5:JKL", "6:MNO", "7:PQRS", "8:TUV", "9:WXYZ"};
		
		for( char ch : input ) { // 문자 하나마다
			for(int i = 0; i < dial.length; i++) { // 해당하는 숫자를 확인 => +1하면 걸리는 시간
				if(dial[i].contains(String.valueOf(ch))) {
					totalTime += Integer.parseInt( String.valueOf(dial[i].charAt(0)) ) +1 ;
					break;
				}
			}
		}
		
		System.out.println(totalTime);
	}
}
