package no_10871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NX = br.readLine().trim().split(" ");
		int N = Integer.parseInt(NX[0]);
		int X = Integer.parseInt(NX[1]);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int token = Integer.parseInt(st.nextToken());
			if(token < X) bw.append(String.valueOf(token)).append(' ');
		}
		bw.flush();
		br.close();
	}
}
