package no_2444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int num = Integer.parseInt(br.readLine());
    
    for(int i = 0, star = -1, space = num; i < num*2 -1; i++) {
			if(i < num) { // 별+2 증가, 공백 감소
				star += 2;
				space--;
			}else { // 별-2 감소, 공백 증가
				star -= 2;
				space++;
			}
			sb.append(" ".repeat(space)).append("*".repeat(star)).append('\n');
		}
    System.out.println(sb);
	}
}
