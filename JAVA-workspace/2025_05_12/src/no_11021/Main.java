package no_11021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int line = Integer.parseInt(br.readLine());
		int count = 1;
		for (int i = 0; i < line; i++) {
			bw.append("Case #").append(String.valueOf(count++)).append(": ");
			
			StringTokenizer st = new StringTokenizer(br.readLine());
//			bw.append(String.valueOf(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
			int result = 0;
			for (int j = 0; j < 2; j++) 
				result += Integer.parseInt(st.nextToken());
			bw.append(String.valueOf(result));
			bw.append('\n');
		}
		bw.flush();
	}
}
