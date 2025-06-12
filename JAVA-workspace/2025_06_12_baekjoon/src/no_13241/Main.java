package no_13241;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		long a = Long.parseLong(input[0]);
		long b = Long.parseLong(input[1]);
		
		System.out.println(lcm(a, b));
	}
	static long gcd(long a, long b) {
		while(b != 0) {
			long r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}
}
