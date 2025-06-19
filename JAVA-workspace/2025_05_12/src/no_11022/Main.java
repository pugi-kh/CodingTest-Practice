package no_11022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
		int A, B; // 테스트 케이스 변수
		
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			pw.printf("Case #%d: %d + %d = %d\n", i, A, B, A+B); // append를 많이 사용하는 것보다 형식지정이 나을듯
		}
		pw.flush();
		br.close();
	}
}
