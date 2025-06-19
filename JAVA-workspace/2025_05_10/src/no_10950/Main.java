package no_10950;
//A+B - 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			PrintWriter pw = new PrintWriter(System.out);
		
			int num = Integer.parseInt(st.nextToken());
			for(int i = 0; i < num; i++) {
				st = new StringTokenizer(br.readLine());
				int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
				pw.println(result);
			}
			pw.flush();
			
		}catch (NumberFormatException e) {
			System.err.println("숫자를 입력하세요");
		}
	}
}
