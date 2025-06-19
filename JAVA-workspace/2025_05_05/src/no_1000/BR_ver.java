package no_1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BR_ver {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String line = br.readLine();
			br.close();
			StringTokenizer st = new StringTokenizer(line);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(a+b);
			
		}catch(NumberFormatException e) {
			e.getMessage();
		}catch(IOException e) {
			e.getMessage();
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
}
