package no_10951;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int result;
		String line;
		String[] token;
		while((line = br.readLine()) != null && !line.trim().isEmpty()) {
			token = line.trim().split(" ");
			result = Integer.parseInt(token[0]) + Integer.parseInt(token[1]);
			bw.append(String.valueOf(result)).append('\n');
		}
		bw.flush();
		br.close();
	}
}
