package no_2562;
// 9개의 자연수를 입력한다는 조건이 있어서 다시 작성
// 이전 코드는 입력값의 개수 제한이 없다고 생각했었음

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		// 1. 9개의 자연수를 입력받을 배열 선언 (자연수기 때문에 음수 고려 x)
		// 2. BufferedReader로 입력값 받아온 후 첫번째 값을 max로 선언, location = 1 초기화
		// 3. for문을 돌려 max값 검사 및 갱신. location도 함께
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] inputs = new int[9];
		int max = inputs[0] = Integer.parseInt(br.readLine());
		int location = 1;
		
		for(int i = 1; i < 9; i++) {
			inputs[i] = Integer.parseInt(br.readLine());
			if(inputs[i] > max) {
				max = inputs[i];
				location = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(location);
	}
}
