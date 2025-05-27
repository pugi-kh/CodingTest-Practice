package no_5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n, m;
		String line;
		
		while(true) {
			line = br.readLine();
			if(line.equals("0 0")) break;
			n = Integer.parseInt(line.split(" ")[0]);
			m = Integer.parseInt(line.split(" ")[1]);
			boolean isInOrder = true;
			
			if(n > m) {
				int temp = n;
				n = m;
				m = temp;
				isInOrder = false;
			}
			
			if(m % n == 0) {
				sb.append(isInOrder ? "factor\n" : "multiple\n");
			}else {
				sb.append("neither\n");
			}
		}
		
		System.out.println(sb);
	}
}
