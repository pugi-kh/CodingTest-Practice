package no_21918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int len = read(st);
		int test = read(st);
		
		boolean[] lights = new boolean[len];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < len; i++) {
			lights[i] = (read(st) == 1);
		}
		
		for(int i = 0; i < test; i++) {
			st = new StringTokenizer(br.readLine());
			int func = read(st);
			switch(func) {
			case 1 :
				change(lights, read(st), read(st));
				break;
			case 2 :
				reverse(lights, read(st), read(st));
				break;
			case 3 :
				off(lights, read(st), read(st));
				break;
			case 4 :
				on(lights, read(st), read(st));
				break;
			}
		}
		
		StringBuilder stb = new StringBuilder();
		for(int i = 0; i < len; i++) {
			stb.append(lights[i] ? 1 : 0).append(" ");
		}
		System.out.println(stb);
	}
	
	static void change(boolean[] lights, int i, int s) {
		lights[i-1] = (s == 1);
	}
	static void reverse(boolean[] lights, int i, int j) {
		for(int idx = i-1; idx < j; idx++) {
			lights[idx] = !lights[idx];
		}
	}
	static void off(boolean[] lights, int i, int j) {
		for(int idx = i-1; idx < j; idx++) {
			lights[idx] = false;
		}
	}
	static void on(boolean[] lights, int i, int j) {
		for(int idx = i-1; idx < j; idx++) {
			lights[idx] = true;
		}
	}
	
	static int read(StringTokenizer st) {
		return Integer.parseInt(st.nextToken());
	}
}
