package no_2525;
//오븐 시계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		br.close();
		int runTime = Integer.parseInt(st.nextToken());
		
		min = min + (hour*60) + runTime;
		hour = (min / 60) % 24;
		min %= 60;
		
		System.out.println(hour + " " + min);
	}
}
