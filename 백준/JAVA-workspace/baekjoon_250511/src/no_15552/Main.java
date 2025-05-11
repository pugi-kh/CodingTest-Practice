package no_15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i = 0; i < T; i++) {
			String[] sp = br.readLine().split(" ");
			result = Integer.parseInt(sp[0]) + Integer.parseInt(sp[1]);
			bw.append(String.valueOf(result)).append("\n");			
		}
		br.close();
		bw.flush();
		
	}
}

// 빠른 A+B
// 여기 삽고수들 너무 많다...
// 비트 연산자를 사용해서 char 타입을 저렇게 간단히 int로 변환할 수 있는거 신기
// & 15 -> 풀어 써서 확인해보면 -48과 동일하다는 것을 알 수 있음. '0' => 48 (ASCII)
// input, output 버퍼를 배열로 미리 만들어놓고 작업.
// input할 index와 output할 index도 설정해서 ++와 반복문을 적절히 사용하여 위치를 옮겨줌
// 다른건 아직 뭔지 이해가 안된다