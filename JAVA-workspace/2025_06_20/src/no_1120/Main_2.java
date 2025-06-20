package no_1120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] a = st.nextToken().toCharArray();
		char[] b = st.nextToken().toCharArray();
		
		int minDiff = 51;
		for(int i = 0; i <= b.length - a.length; i++) {
			int tempDiff = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[j] != b[j+i]) { tempDiff++; }
			}
			minDiff = Math.min(tempDiff, minDiff);
		}
		System.out.println(minDiff);
	}
}
