package no_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append(br.readLine());
		
		String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		int len = 0;
		int idx = -1;
		
		for(String str : croatian) {
			while((idx = sb.indexOf(str)) >= 0) {
				len++;
				sb.replace(idx, idx + str.length(), "*");
			}
		}
		
		while((idx = sb.indexOf("*")) >= 0) {
			sb.delete(idx, idx+1);
		}
		
		len += sb.length();
		
		System.out.println(len);
	}
}
