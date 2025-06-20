package no_19532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int a = nextInt(st), 
				b = nextInt(st), 
				c = nextInt(st), 
				d = nextInt(st), 
				e = nextInt(st), 
				f = nextInt(st);
		
		int x = (c*e - b*f) / (a*e - d*b);
		int y = b == 0 ? (f - d*x)/e : (c - a*x)/b;
		System.out.println(x + " " + y);
		
	}
	static int nextInt(StringTokenizer st) {
    return Integer.parseInt(st.nextToken());
	}
}
