package no_2753;
//윤년

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
		br.close();
		
		System.out.println(year % 4 == 0 && year % 100 != 0 ? 1 : year % 400 == 0 ? 1 : 0);
	}
}