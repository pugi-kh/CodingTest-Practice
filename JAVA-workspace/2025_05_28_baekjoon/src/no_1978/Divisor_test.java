package no_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Divisor_test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> divisors = new ArrayList<>();
		
		for(int i = 1; i*i <= N; i++){
			if(N % i == 0){
				divisors.add(i);
				divisors.add(N / i);
			}
		}
		// divisors => N의 약수들의 리스트
		
		StringBuilder sb = new StringBuilder();
		divisors.sort(Comparator.naturalOrder());
		for(int i = 0; i < divisors.size(); i++) {
			sb.append(divisors.get(i).toString()).append(" ");
		}
		System.out.println(sb);
	}
}
