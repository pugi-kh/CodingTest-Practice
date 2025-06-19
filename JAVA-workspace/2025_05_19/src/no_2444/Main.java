package no_2444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine().trim());
		
		StringBuilder sb_main = new StringBuilder();
		
		for(int i = 0, star = -1, space = num; i < num*2 -1; i++) {
			if(i < num) { // 별+2 증가, 공백 감소
				star += 2;
				space--;
			}else { // 별-2 감소, 공백 증가
				star -= 2;
				space++;
			}
			sb_main.append(starLine(star, space)).append('\n');
		}
		
		System.out.println(sb_main);
	}
	
	static String starLine(int star, int space) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < space; i++) sb.append(' ');
		for(int i = 0; i < star; i++) sb.append('*');
		
		return sb.toString();
	}
}
