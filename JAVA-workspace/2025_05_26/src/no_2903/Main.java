package no_2903;
// 한변에 점의 개수 : 초기값 2
// 한번 진행할 때마다 이전값을 x 라고 했을 때
// x = x + (x - 1)개가 됨
// 점의 개수 = x * x

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x = 2; // 한 변의 점의 개수
		
		for(int i = 0; i < n; i++) {
			x = x + (x - 1);
		}
		
		System.out.println(x * x);
	}
}
