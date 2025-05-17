package no_10809;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] input = br.readLine().toCharArray();
		
		for(char a = 'a'; a <= 'z'; a++) {
			int index = -1;
			for(int i = 0; i < input.length; i++) {
				if(a == input[i]) { index = i; break;}
			}
			bw.append(String.valueOf(index)).append(' ');
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
