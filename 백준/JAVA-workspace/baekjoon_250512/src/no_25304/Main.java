package no_25304;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = Integer.parseInt(br.readLine());
		int count = Integer.parseInt(br.readLine());
		
		int calc = 0;
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			calc += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		if(total == calc) {
//			bw.append("Yes");			
//		}else {
//			bw.append("No");
//		}
		
		bw.append(total == calc ? "Yes" : "No");
		bw.flush();
	}
}
