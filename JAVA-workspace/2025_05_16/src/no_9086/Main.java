package no_9086;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		String line;
		
		for(int i = 0; i < n; i++) {
			line = br.readLine();
			bw.append(line.charAt(0));
			bw.append(line.charAt(line.length()-1));
			bw.append('\n');
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
