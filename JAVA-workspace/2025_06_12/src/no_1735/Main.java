package no_1735;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int numA = Integer.parseInt(st.nextToken());
		int denomA = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int numB = Integer.parseInt(st.nextToken());
		int denomB = Integer.parseInt(st.nextToken());
		
		int denominator = lcm(denomA, denomB);
		int numerator = numA * (denominator / denomA) + numB * (denominator / denomB);
		
		int gcd = gcd(denominator, numerator);
		
		denominator /= gcd;
		numerator /= gcd;
		
		System.out.println(numerator + " " + denominator);
	}
	static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
