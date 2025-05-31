package no_10101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] angle = new int[3];
		
		int total = 0;
		for(int i = 0; i < 3; i++) {
			angle[i] = Integer.parseInt(br.readLine());
			total += angle[i];
		}
		
		if(total != 180) {
			System.out.println("Error");
			return;
		}
		
		String res;
		Arrays.sort(angle);
		if(angle[0] == angle[1] || angle[1] == angle[2]) {
			if(angle[0] == angle[2]) {
				res = "Equilateral";
			}else {
				res = "Isosceles";
			}
		}else {
			res = "Scalene";
		}
		
		System.out.println(res);
	}
}

