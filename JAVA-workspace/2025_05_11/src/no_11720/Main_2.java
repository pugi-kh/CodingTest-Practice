package no_11720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long input = Long.parseLong(br.readLine());
		
		int result = 0;
		for(int i = 0; i < N; i++) {
			result += input % 10;
			input /= 10;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(result));
		bw.flush();
	}
}
// 런타임 에러
// Long을 사용해도 자리수가 너무 길어져서 문제가 생기는 거였음
// N이 1 ~ 100까지였음
// String으로 받아서 charAt() 쓰는게 나은듯