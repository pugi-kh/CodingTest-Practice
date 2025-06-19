package no_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		int[] input = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		// Arrays.stream 을 이용해 Integer로 매핑
		// .mapToInt( s -> Integer.parseInt(s) ) => .mapToInt(Integer::parseInt)로 짧게 작성 가능
		// 마지막에 stream을 Array로 변환 .toArray();
		int min = input[0];
		int max = input[0];
		for(int x : input) {
			if (x < min) min = x;
			if (x > max) max = x;
		}
		System.out.println(min + " " + max);
	}
}
