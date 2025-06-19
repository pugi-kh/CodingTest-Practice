package no_10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String[] NX = br.readLine().trim().split(" ");
//		int N = Integer.parseInt(NX[0]);
		int X = Integer.parseInt(NX[1]);
		
		String[] input = br.readLine().trim().split(" ");
//		for(int i = 0; i < N; i++) {} 필요가 없을듯
		for(String token : input) {
//			if(Integer.parseInt(token) < X) bw.append(token).append(' ');
			if(Integer.parseInt(token) < X) sb.append(token).append(' ');
		}
		sb.delete(sb.length()-1, sb.length());
		System.out.println(sb);
		br.close();
	}
}
