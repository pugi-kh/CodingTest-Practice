package no_2739;
//구구단

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		PrintWriter pw = new PrintWriter(System.out);
		
		try{
			int dan = Integer.parseInt(st.nextToken());

			for(int i = 1; i < 10; i++) {
				pw.printf("%d * %d = %d\n", dan, i, dan*i);
			}
			pw.flush();
			
		}catch(NumberFormatException e){
			System.err.println("숫자 입력...");
		}
		
	}
}
