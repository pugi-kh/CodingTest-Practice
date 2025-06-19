package no_10871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NX = br.readLine().trim().split(" ");
		int X = Integer.parseInt(NX[1]);
		
		String[] input = br.readLine().trim().split(" ");
		for(String token : input) {
			if(Integer.parseInt(token) < X) bw.append(token).append(' ');
		}
		bw.flush();
		br.close();
	}
}
