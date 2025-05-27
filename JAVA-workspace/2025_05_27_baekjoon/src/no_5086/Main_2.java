package no_5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		double n, m;
		String line;
		
		while(true) {
			line = br.readLine();
			if(line.equals("0 0")) break;
			n = Double.parseDouble(line.split(" ")[0]);
			m = Double.parseDouble(line.split(" ")[1]);
			
			if(n % m == 0.0) {
				sb.append("multiple\n");
			}else if(m % n == 0.0) {
				sb.append("factor\n");
			}else {
				sb.append("neither\n");
			}
		}
		
		System.out.println(sb);
	}
}
