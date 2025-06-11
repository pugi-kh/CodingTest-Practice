package no_2587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] list = new int[5];
		int avg = 0;
		for(int i = 0; i < list.length; i++) {
			list[i] = Integer.parseInt(br.readLine());
			avg += list[i];
		}
		avg /= list.length;
		Arrays.sort(list);
		
		System.out.println(avg);
		System.out.println(list[2]);
	}
}
