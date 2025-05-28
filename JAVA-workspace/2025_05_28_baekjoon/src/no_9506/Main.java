package no_9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int input = 0;
		while((input = Integer.parseInt(br.readLine())) > 0) {
			sb.append(isPerfect(input)).append('\n');
		}
		System.out.println(sb.toString());
	}
	
	static String isPerfect(int input) {
		StringBuilder sb = new StringBuilder();
		int total = 0;
		sb.append(input).append(" = ");
		for(int a = 1; a <= input/2; a++) {
			if( input % a == 0) {
				total += a;
				sb.append(a).append(" + ");
			}
		}
		sb.delete(sb.length()-3, sb.length()-1);
		return total == input ? sb.toString() : input + " is NOT perfect.";
	}
}