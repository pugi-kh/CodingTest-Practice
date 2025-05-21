package no_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 이건 지피티가 알려준 방식..
// 왜 계속 틀리는지 몰라서 틀린부분 물어보다가 알게됐는데 깔끔하네.. 역시;;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		String[] croatian = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

		for (String str : croatian) {
			input = input.replace(str, "*");  // 크로아티아 알파벳을 한 글자 "*"로 대체
		}

		System.out.println(input.length());  // 최종 길이 = 크로아티아 문자 수 + 일반 문자 수
	}
}
