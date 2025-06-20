package no_1120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] a = st.nextToken().toCharArray();
		char[] b = st.nextToken().toCharArray();
		
		int minDiff = 51;
		for(int i = 0; i <= b.length - a.length; i++) {
			int tempDiff;
			if(minDiff > (tempDiff = diff(a, b, i))) {
				minDiff = tempDiff; 
			}
		}
		
		System.out.println(minDiff);
	}
	
	static int diff(char[] a, char[] b, int idx) {
		int diff = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i+idx]) { diff++; }
		}
		return diff;
	}
}
