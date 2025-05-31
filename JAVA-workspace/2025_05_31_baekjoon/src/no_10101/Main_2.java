package no_10101;

import java.io.IOException;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		int a = read();
		int b = read();
		int c = read();
		
		int sum = a + b + c;

		if (sum != 180) System.out.print("Error");
		else if (a == b && b == c) System.out.print("Equilateral");
		else if (a == b || a == c || b == c) System.out.print("Isosceles");
		else System.out.print("Scalene");
	}
	
	static int read() throws IOException {
		int c;
		while ((c = System.in.read()) <= 32);
		int n = c & 15;
		while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
		return n;
	}
}
