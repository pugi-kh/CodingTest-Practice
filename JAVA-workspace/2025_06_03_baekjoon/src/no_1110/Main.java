package no_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int firstNum = Integer.parseInt(br.readLine());
		int n = firstNum;
		int count = 0;
		
		while(true) {
			int b = (n%10); // 원래 수의 오른쪽 끝 수
			int a = ((n/10) + (n%10)) % 10; // 각 자리 수 합의 가잘 오른쪽 수
			n = b * 10 + a;
			count++;
			if(n == firstNum) break;
		}
		
		System.out.println(count);
	}
}
