package no_2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
		PrintWriter pw = new PrintWriter(System.out);
		
		for(int i = 1; i <= num; i++) {
			pw.append(" ".repeat(num-i))
				.append("*".repeat(i))
				.append("\n");
		}
		pw.flush();
	}
}
