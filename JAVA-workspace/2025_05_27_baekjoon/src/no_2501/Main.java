package no_2501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);
		
		int a = 0;
		while(K > 0) {
			a++;
			if(a > N) {
				a = 0;
				break;
			}
			if(N % a == 0) {
				K--;
			}
		}
		System.out.println(a);
	}
}
